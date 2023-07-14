package com.example.m223_project.repository;

import com.example.m223_project.Booking;
import com.example.m223_project.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
