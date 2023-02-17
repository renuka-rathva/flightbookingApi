package com.flightbooking.flightbookingapi.services;

import com.flightbooking.flightbookingapi.entity.Flight;
import com.flightbooking.flightbookingapi.entity.Passenger;
import com.flightbooking.flightbookingapi.entity.Reservation;
import com.flightbooking.flightbookingapi.entity.User;
import com.flightbooking.flightbookingapi.repository.FlightRepository;
import com.flightbooking.flightbookingapi.repository.PassengerRepository;
import com.flightbooking.flightbookingapi.repository.ReservationRepository;
import com.flightbooking.flightbookingapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;
    public Reservation bookFlight(Reservation reservation) {
        Reservation res = null;

        String flightNumber = reservation.getFlight().getFlightNumber();
        Flight flight = flightRepository.findByFlightNumber(flightNumber);

        Passenger passenger = reservation.getPassenger();
        passengerRepository.save(passenger);

        reservation.setPassenger(passenger);
        reservation.setFlight(flight);

        res = reservationRepository.save(reservation);
        return res;
    }
}
