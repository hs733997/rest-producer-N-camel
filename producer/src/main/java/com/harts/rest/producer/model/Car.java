package com.harts.rest.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {

    private String carName;
    private String carModel;
    private double price;
    private boolean carAvailable;
}
