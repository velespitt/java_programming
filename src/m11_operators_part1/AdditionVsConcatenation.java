package m11_operators_part1;

public class AdditionVsConcatenation {
    public static void main(String[] args) {

        /**
         * System.out.println (3 + 5); 8
         * System.out.println (3 + 5 + "Cydeo" + 3 + 5);
         * 8Cydeo8
         * System.out.println (3 + 5 + "Cydeo" + (3 + 5));
         * 8Cydeo8
         */
        System.out.println (3 + 5);
        System.out.println (3 + 5 + "Cydeo" + 3 + 5);
        //Soldan sağa önce 8 hesaplandı sonra Cydeo ve 8Cydeo oldu
        //Daha sonra Cydeo 3 ile toplandı 8Cydeo3 oldu ve o da 5 ile
        //toplandı ve 8Cydeo35 oldu
        System.out.println (3 + 5 + "Cydeo" + (3 + 5));
        //Önce parantez işleme alındı 8 hesaplandı geri kalan soldan
        //sağa devam önceki gibi


        int num1 = Integer.MAX_VALUE;
        System.out.println(num1);
        long num2 = Long.MAX_VALUE;
        System.out.println(num2);
        long num3 = (num1 +1 );
        long num4 = (num2 +1);
        System.out.println(num3);
        System.out.println(num4);
    }
}
