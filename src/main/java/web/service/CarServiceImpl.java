package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("1", "model1", "series1"));
        cars.add(new Car("2", "model2", "series2"));
        cars.add(new Car("3", "model3", "series3"));
        cars.add(new Car("4", "model4", "series4"));
        cars.add(new Car("5", "model5", "series5"));
    }
    public List<Car> getCars() {
        return cars;
    }
    @Override
    public List<Car> limitCars(List<Car> cars, int limit) {
        if (limit > 5) {
            return cars;
        }
        return cars.subList(0, limit);
    }
}