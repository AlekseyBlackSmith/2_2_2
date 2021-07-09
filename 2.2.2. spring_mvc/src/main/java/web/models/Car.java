package web.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private static int CAR_COUNT = 0;

    private int id;
    private String series;
    private int model;

    public Car(String series, int model) {
        this.id = ++CAR_COUNT;
        this.series = series;
        this.model = model;
    }
}
