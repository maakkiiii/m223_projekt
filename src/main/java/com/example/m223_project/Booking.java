package com.example.m223_project;

import java.util.Date;

public class Booking {
    int id;
    Date checkIn;
    Date checkOut;

    public Booking(int id, Date checkIn, Date checkOut) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}
