package m16_methods_part2;

public class EmployeeInfo {

    public static void displayEmployeeInfo(String name, int age, String city) {
        System.out.println("Employee name is " + name);
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " is from " + city);
    }

    public static void main(String[] args) {
        displayEmployeeInfo("Yusuf", 18, "İstanbul");
        System.out.println("--------------------------------------");

        String name = "Isabella";
        int age = 26;
        String city = "New York";
        displayEmployeeInfo(name, age, city);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


    }

}
