package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")   // ✅ FIX HERE
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private boolean isPremium;

    // Getters and Setters
}