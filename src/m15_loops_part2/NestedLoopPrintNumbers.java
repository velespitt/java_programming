package m15_loops_part2;

public class NestedLoopPrintNumbers {
    public static void main(String[] args) {
        /*
        Write a program that prints the number triangle which starts from
1 and ends at given number.
Example:
Input: 5
Output:
1
12
123
1234
12345
         */

        for (int i = 1; i <= 5; i++) {//Satırları 5 defa yazdıracak
            for (int j = 1; j <= i; j++) {// i kadar arttıracak
                System.out.print(j + " ");//1 yazıp boşluk bırakacak ikinci döngüsünde 2 yazıp boşluk bırakacak ikinci döngüye girmeden println çalışıyor o yüzden alt satıra geçiyor
            }
            System.out.println();//Farklı satıra geçecek iç döngü bitince
        }
        //İç döngü bittiğinde alttaki kod satırını çalıştırıp burada System.out.println(); üstteki döngüye gidiyor.
    }
}
