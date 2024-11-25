package m16_methods_part2;

public class PassByValue {
    public static void main(String[] args) {

        int num = 5;
        System.out.println("Before calling the method: " + num);
        modifyValue(num);
        System.out.println("After calling the method: " + num);

    }

    public static void modifyValue(int value) {

        System.out.println("Before modifying the value: " + value);
        value = 10;
        System.out.println("Inside the method: " + value);

    }
}
