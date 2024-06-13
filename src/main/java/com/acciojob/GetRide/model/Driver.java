package com.acciojob.GetRide.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="driver_details")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "driver_name")
    private String name;
    @Column(name = "driver_age")
    private int age;
    @Column(unique = true, nullable = false)
    private String drivingLicenseNumber;
    @Column(unique = true, nullable = false, name = "driver_mobile")
    private long mobileNo;
}
