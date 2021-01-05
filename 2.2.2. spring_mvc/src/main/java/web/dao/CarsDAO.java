package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("serie1", 1));
        cars.add(new Car("serie2", 2));
        cars.add(new Car("serie3", 3));
        cars.add(new Car("serie4", 4));
        cars.add(new Car("serie5", 5));
    }

    public static List<Car> getAllCars() {
        return cars;
    }

    public static List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else if (count > 0 && count <= cars.size()) {
            List<Car> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                list.add(cars.get(i));
            }
            return list;
        } else return null;
    }

}
