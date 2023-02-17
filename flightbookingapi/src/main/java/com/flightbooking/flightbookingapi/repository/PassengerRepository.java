package com.flightbooking.flightbookingapi.repository;

import com.flightbooking.flightbookingapi.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
