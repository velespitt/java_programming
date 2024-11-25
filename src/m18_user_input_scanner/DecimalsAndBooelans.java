package m18_user_input_scanner;

import java.util.Scanner;

public class DecimalsAndBooelans {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first num =");

        float firstNum = input.nextFloat();

        System.out.println("Enter the second num=");

        float secondNum = input.nextFloat();

        System.out.println("True/False =");

        boolean trueFalse = input.nextBoolean();

        input.close();


        System.out.println("num1 = " + firstNum);
        System.out.println("num2 = " + secondNum);
        System.out.println("r = " + trueFalse);

    }
}
