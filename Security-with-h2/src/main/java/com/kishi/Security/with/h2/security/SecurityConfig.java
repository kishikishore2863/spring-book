package com.kishi.Security.with.h2.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated());
        http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        http.headers(headers->headers.frameOptions(frameOptions->frameOptions.sameOrigin())); //frame enabling
        http.csrf(csrf ->csrf.disable());
        return http.build();
    }

   @Bean
    public UserDetailsService userDetailsService(){
       UserDetails user = User.withUsername("user")
               .password("{noop}userpass")
               .roles("USER")
               .build();
       UserDetails admin = User.withUsername("admin")
               .password("{noop}adminpass")
               .roles("ADMIN")
               .build();

       JdbcUserDetailsManager userDetailsManager
               =new JdbcUserDetailsManager(dataSource);


       userDetailsManager.createUser(user);
       userDetailsManager.createUser(admin);
//       return new InMemoryUserDetailsManager(user);
       return userDetailsManager;
   }

}
