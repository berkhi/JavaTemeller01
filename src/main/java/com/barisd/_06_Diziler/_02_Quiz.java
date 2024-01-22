package com.barisd._06_Diziler;

import java.util.Arrays;

public class _02_Quiz {
    public static void main(String[] args) {
        isimYaz("Kenan","Su","Ece"); // parametre olarak bir string gönderildi.
        isimYaz(new String[]{"Ece","Kenan"}); // parametre olarak içinde bir string olan dizi gönderildi.

        //isimleriYaz("Murat"); //parametre olarak bir string gönderildi. Ama dizi isteniyordu!
        isimleriYaz(new String[]{"Su","Ece","Ali"}); // parametre olarak içinde bir string olan dizi gönderildi.

        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }


        String aslan [] = new String[] {"aslan"};
        // HATA ! String kaplan [] = new String[1] {"kaplan"};
        String ayi [] = new String[] {};
        // HATA ! String sinek [] = new String[0] {};


        // HATA ! float[] aslan2 = new float[];

       // HATA float  ayi2[] = new float[];


        String[] strings = new String[2];
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings);
        System.out.println("Arrays.toString");
        System.out.println(Arrays.toString(strings));

        int[] intDizisi=new int[5];
        System.out.println(intDizisi);
        System.out.println(Arrays.toString(intDizisi));

        Integer[] integerDizi=new Integer[5];
        System.out.println(integerDizi);
        System.out.println(Arrays.toString(integerDizi));



    }

    public static void isimYaz(String... isimler) {
        System.out.println(Arrays.toString(isimler));
    }

    public static void isimleriYaz(String[] isimler) {
        System.out.println(Arrays.toString(isimler));
    }

}
