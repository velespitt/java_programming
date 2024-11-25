package m15_loops_part1;

public class OutputQuestions {

    public static void main(String[] args) {
        //1.Output sorusu
        int b =0;

        for(b =0; b <=2; b++) { }//Condition false olana kadar çalıştırdık 3 olduğunda iteratörü de çalıştırıp false oldu

        System.out.println(b);
        //2.Output sorusu
        for(int i =0; i < 10; i++) {//Başlangıçta 0 başladı
            i++; //Başlangıçta burada 1 oldu.
            System.out.println("Hello World");
        }
        //3. Output sorusu
        int sum = 0;//İlk aşamadan sumu 5 yaptık. İkinci aşamada sum 10 oldu.
        int j = 5;//5ten başladı
        int r;//10 defa çalışacak 0dan 9a
        for (r = 0; r < 10 && j > 0; r++, j--) {//1- r=0 j=5 2- r=1 j=4 3- r=2 j=3 4- r=3 j=2 5- r=4 j=1 6- r=5 j=0
            if (r % 3 == 0 || j % 5 == 0){//1. aşamada j =5 oldu çalışacak 4. aşamada r 3 oldu if çalışacak
                sum = sum + r +j;//1. Aşamada Sum 5 oldu. 10=5+3+2 2. aşamada sum 10 oldu.
            }
            System.out.println("Sum = " + sum);//10
            System.out.println("r = "+ r);//5
            System.out.println("j = "+ j);//0
        }
        System.out.println(j);


        //5. Aşamada r 4 j 1 olsa bile yani 6ya girildiğinde döngü koşulu false dönse bile sağdaki işlem yapıldığı için j 0a düştü döngüden o şekilde çıkıldı iterasyon gerçekleştirildi.
    }
}
