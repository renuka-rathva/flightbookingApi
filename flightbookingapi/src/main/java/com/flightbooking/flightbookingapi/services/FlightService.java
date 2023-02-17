package com.flightbooking.flightbookingapi.services;

import com.flightbooking.flightbookingapi.entity.Flight;
import com.flightbooking.flightbookingapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> findFlights(String from, String to, Date departureDate ) {
        List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
        return flights;
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
