package com.example.m223_project;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(nullable = false)
    Date startTime;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(nullable = false)
    Date endTime;

    private boolean morning;
    private boolean afternoon;
    private boolean state;
    private String comment;

    public Booking(int id, Date startTime, Date endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
