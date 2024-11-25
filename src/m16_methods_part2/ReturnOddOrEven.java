package m16_methods_part2;

public class ReturnOddOrEven {
    /*
    Int
    public static int OddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else System.out.println(num + " is odd number");
        return num;
    }

    public static void main(String[] args) {

        OddOrEven(45);
    }
     */
    public static String returnOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else return "Odd";
    }

    public static void main(String[] args) {
        String s1 = returnOddOrEven(100);
        System.out.println(s1);
    }

}
