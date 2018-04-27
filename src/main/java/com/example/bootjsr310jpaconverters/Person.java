package com.example.bootjsr310jpaconverters;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Patrik.Mihalcin on 27.04.2018
 */
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

//    @Column(name = "ACTIVATED_AT")
//    private LocalDateTime activatedAt;

}
