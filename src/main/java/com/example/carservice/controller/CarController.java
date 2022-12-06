package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service, CarRepository carRepository) {
        this.service = service;
    }

    @GetMapping
    public List<Car> get() {
        return service.getAll();
    }

    @PutMapping
    public Car update() {
        return service.update();
    }
}
