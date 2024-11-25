package m11_operators_part1;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int toplama = 10+5;
        System.out.println("toplama: " + toplama);

        System.out.println(10+5);

        System.out.println(10-5);

        System.out.println(10/5);

        System.out.println(10*3);

        System.out.println(10%3);

        System.out.println(10/4d);

        System.out.println(10%4);

        //Remainder bulmak için 10 / 4 = 2.5
        //Algebra: 10 - (4*2) ==> 2

        System.out.println(10 % 2);

        //Son dört haneyi bulmak için kullanılabilir.

        int num = 78051120;
        int lastDigit = num%10000;

        System.out.println("Last digit of SSN: " +lastDigit);
    }
}
