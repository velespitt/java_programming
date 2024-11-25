package variables_data_types;

public class StringIntro {

    public static void main(String[] args) {
        System.out.println();

        String greeting = "Hello World";
        System.out.println(greeting);

        System.out.println();

        String school = "MIT";
        System.out.println(school);

        System.out.println();

        String str1 = "This is ";
        String str2 = "converted to one string.";
        String afterConcat = str1 + str2;
        System.out.println(afterConcat);

        System.out.println();

        int number = 5;
        System.out.println("The value is " + number);

        String name = "Yusuf";
        System.out.println("The name is " + name);

        String from = "London ";
        String to = "Washington DC ";
        double ticketPrice = 200;

        System.out.print("From "+ from + "to " + to +"is $" +ticketPrice);
    }
}
