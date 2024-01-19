package com.barisd._06_Diziler;

import java.util.Random;

public class _00_Diziler {
    public static void main(String[] args) {
        String ogr1="Serkan Güner";
        String ogr2="Sefa Göktepe";
        String ogr3="Kenan Kerem";
        String ogr4="Can Deniz";
        String ogr5="Salih Ertuğrul";

        //Dizi oluşturma örneği:
        String[] ogrenciler=new String[]{"Serkan Güner","Sefa Göktepe","Kenan Kerem","Can Deniz","Salih Ertuğrul"};
        //Dizinin bazı kısıtlamaları vardır.
        //1. Dizi içindeki eleman hep aynı tip olmak zorundadır.
        //2. Dİzinin eleman sayısı önceden belirlenmek zorundadır.

        //Dizi tanımlama:
        int[] intDizi; // [] işareti tipten sonra herhangi bir yerde olabilir.
       // Ogrenci[] ogrenciler;
        int [] intDizi1;
        int []intDizi2;
        int intDizi3[];

        intDizi=new int[5]; // Dizinin taşıyacağı eleman sayısı int olarak girilmelidir.
        System.out.println(intDizi[0]); //int ve diğer 6 tip dizi türü için default değer olarak : 0 (Sıfır) tutulur.
        boolean[] booleanDizi=new boolean[10];
        System.out.println(booleanDizi[9]); // boolean dizi türü için default değer olarak : false tutulur.

        int[] diziOrnek1=new int[]{10,20,30};

        int[] diziOrnek2;
        diziOrnek2=new int[]{50,60};


        /*
        HATA!!!
        int[] diziOrnek3;
        diziOrnek3={20,30};
        */

        int[] diziOrnek4=new int[5];
        diziOrnek4[0]=10;
        diziOrnek4[1]=20;
        diziOrnek4[2]=50;
        diziOrnek4[3]=8;
        diziOrnek4[4]=2;

        // for ve Random sınıfı kullanarak 10 elemanlı bir diziyi rastgele değerlerle oluşturalım.

        int[] diziOrnek5=new int[10];
        Random rnd=new Random();
        // dizi içine elemanları doldurma kısmı:
        for (int i = 0; i < diziOrnek5.length; i++) {
            diziOrnek5[i]=rnd.nextInt(0,100);
        }

        // dizi içindeki elemanları ekrana yazdırma kısmı:
        for (int i = 0; i < diziOrnek5.length; i++) {
            System.out.println(i+". indexteki eleman="+diziOrnek5[i]);
        }
        // dizi içindeki elemanları foreach ile yazdırma:
        // foreach Read-Only işlemlerde kullanılabilir.
        for(int item:diziOrnek5){
            System.out.println(item);
        }


        String[] ogrenciler2=new String[10];
        ogrenciler2[0]="Hasan Can";
        ogrenciler2[5]="Aslıhan Betül";

        for (String item:ogrenciler2){
            System.out.println(item);
        }



    }
}
