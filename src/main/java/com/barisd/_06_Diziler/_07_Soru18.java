package com.barisd._06_Diziler;

import java.util.Scanner;

//Bir dizinin tüm öğelerini başka bir diziye kopyalama
public class _07_Soru18 {
    public static void main(String[] args) {
        int orjinalDizi[]=new int[5];
        int kopyaDizi[]=new int[5];
        int tersDizi[]=new int[5];

        //Orjinal diziye elemanları doldurma:
        Scanner sc=new Scanner(System.in);
        System.out.println(orjinalDizi.length+" tane değer giriniz:");
        for (int i = 0; i < orjinalDizi.length; i++) {
            orjinalDizi[i]=sc.nextInt();
        }

        //Orjinal Dizideki elemanları kopyaDizi'ye kopyalama:
        for (int i = 0; i < orjinalDizi.length; i++) {
            kopyaDizi[i]=orjinalDizi[i];
        }
        //kopyaDizi elemanlarını yazdırma:
        System.out.println("kopyaDizi:");
        for(int item:kopyaDizi)
            System.out.println(item);

        //tersDizi elemanlarını doldurma:
        for (int i = 0; i < orjinalDizi.length; i++) {
            tersDizi[i]=orjinalDizi[orjinalDizi.length-(i+1)];
        }
        //tersDizi elemanlarını yazdırma:
        System.out.println("tersDizi:");
        for(int item:tersDizi)
            System.out.println(item);

    }
}
