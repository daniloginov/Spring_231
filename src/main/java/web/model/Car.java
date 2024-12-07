package web.model;

import java.util.Objects;

public class Car {
    private final String id;
    private final String model;
    private final String series;
    public Car(String id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, series);
    }
}