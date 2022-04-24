package Lesson03_Loops;

public class A04_For_Loop_TekmiCiftmi {

    public static void main(String[] args) {

        int sayi = 7;
        int k = sayi;

        for (; k>0; k-=2) {
            System.out.println("k=" + k);
        }
        System.out.println("k=" + k);

        if (k < 0) {
            System.out.println(sayi + " Tek");
        } else {
            System.out.println(sayi + " Cift");
        }

    }
}
