package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("car-list")
    public List<Car> getCars() {
        return service.getCars();
    }

}
