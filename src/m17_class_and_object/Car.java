package m17_class_and_object;

public class Car {
    //Fieldlar.

    public String maker;
    public String model;
    public String color;
    public int currentSpeed;

    //Methodlar

    public void printCarInfo() {
        System.out.println("Maker\t\t: " + maker);
        System.out.println("Model\t\t: " + model);
        System.out.println("Current Speed\t\t: " + currentSpeed);
        System.out.println("Color\t\t: " + color);

    }

    public void drive() {
        System.out.println(maker + " " + model + " is driving...");
    }

    public void showCurrentSpeed(int speedLimit) {
        System.out.println(currentSpeed <= 70 ? maker + " is driving at " + currentSpeed + " ,following the speed limit " + speedLimit : maker + " is driving at " + currentSpeed + " , over the speed limit " + speedLimit);
    }

    public void accelerate(int currentSpeed) {
        this.currentSpeed += 10;
        System.out.println("Accelerating by 10");
    }
}
