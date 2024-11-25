package m16_methods_part2;

public class ParametersArguments {


    public static void main(String[] args) {
        int age = 18;
        isEligible(17);
        isEligible(age);

    }

    public static void isEligible(int age) {
        String result = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";

        System.out.println(result);

    }
}
