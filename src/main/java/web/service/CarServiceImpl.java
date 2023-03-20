package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        this.cars = createCars();
    }

    private List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2015));
        cars.add(new Car("Honda", "Civic", 2017));
        cars.add(new Car("Ford", "Mustang", 2019));
        cars.add(new Car("Chevrolet", "Corvette", 2020));
        cars.add(new Car("BMW", "X5", 2021));
        return cars;
    }

    @Override
    public List<Car> getAllCars() {
        return this.cars;
    }

    @Override
    public List<Car> getCarByNumber(List<Car> cars, int number) {
        return cars.subList(0, number);
    }


}
