package com.barisd._03_StringSinifi;

public class _03_StringVsStringBuilder {
    public static void main(String[] args) {

        int islemAdet=100_000;
        long baslangic,bitis;
        String metin="Hello";

       /* baslangic = System.currentTimeMillis();
        System.out.println(baslangic);  //1705647729022
        for (int i = 0; i < islemAdet; i++) {
            metin=metin+i;
        }
        bitis = System.currentTimeMillis();
        System.out.println("String ile geçen işlem süresi:"+(bitis-baslangic)+".ms");
        //String ile geçen işlem süresi:4285.ms*/

        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        baslangic = System.currentTimeMillis();
        for (int i = 0; i < islemAdet; i++) {
            sb.append(i);
        }
        bitis = System.currentTimeMillis();
        System.out.println("StringBuilder ile geçen işlem süresi:"+(bitis-baslangic)+".ms");
        //StringBuilder ile geçen işlem süresi:11.ms
    }
}
