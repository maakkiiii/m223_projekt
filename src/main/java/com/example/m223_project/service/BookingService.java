package com.example.m223_project.service;

import com.example.m223_project.Booking;
import com.example.m223_project.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.List;


public class BookingService {
    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking (Booking booking){
        return bookingRepository.saveAndFlush(booking);
    }

    public List<Booking> findAll(){
        return bookingRepository.findAll();
    }

    public void deleteAll(){
        bookingRepository.deleteAll();
    }
}
