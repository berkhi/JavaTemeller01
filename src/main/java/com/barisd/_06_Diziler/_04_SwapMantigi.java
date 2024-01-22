package com.barisd._06_Diziler;

public class _04_SwapMantigi {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2);
    // temp kullanarak Swap(Yer değişimi) işlemi:
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2);

    // temp kullanmadan SWAP işlemi
        sayi1=10;
        sayi2=20;
        System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2);

        sayi1=sayi1+sayi2; //sayi1: 30, sayi2:20
        sayi2=sayi1-sayi2; //sayi1: 30, sayi2:10
        sayi1=sayi1-sayi2; //sayi1: 20, sayi2:10
        System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2);


    }
}
