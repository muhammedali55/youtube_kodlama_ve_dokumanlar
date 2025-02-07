package com.muhammet;

public class Runner_AttirimEksiltim {
    public static void main(String[] args) {
        /**
         * ++ -> bir değeri 1 arttırmak için kullanılır
         * -- -> bir değeri 1 azaltmak için kullanılır.
         */
        int s1 = 5, s2 = 8;
        System.out.println("s1.....: "+ s1);
        System.out.println("s2.....: "+ s2);

        s1++;
        s2--;
        System.out.println("s1.....: "+ s1);
        System.out.println("s2.....: "+ s2);

        /**
         * önde kullanım ve sonda kullanım
         */

        /**
         * eğer sonra kullanım var ise
         * s1++ ise, önce s1 in güncel değer aktiftir sonra değer 1 artar
         * --s1 ise, önce s1 değişkenini değeri azaltılır.
         */
        // s1 = 6
        // s2 = 6
        //           6   +  6   -   6  -  6   -   5  +  5   +  6
        int sonuc = s1++ + --s2 - --s1 - s1-- - --s2 + s1++ + ++s2;
        System.out.println("s1...: "+ s1);
        System.out.println("s2...: "+ s2);
        System.out.println("sonuc: " + sonuc);

    }
}
