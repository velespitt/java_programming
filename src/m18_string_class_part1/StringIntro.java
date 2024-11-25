package m18_string_class_part1;

import java.security.spec.RSAOtherPrimeInfo;

public class StringIntro {

    public static void main(String[] args) {

        String s1 = "Java";//String literal
        String s2 = "Java";//String literal

        System.out.println(s1 == s2);//true

        String s3 = new String("Java");//new object
        String s4 = new String("Java");//new object

        System.out.println(s3 == s4);//false

        System.out.println(s1 == s3);//false
    }
}
