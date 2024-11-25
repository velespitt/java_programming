package m18_string_class_part1;

public class ConcatLowerCaseUpperCase {

    public static void main(String[] args) {
        String str = "Cydeo";

        str = str.concat("School");

        System.out.println(str);//CydeoSchool

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
