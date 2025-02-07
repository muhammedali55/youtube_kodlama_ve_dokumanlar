package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Loop - Döngü
         * - for loop
         * döngünün devam etme kuralı ortada yer alan kural doğru olduğu müddetçe döngü
         * devam eder.
         * - while loop
         * parantezin içerisi doğru olduğu sürece döngü devam eder.
         * - do..while loop
         * kural sonradan işletildiği için kural sağlamıyor olsa bile döngü en az 1 defa çalışır.
         */
        for(int i=5;i<5;i++){
            // body
            System.out.println("Muhammet HOCA");
        }

        int dongu = 14;
        while(dongu<=10){
            System.out.println("while döngüsü");
            dongu++;
        }

        int i=100;
        do{
            System.out.println("do...while loop");
            i++;
        }while (i<4);

        System.out.println("PROGRAM KAPANDI.");
    }
}
