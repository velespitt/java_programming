package m17_class_and_object;

public class DogClient {

    public static void main(String[] args) {

        //Obje tanımladık.
        Dog dog = new Dog();

        //Obje fieldları yani özellikleri.
        dog.name = "Debbie";
        dog.breed = "Husky";
        dog.age = 2;
        dog.color = "Brown";
        //Objeleri yazdırdık.

        System.out.println("Name: " + dog.name);
        System.out.println("Breed: " + dog.breed);
        System.out.println("Age: " + dog.age);
        System.out.println("Color: " + dog.color);

        //Objenin hangi işlemleri gerçekleştireceğini belirledik.
        dog.bark();
        dog.eat();
        dog.sleep();
        //Sadece isimle çağırınca hangi değerler dönsün istiyorsak Dog Classında toString() kullandık.
        System.out.println(dog);

        Dog dog2 = new Dog();
        dog2.name = "Lessy";
        dog2.breed = "Corgi";
        dog2.age = 1;
        dog2.color = "Red";

        System.out.println(dog2);
        Dog dog3 = new Dog();
    }
}
