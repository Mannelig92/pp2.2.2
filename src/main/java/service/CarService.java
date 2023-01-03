package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> countOfCars(List<Car> list, int numOfCars);
}
