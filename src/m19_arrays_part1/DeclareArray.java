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

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        //Throws OutOfBoundException System.out.println(scores[4]);




    }
}
