package Methodover;
class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(this.brand + " " + this.model + " " + this.year + " is driving.");
    }
}
class Car extends Vehicle {
    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

     void honk() {
     System.out.println(this.brand + " " + this.model + " " + this.year + " in " + this.color + " is honk the horn.");
    }
}

public class Eg2 {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang", 2022, "Red");
        myCar.drive();
        myCar.honk();
    }

}
