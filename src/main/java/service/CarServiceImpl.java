package service;

import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> countOfCars(List<Car> list, int numOfCars) { //ограничиваем вывод нужным числом
        return list.stream()
                .limit(numOfCars)
                .toList();
    }
}
