package m15_loops_part3;

public class BranchingStatementReturn {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if(i ==3)return;
            //continue jumps to the next iteration of the loop
            //break jump out of the loop
            //return jump out of the method
            System.out.println(i);
        }

        System.out.println("Selam");
    }
}
