package com.flightbooking.flightbookingapi.controller;
import com.flightbooking.flightbookingapi.entity.Flight;
import com.flightbooking.flightbookingapi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/flightreservation")
public class FlightController {
    @Autowired
    FlightService flightService;

    // Enable for the Admin
    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }

    @GetMapping("/findflights")
    public List<Flight> findFlights(@RequestParam("arrivalCity") String arrivalCity,
                                    @RequestParam("departureCity") String departureCity,
                                    @RequestParam("departureDate")
                                    @DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate) {
        return flightService.findFlights(departureCity, arrivalCity, departureDate);
    }
}
