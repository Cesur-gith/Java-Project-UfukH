package Lesson02_If_else;

public class B01_SayiTekmiCiftmiSwitchCase {


    public static void main(String[] args) {

        int sayi = 17;
        int kalan = sayi %2;

        switch (kalan) {
            case 0 :
                System.out.println("Sayi cift ->" + sayi);
                break;
            case 1:
                System.out.println("Sayi tek -> " + sayi);
                break;

        }


    }
}
