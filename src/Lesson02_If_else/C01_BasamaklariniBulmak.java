package Lesson02_If_else;

public class C01_BasamaklariniBulmak {

    public static void main(String[] args) {
        int sayi = 432;

        // Verilen sayinin birler basamagini almak icin sayi%10 yapmamiz gerekir
        int birler = sayi%10; // 15 verir
        System.out.println("Birler basamagi: " + birler);

        // Verilen Sayinin onlar basamagini almak icin sayinin %100 alip 10 a bolmek gerekir
        int onlar = (sayi%100) /10;
        System.out.println("Onlar basamagi: " + onlar);

        // Verilen sayinin yizler veya binler basamagini almak icin 100 e veya 1000 ne bolmek gerekir
        int yuzeler = sayi / 100;
        System.out.println("Yuzler basamagi: " + yuzeler);


        String numberInLetter="";
        // Yuzler basamagini alalim
        if (yuzeler == 9) numberInLetter += ("Dokuz yuz");
        if (yuzeler == 8) numberInLetter += ("Sekiz yuz");
        if (yuzeler == 7) numberInLetter += ("Yedi yuz");
        if (yuzeler == 6) numberInLetter += ("Alti yuz");
        if (yuzeler == 5) numberInLetter += ("Bes yuz");
        if (yuzeler == 4) numberInLetter += ("Dort yuz");
        if (yuzeler == 3) numberInLetter += ("Uc yuz");
        if (yuzeler == 2) numberInLetter += ("Iki yuz");
        if (yuzeler == 1) numberInLetter += ("Yuz");

        // Onlar basamagini alalim
        if (onlar == 9) numberInLetter += (" doksan ");
        if (onlar == 8) numberInLetter += (" seksen ");
        if (onlar == 7) numberInLetter += (" yetmis ");
        if (onlar == 6) numberInLetter += (" altmis ");
        if (onlar == 5) numberInLetter += (" elli ");
        if (onlar == 4) numberInLetter += (" kirk ");
        if (onlar == 3) numberInLetter += (" otuz ");
        if (onlar == 2) numberInLetter += (" yigirmi ");
        if (onlar == 1) numberInLetter += (" on ");

        // Birler basamagini alalim

        if (birler == 9) numberInLetter += ("dokuz");
        if (birler == 8) numberInLetter += ("sekiz");
        if (birler == 7) numberInLetter += ("yedi");
        if (birler == 6) numberInLetter += ("alti");
        if (birler == 5) numberInLetter += ("bes");
        if (birler == 4) numberInLetter += ("dort");
        if (birler == 3) numberInLetter += ("uc");
        if (birler == 2) numberInLetter += ("iki");
        if (birler == 1) numberInLetter += ("bir");

        System.out.println(sayi + " " + numberInLetter);

    }
}
