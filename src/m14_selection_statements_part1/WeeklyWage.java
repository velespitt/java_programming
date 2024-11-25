package m14_selection_statements_part1;

public class WeeklyWage {
    public static void main(String[] args) {

        double wage = 900;
        int workingHours = 41;

        if (workingHours > 40) {
            wage *= 1.5;
        }
        System.out.println(wage);
        System.out.println();

    }
}
