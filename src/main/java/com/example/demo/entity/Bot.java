package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Bot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String personaDescription;

    // Getters and Setters
}