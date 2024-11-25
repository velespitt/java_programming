package m16_methods_part2;

public class PassParameters {
    public static void main(String[] args) {

        int num1 = 5;
        display(num1);
//Data typeda değişim yapılmadı
        short num2 = 10;
        display(num2);
//Shorttan inte dönüşüm yapılıyor. Küçükten büyüğe Otomatik dönüştürme
        long num3 = 15;
        display((int) num3);
//Longtan inte dönüşüm yapılıyor. Büyükten küçüğe manuel dönüştürme.
    }

    public static void display(int num){

        System.out.println("num = " + num);

    }
}
