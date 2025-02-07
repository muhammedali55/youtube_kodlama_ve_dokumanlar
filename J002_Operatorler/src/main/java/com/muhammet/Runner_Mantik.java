package com.muhammet;

public class Runner_Mantik {
    public static void main(String[] args) {
        /**
         * instagram üye oldjuğunuz ve giriş yapacaksınız.
         * username
         * password
         *
         * ve  => &&
         * ve ya  => ||
         */
        String username = "admin";
        String password = "1234";

        boolean isLogin; // true/false
        //               true         ve         true
        isLogin = username == "admin" && password == "1234";
        System.out.println("isLogin = " + isLogin);

        String cinsiyet = "E";
        int yas = 16;

        boolean isConnect;

        isConnect = cinsiyet == "K" || yas > 15;
        System.out.println("isConnect = " + isConnect);

    }
}
