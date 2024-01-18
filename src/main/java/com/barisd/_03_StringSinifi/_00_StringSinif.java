package com.barisd._03_StringSinifi;

import java.util.Scanner;

public class _00_StringSinif {
    public static void main(String[] args) {
        //mutable bakılacak.
        //JVM: GC ( Garbage Collector)

        //1.Yöntem: // Her seferinde yeni bir nesne oluşmayabilir.
        String ad="Serkan";
        String ad2="Kenan";
        String ad3="Kenan";
        ad2=ad2+"a";
        System.out.println(ad2);
        System.out.println(ad3);
        ad3="Fatma";



        //2.Yöntem // Her seferinde yeni bir nesne oluşur.
        String soyad=new String("Demirci");
        String soyad2=new String("Demirci");

        System.out.println(soyad==soyad2);
        System.out.println(soyad.equals(soyad2));

        Scanner sc=new Scanner(System.in);


    }
}
