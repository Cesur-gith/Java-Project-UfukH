package Lesson01;

public class UygulamaUc {

    public static void main(String[] args) {

        int s1 =11, s2 = 2;
        int bolum = s1 / s2;
        System.out.println("Bolum :"  + bolum);

        int s3 = 10, s4 = 3;

        double bolum1 = s3/s4; // Bolum1 :3.0

        double bolum2 = (double) s3/ (double) s4;

        System.out.println("Bolum1 :" + bolum1);//  3.0

        System.out.println("Bolum2 :" + bolum2);//3.3333333333333335

        // Double i String e donusturme
        String sayi = Double.toString(bolum2);
        System.out.println("String degerini alan sayi: " + sayi); //  3.3333333333333335 // Bununla matematiksel islem yapilmaz artik String oldugu icin


        // String bir ifadeyi Double a  cevirmek
        Double doubleSayi = Double.parseDouble(sayi);
        System.out.println("Double Sayi = " + doubleSayi); //3333333333335


        // Buyuk kapasiteli dgiskenler, kucuk kapasiteli degiskenlere degistirelemez. Double bir sayi Int ra donusturlemez
        // int intSayi = Integer.parseInt(doubleSayi);

    }
}
