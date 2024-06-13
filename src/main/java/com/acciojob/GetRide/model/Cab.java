package com.acciojob.GetRide.model;

import com.acciojob.GetRide.Enum.CabType;
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
@Table(name="cab_details")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cabNumber;
    @Enumerated(EnumType.STRING)
    private CabType cabType;
    private double farePerKm;
    private boolean booked;
}
