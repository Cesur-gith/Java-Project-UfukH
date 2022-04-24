
package Lesson02;

public class SayiTekmiCiftmi {

    // sayi tekmi ciftmi kontrol edelim
    public static void main(String[] args) {

        int sayi = 18;

        // Sayinin 2 modulunu aliyoruz kalan sifir ise cifttir

        if (sayi % 2 == 0) {
            System.out.println("Sayi ciftdir " + sayi);
        } else {
            System.out.println("Sayi tekdir " + sayi);

        }



    }
}
