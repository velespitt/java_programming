package m18_string_class_part2;

public class ReplaceTrim {

    public static void main(String[] args) {
        String str = "I love Java, Java is cool";
        String newStr1 = str.replace("Java", "Python");
        System.out.println(newStr1);
        System.out.println(str);

        String newStr2 = str.replaceAll("Java", "Python");
        System.out.println(newStr2);
        String newStr3 = str.replaceFirst("Java", "Python");
        System.out.println(newStr3);

        String tr = " \t \n Hello World! ";
        System.out.println("tr :" + tr + ":");

        System.out.println("tr :" + tr.trim() + ":");
    }
}
