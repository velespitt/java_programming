package m19_arrays_part1;

import java.util.Arrays;

public class UtilityIntro {

    public static void main(String[] args) {

        // toString(arr): Returns a string representation of the contents of this array
        int[] numbers = {43, 12, 4, 1, 3, 5};

        //System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));


        // equals(arr): checks if both arrays are equal, returns boolean
        int[] n1 = {4, 5, 6, 10, 100};
        int[] n2 = {4, 5, 6, 10, 100};

        System.out.println(n1 == n2);
        System.out.println(Arrays.equals(n1, n2));


        // sort(arr): Sorts the elements of an array in ascending order
        int[] scores = {95, 85, 90, 65, 55, 75};
        String[] languages = {"Zulu", "Spanish", "Italian", "English", "1Polish", "Arabic"};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));


        // binarySearch(arr, value): Searches for the specified element in the array with the help of
        // the Binary Search Algorithm. The array must be sorted in ascending order.
        int[] numX = {4, 6, 18, 7, 10, 55};
        Arrays.sort(numX); //[4, 6, 7, 10, 18, 55]
        System.out.println(Arrays.binarySearch(numX, 7));


        // copyOf(arr, length): Copies the specified array (truncating or padding with default values if necessary)
        // and returns a new array.
        double[] d1 = {2.3, 4.5, 12.4};

        double[] d2 = d1; // not copied, one object ONLY
        System.out.println(d1 == d2);

        double[] d3 = Arrays.copyOf(d1, d1.length);
        System.out.println(Arrays.toString(d3));
        System.out.println(d1 == d3);//False not same
        System.out.println(d1.equals(d3));//Not same


        // copyOfRange(arr, from, to): copies the specified range of the specified array, and returns new array
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int[] newNums = Arrays.copyOfRange(nums, 2, 5);

        System.out.println(Arrays.toString(newNums));


        //fill(arr, value): Assigns the specified value to each element of the specified array.
        int[] nums2 = new int[5];

        System.out.println(Arrays.toString(nums2));

        Arrays.fill(nums2, 20);

        System.out.println(Arrays.toString(nums2));


    }

}
