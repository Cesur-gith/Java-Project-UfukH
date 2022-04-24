package Lesson03_Loops;

public class A03_For_Loop_BasamaklariAyniOlanSayilar {

    public static void main(String[] args) {
        System.out.println("1-100 arasinda basamaklari ayni olan sayilar");
        for (int k = 11; k<=100; k +=11) {
            System.out.print(" " + k);
        }

        System.out.println();

        for (int k =10; k<+100; k++) {

            int b = k%10; // birler basamagi
            int o = (k-b) /10; // Olar basamagi
            if (b!=o) {
                System.out.print(" " +k);
            }
        }




    }
}
