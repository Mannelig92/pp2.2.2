package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarController {
    private CarServiceImpl csm = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String cars(@RequestParam("count") int count, Model model) {
        ArrayList<Car> cars = new ArrayList<>();
        Collections.addAll(cars,
                new Car("BMW", 2134, "Black"),
                new Car("Chevrolet", 1716, "Red"),
                new Car("Toyota", 976, "Green"),
                new Car("Suzuki", 1020, "White"),
                new Car("Lada", 2107, "Pink"));

        int countOfCars = count;
        if (countOfCars < 0) countOfCars = 0;
        if (countOfCars > cars.size()) countOfCars = cars.size();

        List<Car> limitCars = csm.countOfCars(cars, countOfCars);
        model.addAttribute("limitCars", limitCars);
        return "cars"; //Возвращаем имя html файла страницы
    }
}
