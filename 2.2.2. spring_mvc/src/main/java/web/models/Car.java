package web.models;

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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", model=" + model +
                '}';
    }
}
