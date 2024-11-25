package m19_arrays_part1;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {

        int[] scores = new int[4];

        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;

        System.out.println(scores);//hashcode

        System.out.println();

        System.out.println(Arrays.toString(scores));

        System.out.println();

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        //Throws OutOfBoundException System.out.println(scores[4]);

        String[] names = {"Java", "Python","C#","Ruby","C++"};
        int[] numbers = {10, 20, 30, 40, 70, 100, 200, 60, 80};

        System.out.println();

        System.out.println(Arrays.toString(names));

        System.out.println();

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);


/*
 Declaration and initialization can NOT be separated.
int[] numbers2;
numbers2 = {88, 99};//Compile error
 */


    }
}
