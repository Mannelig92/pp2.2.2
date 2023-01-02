package service;

import model.Car;

import java.util.List;

public interface CarService {
    int countOfCars(List<Car> list, int numOfCars);
}
