package m18_string_class_part2;

public class SubString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String firstWord = str.substring(0, str.indexOf(" "));
//Sayamaz isek indexOf ile boşluğu da aratabiliriz
        System.out.println(firstWord);

        String secondWord = str.substring(str.indexOf(" ") + 1);
//İkinci cümle için alternatif yöntem

        System.out.println(secondWord);
//Ending index beginningten büyük olmalı.
        String r = str.substring(10, 0);//IndexOutOfBoundsException hatası verir

        String b = str.substring(5,25);//Out of Range.
    }
}
