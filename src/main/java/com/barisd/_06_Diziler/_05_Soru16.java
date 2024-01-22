package com.barisd._06_Diziler;

/*
Önce Dizi eleman sayısını ve dizideki elemanları kullanıcıdan alınız.
Dizideki en büyük elemanı  bulan  ve bulunduğu indexi yazan programı yazınız.
 */

import java.util.Scanner;

public class _05_Soru16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun?");
        int dizi[]=new int[sc.nextInt()];

        System.out.println("Dizi elemanlarını giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=sc.nextInt();
        }
        //En büyük ve onun indexini bulma kısmı:
        int max=dizi[0];
        int min=dizi[0];
        int maxindex=0,minindex=0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>max) {
                max = dizi[i];
                maxindex=i;
            }
            if(dizi[i]<min) {
                min = dizi[i];
                minindex = i;
            }

        }
        System.out.println("Max:"+max+" Max index:"+maxindex);
        System.out.println("Min:"+min+" Min index:"+minindex);





    }
}
