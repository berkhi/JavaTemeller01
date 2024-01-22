package com.barisd._06_Diziler;

import java.util.Scanner;

/*
Dizideki bir öğeyi arama
5 elemanlı elemanları kullanıcı tarafından girilen bir dizi oluşturun.

kullanıcının girdiği sayı dizide varsa BULUNDU, yoksa BULUNAMADI şeklinde mesaj versin.

 */
public class _06_Soru17 {
    public static void main(String[] args) {
        //Kullanıcıdan değer almak için Scanner açma
        Scanner sc=new Scanner(System.in);
        //Dizi tanımlama
        int dizi[]=new int[5];
        // Dizi içine eleman doldurma:
        System.out.println(dizi.length+" tane değer giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=sc.nextInt();
        }
        System.out.println("Aradığınız değeri giriniz:");
        int aranan=sc.nextInt();

        // FLAG MANTIĞI:
        boolean bulunduMU=false;
        for (int i = 0; i < dizi.length; i++) {
            if(aranan==dizi[i]){
                bulunduMU=true;
                break;
            }
        }

        /*
        if(bulunduMU) {
            System.out.println("ARANAN DEĞER DİZİDE VAR.");
        }
        else{
            System.out.println("ARANAN DEĞER DİZİDE YOK.");
        }
        */
        //TERNARY ile yazalım:

        System.out.println(bulunduMU?"ARANAN DEĞER DİZİDE VAR.":"ARANAN DEĞER DİZİDE YOK.");
    }
}
