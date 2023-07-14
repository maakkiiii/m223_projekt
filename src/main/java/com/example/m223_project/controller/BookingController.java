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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Booking getBookingById(@PathVariable int id) {
        return bookingService.getBookingById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Booking updateBooking(@RequestBody Booking booking){
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBooking(@PathVariable int id) {
        bookingService.deleteBooking(id);
    }

}
