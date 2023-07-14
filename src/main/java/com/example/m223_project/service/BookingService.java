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

    public Booking getBookingById(int id) {
        return bookingRepository.findById(id).get();
    }

    public Booking updateBooking(Booking booking){
        return bookingRepository.saveAndFlush(booking);
    }

    public void deleteBooking(int bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    public void deleteAll(){
        bookingRepository.deleteAll();
    }


}
