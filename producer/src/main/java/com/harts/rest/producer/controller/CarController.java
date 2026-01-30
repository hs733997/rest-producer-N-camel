package com.harts.rest.producer.controller;

import com.harts.rest.producer.model.Car;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {
    @GetMapping("/car-details")
    private Car getCar(){
        return new Car("hundai","i20",900000,true);
    }
}
