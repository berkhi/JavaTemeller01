package com.barisd._08_Metodlar.baris;


import com.barisd._08_Metodlar.kaan.YardimciSinif;

public class MetodMain {
    public static void main(String[] args) {
        System.out.println("Main çalışıyor...");
        //YardimciSinif.helloYaz();
        int toplam = YardimciSinif.topla(5, 8);

        //  double doubleToplam = YardimciSinif.topla(5.25, 7.55);


        YardimciSinif ys = new YardimciSinif();
        int topla = ys.topla(8, 9, 15);


    }


}
