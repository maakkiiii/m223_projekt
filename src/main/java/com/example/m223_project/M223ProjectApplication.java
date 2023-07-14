package com.example.m223_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Date;

@SpringBootApplication
public class M223ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(M223ProjectApplication.class, args);

        User user1 = new User(1, "Walter", "Heinrich", "woistwalter@found.ch","findhim232", true);
        User user2 = new User(2, "Rata", "Tanata", "ratatanata@bluewin.ch", "saperlotnomale", false);
        User user3 = new User(3, "Edgar Allen", "Poe", "edgarallenpoe@writer.com", "booksarecool", false);

        Booking booking1 = new Booking(1,new Date(2023, 7, 4), new Date(2023, 7, 5));
        Booking booking2 = new Booking(2,new Date(2023, 8, 4), new Date(2024, 1, 5));
        Booking booking3 = new Booking(3,new Date(2024, 2, 28), new Date(2024, 3, 1));
    }

}
