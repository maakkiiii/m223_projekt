package com.example.m223_project.controller;

import com.example.m223_project.Booking;
import com.example.m223_project.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Booking> getAllBookings(){
        return bookingService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }
}
