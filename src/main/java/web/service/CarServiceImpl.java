package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("Chery", "Tiggo", 2024));
        carList.add(new Car("Haval", "Dargo", 2023));
        carList.add(new Car("Zeekr", "001", 2021));
        carList.add(new Car("Geely", "Monjaro", 2024));
        carList.add(new Car("Jetour", "T02", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}