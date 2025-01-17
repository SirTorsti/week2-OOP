package week2;

public class Car {
    String brand;
    String model;
    int speed = 0;
    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void status() {
        System.out.print("Auto: " + this.brand + ", " + this.model + " nopeus: " + this.speed + " km/h\n");
    }

    public int accelerate(int x) {
        this.speed += x;
        return this.speed;
    }

    public int decelerate(int y) {
        this.speed -= y;
        return this.speed;
    }
}
