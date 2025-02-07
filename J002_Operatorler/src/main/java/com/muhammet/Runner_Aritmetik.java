package com.muhammet;

public class Runner_Aritmetik {
    public static void main(String[] args) {
        /**
         * Toplama  +
         * Çıkartma -
         * ÇArpma   *
         * Bölme    /
         * Mod alma %
         */
        /**
         * En Temel Görev Operatörü = (Atama operatörü)
         * Değişken = Değer
         */
        int sayi;
        sayi = 1;
        int s1, s2;
        s1 = 453;
        s2 = 98;
        // Toplama
        // DİKKAT!!!!! sayısal işlemlerde toplama iki sayıyı toplamak için kullanılır
        // biri metin olan diğeri sayı olan iki değişkenin toplanması ise birleştirme olarak kullanılır.
        int toplam = s1+s2;
        System.out.println("İki sayının toplamı....: "+ toplam);
        System.out.println("s1 ve s2 nin toplamı...: "+ s1 + s2);
        System.out.println("s1 ve s2 nin toplamı...: "+ (s1 + s2));

        // Çıkartma
        int fark = s1 - s2;
        // çarpma
        int carpim = s1 * s2;
        // bölme
        double bolum = s1 / (double)s2;
        System.out.println("Çıkartma......: "+ fark);
        System.out.println("Çarpma........: "+ carpim);
        System.out.println("Bölme.........: "+ bolum);

        // Mod alma
        // Pazartesi -> 23 gün sonra hangi gün? 23/7   artık sayıyı bulur : 2
        int gun = 23;
        int artikGun = gun % 7;
        System.out.println("artık gün ....: "+ artikGun);
    }
}
