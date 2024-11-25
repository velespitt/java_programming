package m14_selection_statements_part1;

public class WaterMelon
{
    public static void main(String[] args) {


        int number = 40;
        boolean isEnough = false;
        if (number >= 20) {
            System.out.println("I have more than 20 watermelons");
            isEnough = true;//print ettik stringi ve is enough true oldu artık
        }
        if (isEnough) {
            System.out.println("Good job");//Good Job print edildi çünkü true
        }
        if (!isEnough) {
            System.out.println("I need more watermelon");//Print edilmez trueyu false çevirdik
        }
    }
}
