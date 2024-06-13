package com.acciojob.GetRide.model;

import com.acciojob.GetRide.Enum.Gender;
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
@Table(name="customer_details")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "customer_name")
    private String name;
    @Column(name = "customer_age")
    private int age;
    @Column(name = "customer_email", nullable = false, unique = true)
    private String emailId;
    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gender")
    private Gender gender;
}