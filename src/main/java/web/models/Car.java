package web.models;


public class Car {
    private final String model;
    private final int series;
    private final int vinNumber;

    public Car(String model, int series, int vinNumber) {
        this.model = model;
        this.series = series;
        this.vinNumber = vinNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", vinNumber=" + vinNumber +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getVinNumber() {
        return vinNumber;
    }
}
