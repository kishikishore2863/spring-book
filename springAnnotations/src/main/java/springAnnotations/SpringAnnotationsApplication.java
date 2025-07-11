package springAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		Class<? extends HomeController> HomeController;
//		HomeController homeController =context.getBean(HomeController.class);
//		CachingMovieLister cachingMovieLister = context.getBean(CachingMovieLister.class);
		int count =context.getBeanDefinitionCount();
		System.out.println(count);
		String[] str =  context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(str));


	}

}
