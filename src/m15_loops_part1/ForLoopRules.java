package m15_loops_part1;

public class ForLoopRules {
    public static void main(String[] args) {
        //1. Avoid Infinite Loops
/*
        for(;;){
            System.out.println("");
        }

        for (int i = 0; i > -1; i++) {
            System.out.println(i);
        }

        for (int i = 0; i<=10;){
            System.out.print(i+" ");
 */
       //2. Multiple variables of same type can be given in init
   /*
        for (int i = 1, j=2; i < 11; i++, j+=10) {
            System.out.println(i + " == " +j);
        }

    */

        //3. Re-assigning a variable in the for loop block
/*
        int x;

        for(x=5;x<20;x++){
            System.out.println(x);
        }

 */

//4. Loop variable cannot be used outside of loops body
/*
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

 */

    }
}
