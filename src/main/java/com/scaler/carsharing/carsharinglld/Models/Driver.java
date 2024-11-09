package com.scaler.carsharing.carsharinglld.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends User {

    @OneToMany(mappedBy = "owner")
    List<Vehicle> vehicles;

    @OneToMany(mappedBy = "driver")
    List<Ride> rides;
}
