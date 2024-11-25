package m12_operators_part2;

public class ShorthandOperators {
    public static void main(String[] args) {

        int x = 20;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x = " + x);
        x -= 5;
        System.out.println("x = " + x);
        x *= 5;
        System.out.println("x = " + x);
        x /= 5;
        System.out.println("x = " + x);
        x %= 5;
        System.out.println("x = " + x);

        //Different Data Types
        int c = 4;
        c += 20.5;
        System.out.println("c = " + c);
        //Soldaki variable değerini aldı float göstermek yerine sonuç 24.5 yerine 24
    }
}
