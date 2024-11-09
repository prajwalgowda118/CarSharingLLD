package com.scaler.carsharing.carsharinglld.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ride extends BaseModel{

    private String source;
    private String destination;
    private int availableSeats;
    private double price;

    @ManyToOne
    private Driver driver;

    @ManyToMany
    private List<Passenger> passengers;

    @ManyToOne
    private Vehicle vehicle;
}
