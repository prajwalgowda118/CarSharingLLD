package com.scaler.carsharing.carsharinglld.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class User extends BaseModel {

    private String name;
    private String email;
    private String password;
    private int age;
    private String gender;
    private double Rating;

    @Enumerated(EnumType.ORDINAL)
    private UserType userType;

}
