package m18_user_input_scanner;

import java.util.Scanner;

public class CharAndString {

    public static void main(String[] args) {

//Scanner tanımlandı
        Scanner input = new Scanner(System.in);

//Girdi istendi
        System.out.println("Enter a character:");

//Girdi alındı

//Char olduğu için sonunda .charAt(0) ekliyoruz. 0 ilk sayıyı alsın demek
        char character = input.next().charAt(0);
//Girilen karakter yazdırıldı
        System.out.println("You have entered: " + character);
//Girdi istendi
        System.out.println("Would you like to continue?");
//Girdi alındı
        String acceptance = input.next();
//Girdi alınmasını kapattık
        input.close();
//Girdi yazıldı

        System.out.println("You have entered: " + acceptance);

    }
}
