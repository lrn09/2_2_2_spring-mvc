package web.models;
public class Car {
    private String brand;
    private String modelName;
    private int manufactureYear;

    public Car() {
    }

    public Car(String brand, String modelName, int manufactureYear) {
        this.brand = brand;
        this.modelName = modelName;
        this.manufactureYear = manufactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
