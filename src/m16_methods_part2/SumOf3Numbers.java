package m16_methods_part2;

public class SumOf3Numbers {

    public static void sumOfNumbers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Total is " + sum);
    }

    public static void main(String[] args) {
        int num1 = 5;
        byte num2 = 10;
        long num3 = 20;
        sumOfNumbers(num1, num2, (int) num3);
    }
}
