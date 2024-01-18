package com.barisd._01_KararYapilari;

import java.util.Scanner;

/**
 * Kullanıcının girdiği yılın artık yıl olup olmadığını dönen
 * programı yazınız.
 *
 * Artık yıl:
 *
 * Genel bir kural olarak, artık yıllar
 * 4 rakamının katı olan yıllardır:
 *
 * 100'ün katı olan yıllardan sadece
 * 400'e kalansız olarak bölünebilenler artık yıldır:
 */

public class ArtikYil {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Yılı giriniz.");
        final int year = sc.nextInt();

        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " Artık yıl.");
        }
        else
            System.out.println(year + " Artık yıl değil.");*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Yil giriniz.");
        int year = sc.nextInt();

        if ((year % 100) ==  0 ) {
            if ((year % 400) == 0) {
                System.out.println("Artik Yildir");
            }
            else {
                System.out.println("Artik yil degildir,");
            }
        }else {
            if ((year%4) == 0) {
                System.out.println("Artik Yildir");
            }
            else {
                System.out.println("Artik yil degildir,");
            }
        }
    }
}
