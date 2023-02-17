package com.flightbooking.flightbookingapi.controller;

import com.flightbooking.flightbookingapi.entity.Reservation;
import com.flightbooking.flightbookingapi.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/flightreservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @PostMapping("/bookflight")
    public Reservation bookFlight(@RequestBody Reservation reservation) {
        return reservationService.bookFlight(reservation);
    }
}
