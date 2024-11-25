package m12_operators_part2;

public class PreIncPreDecPractice {
    public static void main(String[] args) {
        int x = 10;
        int y = 22;

        System.out.println(x++ + x);
        //21 x++ 10du güncellenince artık 11 değerini alacak sağda güncellendi.
        System.out.println(x++ + ++y);
        //34 x 11i aldı fakat post olduğu için henüz güncellenmeden artırmadı. y klasik 23 oldu 11 + 23 34
        System.out.println(++x % 5);
        //x şimdi güncellendi  12 + 1 13 oldu 13%5 3 cevap.
    }
}
