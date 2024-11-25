package m14_selection_statements_part2;

public class TernaryNumberExtended {
    public static void main(String[] args) {

        int num = 0;

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Number is zero";

        System.out.println("Number is: " + result);

        int nuum = 1;
        if (nuum == 1) {
            System.out.println("Selam");
        }
    }
}
