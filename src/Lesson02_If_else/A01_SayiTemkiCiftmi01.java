package Lesson02_If_else;

public class A01_SayiTemkiCiftmi01 {

    public static void main(String[] args) {

        int sayi = 8;
        int bolum = sayi / 2; // int oldugu icin tam sayisini alir

        if (sayi == bolum * 2) {
            System.out.println("Sayi cift -> " + sayi);
        } else {
            System.out.println("Sayi tek -> " + sayi);
        }


    }

}
