package m15_loops_part3;

public class DoWhile {
    public static void main(String[] args) {

        int n=100;

        while (n < 0){
            System.out.println("While Loop: Hello World");

        }

        System.out.println("-------------------------------");

        do {
            System.out.println("Do-While Loop: Hello World");

        }while (n< 0);
        System.out.println("-------------------------------");


        int i=0;
        do {
            i++;
            System.out.print(i +" ");

        }while (i < 11);
    }

    }

