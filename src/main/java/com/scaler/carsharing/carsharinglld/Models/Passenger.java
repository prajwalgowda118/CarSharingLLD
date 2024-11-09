package com.scaler.carsharing.carsharinglld.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger extends User{

    @ManyToMany(mappedBy = "passengers")
    List<Ride> rides;
}
