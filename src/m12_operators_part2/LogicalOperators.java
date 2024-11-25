package m12_operators_part2;

public class LogicalOperators {
    public static void main(String[] args) {

        int num = 0;

        System.out.println((num < 1) & (num == 0)); // true & true -> true
        System.out.println((num < 1) && (num == 0)); // true && true -> true
        System.out.println((num == 0) && (num > 2)); // true && false -> false

        System.out.println((num == 2) & (num > 1)); // false & false -> false
        System.out.println((num > 1) && (num == 0)); // false && --- -> false
        System.out.println((num == 2) && (num > 1)); // false && --- -> false

        int a = 100;
        System.out.println((a > 0) & (a < 200));
        //true & true ==> true
        System.out.println((a == 20) & (a > 50));
        //false & true false
        System.out.println((a < 1000) && (a > -100));
        //true && true ==> true
        System.out.println((a > 100) && (a > 20));
        //false && --- evaluates then false

        int num1 = 0;
        System.out.println((num1 < 1) | (num1 == 0)); // true & true -> true
        System.out.println((num1 < 1) || (num1 == 0)); // true && --- -> true
        System.out.println((num1 == 0) || (num1 > 2)); // true && --- -> true

        System.out.println((num1 == 2) | (num1 > 1)); // false & false -> false
        System.out.println((num1 > 1) || (num1 == 0)); // false && true -> true
        System.out.println((num1 == 2) || (num1 > 1)); // false && false -> false
    }
}
