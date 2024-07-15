package web.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Chery", "Tiggo", 2024));
        carList.add(new Car("Haval", "Dargo", 2023));
        carList.add(new Car("Zeekr", "001", 2021));
        carList.add(new Car("Geely", "Monjaro", 2024));
        carList.add(new Car("Jetour", "T02", 2022));

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
