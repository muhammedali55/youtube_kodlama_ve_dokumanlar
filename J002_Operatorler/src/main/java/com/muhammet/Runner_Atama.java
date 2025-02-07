package com.muhammet;

public class Runner_Atama {

    public static void main(String[] args) {
        /**
         * = atama işlemi
         * int sayi = 5;
         *   eşittir
         *  6 + 5 = 11
         *
         *  arrtırım ile atama yapmak
         *  +=  -> ekle
         *  -=
         *  *=
         *  /=
         *  %=
         */
        int sayi;
        // System.out.println("sayı.....: "+ sayi);
        sayi = 56;
        System.out.println("sayı.....: "+ sayi);

        int s1 = 6;
        System.out.println("s1....: "+ s1);
        s1 = s1 + 5;
        System.out.println("s1....: "+ s1);

        s1 += 20;
        System.out.println("s1....: "+ s1);

        s1 -= 15;
        System.out.println("s1....: "+ s1);

        s1 *= 3;
        System.out.println("s1....: "+ s1);

        s1 /= 4;
        System.out.println("s1....: "+ s1);

        s1 %= 7;
        System.out.println("s1....: "+ s1);

    }
}
