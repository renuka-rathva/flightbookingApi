package com.flightbooking.flightbookingapi.repository;


import com.flightbooking.flightbookingapi.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
