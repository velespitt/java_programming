package m14_selection_statements_part2;

public class TernaryVote {
    public static void main(String[] args) {
        int birthDay = 2010;
        int year = 2024 - birthDay;
        /*String result;
        if (age>=18){
               result="You are eligible to vote";

         }else {
            result="you are not eligible to vote";
         }

         */

        String result = (year >= 18) ? "you are eligible to vote" : "you are not eligible to vote";

        System.out.println(result);
    }
}
