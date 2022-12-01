package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service, CarRepository carRepository) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getCars() {
        return service.getAll();
    }

    @PutMapping
    public Car updateCars() {
        return service.update();
    }
}
