package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("serie1", 1));
        cars.add(new Car("serie2", 2));
        cars.add(new Car("serie3", 3));
        cars.add(new Car("serie4", 4));
        cars.add(new Car("serie5", 5));
        cars.add(new Car("serie6", 6));
        cars.add(new Car("serie7", 7));
    }

    public static List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        if (count > 0 && count <= cars.size()) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }

        return null;
    }

}
