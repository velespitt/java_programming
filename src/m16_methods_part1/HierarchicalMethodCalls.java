package m16_methods_part1;

public class HierarchicalMethodCalls {
    public static void main(String[] args) {
        //read();
        //write();
        learn();
    }

    public static void read() {
        System.out.println("I am reading");
        double a = 21_440.84, b =8.86;

        double sum;
        sum=a-b;
        System.out.println(sum);
    }

    public static void write() {

        System.out.println("I am writing");
    }

    public static void learn() {
        read();
        write();
        System.out.println("I am learning");

    }


}
