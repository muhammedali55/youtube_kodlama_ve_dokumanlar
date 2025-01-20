package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Değişkenler,
         * 1. primitive data type (ilkel veri tipleri)
         * 2. references data type
         * -------------
         * 1.1. sayısal veri tipleri
         * 1.1.1. Tam sayılar
         * 1.1.1.1. byte tam sayı tipi - [-128,127] 2^8
         * 1.1.1.2. short - 2^16
         * 1.1.1.3. int - 2^32
         * 1.1.1.4. long - 2^64
         * 1.1.2. Ondalık sayılar
         *
         */
        /**
         * Değişken nasıl tanımlanır?
         * Syntax -> Gramer
         * [DATA TYPE] [DATA NAME] = [VALUE];
         */
         byte sayi = -128;
         byte sayi2;
         sayi2 = 10;
         byte sayi3,sayi4, sayi5;
        System.out.println("sayi is : "+ sayi);

        short short_sayi = 32767;
        int int_sayi = 23424242;
        long long_sayi = 5345435354353454354L;
        long_sayi = 5435345345345345l;

        int s1;
        byte s2 = 10;
        s1 = s2;
        System.out.println("s1 değeri...: "+ s1);
        s2 = (byte)s1; // cast
        System.out.println("s2 değeri...: "+ s2);

        byte bs1 = 0;
        int is1= 130;
        bs1 = (byte)is1;
        System.out.println("byte s1....: "+ bs1);
        /**
         * default tam sayı değeri - int
         */
        System.out.println(120);
    }// main sonu
}// class sonu
