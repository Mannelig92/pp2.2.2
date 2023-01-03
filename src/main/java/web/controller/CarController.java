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

    /*
    ������ ������� ��� ������ /cars
    @RequestParam ��� ����� ����� ������ - /cars?count=�����
    Model - ��� ������ ������ � �������
     */
    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        ArrayList<Car> cars = new ArrayList<>();
        Collections.addAll(cars,
                new Car("BMW", 2134, "Black"),
                new Car("Chevrolet", 1716, "Red"),
                new Car("Toyota", 976, "Green"),
                new Car("Suzuki", 1020, "White"),
                new Car("Lada", 2107, "Pink"));
        //����������� ������� ��� ������
        if (count < 0) count = 0;
        if (count > 5) count = 5;

        List<Car> limitCars = csm.countOfCars(cars, count); //�������� ������������� ������ �� CarServiceImpl
        //��������� � ������, � ���������� limitCars, ������� ���������� � cars.html ��� ������ � ��� ������ limitCars
        model.addAttribute("limitCars", limitCars);
        return "cars"; //���������� ��� html ����� ��������
    }
}
