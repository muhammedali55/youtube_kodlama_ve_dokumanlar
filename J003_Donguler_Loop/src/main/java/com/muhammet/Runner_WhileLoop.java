package com.muhammet;

import java.util.Scanner;

public class Runner_WhileLoop {
    public static void main(String[] args) {
        int secim;
        do{ // mesela seçim 1 olsun; 1,  0 a eşit değil midir? EVET
            System.out.println("""
                ****************************
                ***** Yeni Sosyal Medya ****
                ****************************
                1- Postlar
                2- Post Ekle
                3- Takipçilerim
                4- Profil Sayfası
                0- ÇIKIŞ
                """);
            // Kullanıcıdan veril almak. Input

            System.out.print("Lütfen seçiniz......: ");
            secim = new Scanner(System.in).nextInt();
        }while (secim != 0);



        System.out.println("UYGULAMA KAPANDI");
    }
}
