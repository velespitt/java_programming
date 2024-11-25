package m14_selection_statements_part1;

public class Grade {
    public static void main(String[] args) {
        int score = 89;

        if (score >= 0 && score <= 100) {//If the score is valid

            if (score >= 90) {
                System.out.println("Passed with Distinction");
            } else if (score >= 60 ) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid score");

        }
    }
}
