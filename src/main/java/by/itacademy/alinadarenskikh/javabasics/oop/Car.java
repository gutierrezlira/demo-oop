package by.itacademy.alinadarenskikh.javabasics.oop;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int yearOfProduction;
    private String color;
    private  double price;
    private String licensePlate;

    public Car() {
    }

    public Car(int id, String brand, String model, int yearOfProduction, String color, double price, String licensePlate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.price = price;
        this.licensePlate = licensePlate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ",\n brand='" + brand + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \nyearOfProduction=" + yearOfProduction +
                ", \ncolor='" + color + '\'' +
                ", \nprice=" + price +
                ", \nlicensePlate='" + licensePlate + '\'' +
                '}';
    }
}
