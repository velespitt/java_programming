package m17_class_and_object;

public class CarClient {
    public static void main(String[] args) {
        //Objeyi oluşturduk.

        Car car = new Car();

        //Objenin fieldlarına erişim. Fieldların gerçeği Car classında.

        car.maker = "Toyota";
        car.model = "Corolla";
        car.currentSpeed = 65;
        car.color = "Red";

        //Methodları çağırarak gerekli aksiyonları gerçekleştirdik.

        car.printCarInfo();
        car.drive();
        car.showCurrentSpeed(70);
        car.accelerate(65);
        car.showCurrentSpeed(70);
    }
}
