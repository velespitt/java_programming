package m12_operators_part2;

public class MixedOperations {

    public static void main(String[] args) {

        byte num1=100;
        short num2=20;

        short i = (short) (num1 + num2);
        System.out.println("i = " + i);

        int a = 100;
        long b=200;

        long c =a+b;
        System.out.println("c = " + c);
        short x =2;
        float y =2.5F;
        
       float z = x * y;
        System.out.println("z = " + z);

        System.out.println(9/3);

        
    }
}
