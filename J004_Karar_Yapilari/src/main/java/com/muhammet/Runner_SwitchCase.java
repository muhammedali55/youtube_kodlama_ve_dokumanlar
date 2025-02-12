package com.muhammet;

import java.util.Scanner;

public class Runner_SwitchCase {
    public static void main(String[] args) {
        /**
         * Karar Yapısı - Switch
         */
        System.out.println("""
                *********************
                **** İşilemler ******
                *********************
                1- Toplama
                2- Çıkartma
                3- Bölme
                4- Çarpma
                0- Çıkış                
                """);
        System.out.print("Lütfen Seçiniz...: ");
        int secim = new Scanner(System.in).nextInt();
        switch (secim){
            case 1:  System.out.println("Toplama yapıldı"); break;
            case 2:  System.out.println("Çıkartma yapıldı"); break;
            case 3:  System.out.println("Bölme yapıldı"); break;
            case 4:  System.out.println("Çarpa yapıldı"); break;
            case 0:  System.out.println("ÇIKIŞ YAPILDI"); break;
        }

        if(secim == 1) System.out.println("Toplama yapıldı");
        else if(secim == 2)  System.out.println("Çıkartma yapıldı");
        else if(secim == 3)  System.out.println("Bölme yapıldı");
        else if(secim == 4)  System.out.println("Çarpa yapıldı");
        else  System.out.println("ÇIKIŞ YAPILDI");
    }
}
