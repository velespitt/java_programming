package m18_string_class_part2;

public class IndexOfLastIndexOf {

    public static void main(String[] args) {
        String str = "Java Programming Language";

        int indexOfFirstA = str.indexOf("a");
        System.out.println(indexOfFirstA);

        int indexOfSecondA = str.indexOf("a P");

        System.out.println(indexOfSecondA);

        int indexOfThirdA = str.indexOf("a", 5);

        System.out.println(indexOfThirdA);

        int indexOfFourthA = str.indexOf("a", indexOfThirdA);

        System.out.println(indexOfFourthA);

        int indexOfLastA = str.lastIndexOf("a");

        System.out.println(indexOfLastA);
    }
}
