package m12_operators_part2;

public class BitWiseExclusiveOperators {
    public static void main(String[] args) {

        /*
        |: Bit Wise OR
        &: Bit Wise AND
        ^: Bit Wise EXCLUSIVE OR
         */

        System.out.println(true | false);//true
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println("-----------------------");
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); //false
    }
}
