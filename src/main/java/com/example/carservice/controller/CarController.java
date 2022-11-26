package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService service;
    private final CarRepository carRepository;

    public CarController(CarService service, CarRepository carRepository) {
        this.service = service;
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getCars() {
        return service.getCars();
    }

    @PostMapping("add")
    public Car addNewCar(){
        return service.addCar();
    }

}
