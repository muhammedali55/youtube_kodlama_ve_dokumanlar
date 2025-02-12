package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Koşul Opratörleri - Karar Yapıları
         * Syntax : grameri
         * if(condition){ eğer doğru ise
         *     bunu yap
         * }else{ değil ise
         *     bunu yap
         * }
         * -------
         * if(condition){
         *
         * }
         *
         * if(condition){
         *
         * }
         */
        int ogrencininNotu = 40;
        if(ogrencininNotu < 50){ // öğrencinin notu 50 den küçük ise
            System.out.println("Öğrenci Kaldı.");
        }else{ // eğer değil ise
            System.out.println("Öğrenci geçti.");
        }
        /**
         * Öğrencinin notu hangi harf e denk gelir.
         * 80-100 AA
         * 50-79  CC
         * 30-49  DD
         * 0 -29  FF
         */
        if(ogrencininNotu>=80 && ogrencininNotu<=100){
            System.out.println("AA");
        }else if(ogrencininNotu>=50 && ogrencininNotu<=79){
            System.out.println("CC");
        }else if(ogrencininNotu>=30 && ogrencininNotu<=49){
            System.out.println("DD");
        }else{
            System.out.println("FF");
        }
    }
}
