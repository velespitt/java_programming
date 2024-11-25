package m16_method_overloading;

public class MethodOverloadingIntro {
    public static void displayValue(int a){
        System.out.println("First");
    }
    public static void displayValue(double a){
        System.out.println("Second");
    }
    public static void displayValue(int a, double b){
        System.out.println("Third");
    }
    public static void displayValue(double a, int b){
        System.out.println("Fourth");
    }
    public static void main(String[] args) {
        displayValue(1D,2);
        displayValue(1);
        displayValue(1D);
        displayValue(1,1.0);


    }
}
