package com.barisd._02_Donguler;

import java.util.Scanner;

public class DoWhileOrnekler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        do{
           // çalıştırılacak kodlar
        }while(koşul);


        while(koşul){
            //çalıştırılacak kodlar
        }



        //Ornek 1: Kullanıcıdan alınan sayıların toplamını bulan programı yazın. (Kullanıcı 0 girene kadar toplamaya devam etsin)

        int toplam=0;
        int sayi;
        do{
            System.out.println("Bir sayı giriniz: (0 SONLADIRIR)");
            sayi=sc.nextInt();
            toplam+=sayi;
        }while(sayi!=0);



        System.out.println("Toplam="+toplam);

        //Ornek 2: Faktoriyel

        int faktoriyel =1 ;
        System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi yaziniz");
        int num = sc.nextInt() ;
        int firstNumber = num;
        do {
            faktoriyel *= num;
            num--;
        }
        while (num > 0);

        System.out.println(firstNumber +"! " +"sonucu ="+ faktoriyel);

        // Ornek 3: 1-100e kadar olan sayıların toplamı (do-while)
        int sayi = 1;
        int toplam = 0;

        do {
            toplam += sayi;
            sayi++;
        } while (sayi <= 100);

        System.out.println("1'den 100'e kadar olan sayıların toplamı: " + toplam);

        */
        //Ornek 4

        int i=5;
        System.out.println("While Dongusu:");
        while(i<5){
            System.out.println("Iteration:"+ i++);
        }

        i=5;
        System.out.println("Do-While Dongusu:");
        do{
            System.out.println("Iteration:"+  i++);
        }while(i<5);

        /*
        Sami:
        While Dongusu:
        Do-While Dongusu:
        Iteration:5

        Hasan & Kenan &İdris:
        While Dongusu:
        Do-While Dongusu:
        Iteration:6
         */




    }
}
