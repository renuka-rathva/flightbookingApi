package com.flightbooking.flightbookingapi.entity;

import jakarta.persistence.OneToOne;

import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Passenger passenger;

    @OneToOne
    private Flight flight;

    private Timestamp created;

}
