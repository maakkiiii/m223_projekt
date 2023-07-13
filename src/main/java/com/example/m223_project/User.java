package com.example.m223_project;

public class User {
    int id;
    String name;
    String lastName;
    boolean isAdmin;

    public User(int id, String name, String lastName, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }
}
