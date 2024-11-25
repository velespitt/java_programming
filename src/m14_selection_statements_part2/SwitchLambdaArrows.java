package m14_selection_statements_part2;

public class SwitchLambdaArrows {
    public static void main(String[] args) {
        int n = 6;
        switch (n) {
            case 1 -> System.out.println("Monday");
            //Lambdalar Java 14ten sonra eklendi
                /* Tek casede birden fazla çıktı olacaksa curly braces kullanıyoruz
                case 1 -> {
                System.out.println("Monday");

                System.out.println("First day of the week"); */
            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Friday");

            case 6, 7 -> System.out.println("Weekend");

            default ->
                System.out.println("Invalid Number");
        }
    }
}
