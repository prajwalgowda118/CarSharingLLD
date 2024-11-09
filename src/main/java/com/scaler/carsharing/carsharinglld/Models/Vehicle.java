package com.scaler.carsharing.carsharinglld.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle extends BaseModel{

    private String name;
    private String number;

    @ManyToOne
    private Driver owner;

    @Enumerated(EnumType.ORDINAL)
    private VehicleType vehicleType;

    @Enumerated(EnumType.ORDINAL)
    private VehicleAvailability vehicleAvailability;



}
