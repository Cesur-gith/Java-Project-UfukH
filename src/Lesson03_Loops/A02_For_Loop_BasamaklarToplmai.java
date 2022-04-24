package Lesson03_Loops;

public class A02_For_Loop_BasamaklarToplmai {

    public static void main(String[] args) {

        // Verilen bir sayinin basamaklar toplami => 5 => 1+2+3+4+5 = 15
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            toplam = toplam + i;
            if (i < 5) {
                System.out.print(i + "+");
            } else {
                System.out.print(i);
            }
        }
        System.out.print("=" + toplam);
    }
}