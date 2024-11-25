package m17_class_and_object;

public class Dog {
    //Instance variables
    public String name;
    public String breed;
    public int age;
    public String color;

    public void bark() {//Void var classa değil objeye bağlı çünkü

        System.out.println(name + " is barking");
    }

    public void eat() {//Void var classa değil objeye bağlı çünkü

        System.out.println(name + " is eating");
    }

    public void sleep() {//Void var classa değil objeye bağlı çünkü

        System.out.println(name + " is sleeping");
    }

    public String toString() {//Hashcode change
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
