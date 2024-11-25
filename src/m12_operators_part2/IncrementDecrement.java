package m12_operators_part2;

public class IncrementDecrement {
    public static void main(String[] args) {
//Pre Increment and Pre Decrement
        int x = 5;

        int y = ++x;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

        int a = 10;
        int b = --a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

//Post Increment & Decrement

        int m = 5;

        int n = m++;// n = 5, m = 6
        System.out.println("m = " + m);
        System.out.println("n = " + n);


        int r =10;

        int t = r--;//t=10, r=9 burada işlem sağdan sola değil soldan sağa

        System.out.println("t = " + t);
        System.out.println("r = " + r);
    }
}
