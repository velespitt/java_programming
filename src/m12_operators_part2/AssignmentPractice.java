package m12_operators_part2;

public class AssignmentPractice {
    public static void main(String[] args) {
        int x = 2, y = 3, z = 9;

        y *= x + 5;
        //21
        z %= y;
        //0
        z += 2.5;
        //11

        System.out.println("x = " + x + z);

    }
}
