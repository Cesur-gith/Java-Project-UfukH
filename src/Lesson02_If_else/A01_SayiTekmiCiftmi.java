
package Lesson02_If_else;

public class A01_SayiTekmiCiftmi {

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
