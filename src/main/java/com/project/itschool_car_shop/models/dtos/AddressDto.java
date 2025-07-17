package com.project.itschool_car_shop.models.dtos;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class AddressDto implements Serializable {
    private String street;
    private String city;
    private String country;
}
