package m16_methods_part2;

public class PassByValueExtended {
    public static void main(String[] args) {
        int a =5;
        displayCube(a);
        System.out.println("a = " + a);
    }

    public static void displayCube(int num) {
        System.out.println("The number is: " + num);
        num *= num * num;
        System.out.println("Cube is: " + num);
    }
}
