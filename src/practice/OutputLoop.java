package practice;

public class OutputLoop {

    /*
    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
     */
    public static String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(fizzString("fig"));   // Çıktı: Fizz
        System.out.println(fizzString("dib"));   // Çıktı: Buzz
        System.out.println(fizzString("fib"));   // Çıktı: FizzBuzz
        System.out.println(fizzString("hello")); // Çıktı: hello
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int i = 0;
        while (i < rows) { // Outer loop for rows
            int j = 0;
            while (j < rows) { // Inner loop for columns (stars per row)
                System.out.print("* ");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }
        scanner.close();


         */

        /*
        Output Questions

        int x = 3;
        int i = 0;
        while (i < 3) {
            x += 1;//456
            i += 1;//12
        }
        System.out.println(x);//6
        System.out.println(i);//3

        2. Output Question

        int start = 1;
        int sum = 0;

        do {
            if (start % 2 == 0) {
                start++;
            }
            sum += start;//sum 1 olacak
        } while (++start <= 10);
        System.out.println(sum);

1. Aşamada startı 2 yapıp gönderdik.
2. Aşamada if çalıştı start 3 oldu, sum = sum + start yani 1 = 1+3 sum 4 oldu
3. aşamada start 4 oldu ife girdi 5 oldu. sum 9 oldu. çıkışta start 6 oldu.
4. aşamada start ife girip 7 oldu. sum=9+7 sum 16 oldu. çıkışta start 8 oldu.
5. aşamada start 8 başlayıp ife girdi 9 oldu. sum=16+9 25 oldu çıkışta start 10 oldu.
6. aşamada start 10 başlayıp ife girdi 11 oldu. sum = 25+11 36. while döngüsü false girilmedi.


3. Output Question

1. Aşama x 20 ile başladı 0dan büyük olduğu sürece devam edecek.
x-=2 yaptık 18 oldu.
Inner loop var x 5ten büyük olduğu sürece devam edecek o da.
16
14
12
10
8
6 Do nun altındaki while false olsa bile üstteki while true olduğu sürece dönmeye devam eder! Kısacası Do altındaki whiledan bağımsız çalışıyor.
4
2
0
-1
int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
        }
        x--;
        System.out.println(x);

        
4. Output Question

int c =0;
boolean flag = true;
        for (int i = 0; i < 8; i++) {
            while (flag){
                c++;
                if (i>c||c>3){
                    flag=false;
                }
            }
        }
        System.out.println(c);
 */








        /*
i 4 c 4 flag false
i 5
i 6
i 7

Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"


         */

    }
}





