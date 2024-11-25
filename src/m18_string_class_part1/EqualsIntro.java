package m18_string_class_part1;

public class EqualsIntro  {

    public static void main(String[] args) {
        String s1 = "Java", s2 = "Java";

        System.out.println(s1 == s2);//same object
        System.out.println(s1.equals(s2));// same character same order

        String s3 = new String("Java");//Same object?
        String s4 = new String("Java");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1.equals(s3));

        String s5 = "java";

        System.out.println(s1.equals(s5));//case sensitive

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));//case sens

        System.out.println(str1.equalsIgnoreCase(str2));//not case sens


    }
}
