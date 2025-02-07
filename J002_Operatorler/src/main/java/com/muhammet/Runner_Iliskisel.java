package com.muhammet;

public class Runner_Iliskisel {
    public static void main(String[] args) {
        /**
         *
         * vize = 40;
         * final = 60;
         * ortalama = (vize+final)/2
         * geçti mi? / kaldı mı?
         *
         * ortalama > 50  =  büyük ise doğru, küçük ise yanlış
         *
         * = -> atama operatörü
         * == iki değerin bir birine eşit olduğu durumu irdeler.
         * > iki değerden soldaki sağdakinden büyük müdür
         * < iki değerden soldaki sağdakinden küçük müdür
         * >= iki değerden soldaki sağdakinden büyük veya eşit midir
         * <=
         * ! -> değil anlamında kullanılır.
         * != iki değişken bir birine eşit değildir öyle mi?
         */
        int vize_notu = 50;
        int final_notu = 54;
        int ortalama = (vize_notu+ final_notu)  / 2;

        System.out.println("ortalama not...: "+ ortalama);
        // boolean -> 1 bit => true/false - doğru/yanlış  - açık/kapalı - evet/hayır
        System.out.println("ilişki değeri...: "+ (ortalama>50));

        System.out.println("ortalama 50 ye eşit midir?...: "+ (ortalama==50));

        System.out.println("ortalama 50 ye eşit değil midir?...: "+ (ortalama!=50));

        System.out.println("ortalama 52 den büyük midir?...: "+ (ortalama>52));
        System.out.println("ortalama 52 den büyük yada eşit midir?...: "+ (ortalama>=52));


    }
}
