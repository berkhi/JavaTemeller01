package com.barisd._06_Diziler;

import java.util.Scanner;

public class _03_Soru15 {
    public static void main(String[] args) {
       /* 5 elemanlı bir int dizisi tanımlayın,
                kullanıcıdan alınan değerleri bu diziye aktarın.
        Ardından dizinin elemanlarının sırasını ters çevirerek yazdırın
        */

        //Kullanıcıdan değer almak için Scanner açma
        Scanner sc=new Scanner(System.in);
        //Dizi tanımlama
        int dizi[]=new int[5];
        // Dizi içine eleman doldurma:
        System.out.println(dizi.length+" tane değer giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=sc.nextInt();
        }
        //Dizinin elemanlarını foreach le yazdırma:
        System.out.println("Değişimden önce:");
        for(int item:dizi){
            System.out.println(item);
        }
       /* //Dizinin elemanlarını tersten yazdırma:
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.println(dizi[i]);
        }*/

        //Dizi elemanlarının sırasını değiştirme:
        // 5 10 15 20 25 30  -Değişim sonrası: 30 25 20 15 10 5
        int temp;
        for (int i = 0; i < dizi.length/2; i++) {
            temp=dizi[i];
            dizi[i]=dizi[dizi.length-(i+1)];
            dizi[dizi.length-(i+1)]=temp;
            System.out.println(i+". Değişimden sonra:");
            for(int item:dizi){
                System.out.println(item);
            }
        }
        //Dizinin elemanlarını foreach le yazdırma:
        System.out.println("Değişimden sonra:");
        for(int item:dizi){
            System.out.println(item);
        }

    }
}
