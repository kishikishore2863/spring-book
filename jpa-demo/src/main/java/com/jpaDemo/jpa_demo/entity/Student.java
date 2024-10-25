package com.jpaDemo.jpa_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "")
public class Student {
    @Id
    private Long StudentId ;

    private String firstName;

    private String lastName;

    private String email;

    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;





}
