package m16_methods_part2;

public class ReturnMethods {
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = addNumbers(a, b);
        System.out.println("Result is = " + result);
        System.out.println();
        System.out.println((addNumbers(100, 200)));
    }
}
