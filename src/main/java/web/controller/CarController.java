package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String cars(Model model) {
        List<Car> cars = new ArrayList<>();
        Collections.addAll(cars,
                new Car("BMW", 2134, "Black"),
                new Car("Chevrolet", 1716,"Red"),
                new Car("Toyota", 976,"Green"),
                new Car("Suzuki", 1020, "White"),
                new Car("Lada", 2107,"Pink"));
    return "cars";
    }
}
