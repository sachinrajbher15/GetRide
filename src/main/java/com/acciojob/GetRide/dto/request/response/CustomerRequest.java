package com.acciojob.GetRide.dto.request.response;

import com.acciojob.GetRide.Enum.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerRequest {
    private String name;
    private int age;
    private String emailId;
    private Gender gender;
}