package m16_methods_part1;

public class MethodsIntro {
    public static void main(String[] args) {
        System.out.println("Test Started");
        eat();
        walk();
        play();//Bu şekilde de çağırabiliriz özellikle dış bir classta ise şart.
        System.out.println("Test Completed");
    }

    public static  void eat(){
        System.out.println("I am eating");
    }

    public static void walk(){
        System.out.println("I am Walking");
    }
    public static void play(){
        walk();
        System.out.println("I am playing");
    }
}
