package m18_user_input_scanner;

import java.util.Scanner;

public class ScannerIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");

        byte firstNum = input.nextByte();

        System.out.println("Enter the second number:");

        short secondNum = input.nextShort();

        System.out.println("Enter the third number:");

        int thirdNum = input.nextInt();

        System.out.println("Enter the fourth number:");

        long fourthNum = input.nextLong();

        input.close();

        System.out.println();
        System.out.println("First Num = " + firstNum);
        System.out.println("Second Num = " + secondNum);
        System.out.println("Third Num = " + thirdNum);
        System.out.println("Fourth Num = " + fourthNum);



    }
}
