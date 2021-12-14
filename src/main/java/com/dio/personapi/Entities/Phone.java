package com.dio.personapi.Entities;

import com.dio.personapi.Enums.PhoneType;

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = true, unique = true)
    private String number;


}
