package m14_selection_statements_part2;

public class Deneme {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int sum=0;

        boolean result = (a >= 1 && a <= 1000 && b >= 1 && b <= 1000);
        if (result) {
            sum = a + b;
        }
        System.out.println(sum);
    }
}
