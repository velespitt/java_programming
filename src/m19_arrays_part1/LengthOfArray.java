package m19_arrays_part1;

public class LengthOfArray {

    public static void main(String[] args) {

        String[] names = {"Sultan", "Yusuf", "Kristen", "Ben"};

        int length = names.length;

        int lastIndex = length - 1;

        System.out.println(length);

        System.out.println(lastIndex);

        System.out.println(names[lastIndex]);

        System.out.println("------------------------");

        int[] numbers = {10, 20, 30, 40, 50, 60};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("numbers = " + numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers = " + numbers[i]);
        }

        //Shortcut numbers.fori
        //numbers.forr



    }
}
