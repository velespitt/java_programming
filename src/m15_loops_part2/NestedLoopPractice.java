package m15_loops_part2;

public class NestedLoopPractice {
    public static void main(String[] args) {
        /*
        Write a program that prints the statements as below using nested
loops and debug it.

Outer Loop Iteration 1
i = 1 | j = 1
i = 1 | j = 2
i = 1 | j = 3
Outer Loop Iteration 2
i = 2 | j = 1
i = 2 | j = 2
i = 2 | j = 3
Outer Loop Iteration 3
i = 3 | j = 1
i = 3 | j = 2
i = 3 | j = 3
Outer Loop Iteration 4
i = 4 | j = 1
i = 4 | j = 2
i = 4 | j = 3
         */

        for (int outerLoop = 1, i =1; outerLoop < 5; outerLoop++, i++) {
            System.out.println("Outer Loop Iteration " + outerLoop);
            for (int innerLoop = 1, j = 1; innerLoop < 4; innerLoop++, j++){
                System.out.println("i = "+ i + "\t|\t"+"j = "+ j);
            }

        }
    }
}
