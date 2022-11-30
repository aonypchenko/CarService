package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.model.EngineType;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository repository) {
        this.carRepository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public void removeById(Long id) {
        carRepository.deleteCarById(id);
    }
}
