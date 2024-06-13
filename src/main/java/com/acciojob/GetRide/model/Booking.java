package com.acciojob.GetRide.model;

import com.acciojob.GetRide.Enum.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="booking_details")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookingId;
    private String pickup;
    private String destination;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    private double totalDistance;
    private double totalFare;
    @CreationTimestamp
    private Date bookedAt;
}
