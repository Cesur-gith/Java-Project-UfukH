package Lesson03_Loops;

public class A05_For_Loop_AsalsayiBulmak {

    public static void main(String[] args) {
        // Asal sayi bulmak
        // Baslandicta asal kabul ediyorum
        // asal sayi 1 e ve kendisine bolunen sayi deme

        int sayi = 12;
        boolean asal = true;

        for (int i = 2; i < sayi ; i++) {
            if (sayi % 2 == 0) {
                asal = false;
            }
        }
        if (asal) {
            System.out.println(sayi + " Asal");
        } else {
            System.out.println(sayi + " Asal degildir");
        }


    }


}
