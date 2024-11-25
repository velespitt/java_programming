package m18_user_input_scanner;

import java.util.Scanner;

public class NextAndNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = input.nextInt(); //20
        input.nextLine(); //Enter
        System.out.println("Enter your full name:");

        String fullName = input.nextLine();
        input.close();
        System.out.println("Age = " + age);
        System.out.println("Full Name = " + fullName);
    }
}
