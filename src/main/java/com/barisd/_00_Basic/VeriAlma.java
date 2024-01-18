package com.barisd._00_Basic;

import java.util.Scanner;

public class VeriAlma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int sayi1,sayi2;
        System.out.println("Sayi1 giriniz:");
        sayi1=sc.nextInt();
        System.out.println("Sayi2 giriniz:");
        sayi2=sc.nextInt();
        System.out.println(sayi1+sayi2);*/
        String ad;
        int yas;

        System.out.println("Yaşınızı giriniz");
        yas=sc.nextInt(); sc.nextLine();//bu nextLine ile Enter komutu harcanmış olur.

        System.out.println("Adınızı giriniz");
        ad=sc.nextLine();

        System.out.println("Ad: "+ad+" Yas:"+yas);



    }
}
