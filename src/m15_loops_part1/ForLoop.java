package m15_loops_part1;

public class ForLoop {
    public static void main(String[] args) {




//Print Numbers
//1. Print the numbers which start from 5 and end at 20 (inclusive)
//in the same line with a space between the numbers.

for (int a = 5; a <=20; a++) {
            System.out.print(a+" ");
            System.out.println();
        }

//2. Print the numbers which start from 20 and ends at 10 (exclusive).

for (int b = 20; b > 10; b--) {
            System.out.print(b + " ");
        }

//3. Print the numbers which start from 10 and ends at 100 (inclusive)
//with an increment of 10.

 for (int c = 10; c <=100 ; c += 10) {
            System.out.print( c + " ");
        }

//4. Print the numbers which start from 50 and ends at 10 (exclusive) with
//a decrement of 4.

for (int d = 50; d > 10 ; d -= 4) {
            System.out.print( d + " ");
        }

//5. Print "Hello" five times.

for (int f = 0; f <5 ; f++) {
            System.out.println("Hello");
        }





    }
}
