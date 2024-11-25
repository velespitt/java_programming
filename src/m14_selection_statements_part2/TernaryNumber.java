package m14_selection_statements_part2;

public class TernaryNumber {
    public static void main(String[] args) {
        int num = 3;
        String result = (num < 0) ? "Number is negative" :
                "Number is positive or zero";

        System.out.println(result);
    }
}
