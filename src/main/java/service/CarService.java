package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    List<Car> getCarCount(Integer count);
}
