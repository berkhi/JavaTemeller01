package com.barisd._06_Diziler;
/*
{20,19,20,40,3,40,5,3,7,3} elemanlarından oluşan dizideki elemanlardan sadece tekrarsız olarak yeni bir dizi oluşturunuz.
yeni dizideki elemanlar {20,19,40,3,5,7}
 */
public class _08_Soru20 {
    public static void main(String[] args) {
        //int dizi1[]=new int[]{20,19,20,40,3,40,5,3,7,3};
        int dizi1[]={20,19,20,40,3,40,5,3,7,3};
        int dizi2[];
        int dizi2uzunluk=dizi1.length;

        //dizi2 elemanSayisini belirleme:
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = i+1; j < dizi1.length; j++) {
                if(dizi1[i]==dizi1[j]) { //20 , 20  // 19, //20, //40,40 //3,3 //3,3
                    dizi2uzunluk--; //9 //8 //7 //6
                    break;
                }
            }
        }
        System.out.println("Dizi2 uzunluk "+dizi2uzunluk);

        dizi2=new int[dizi2uzunluk];


        //Dizi2 ye tekrarsız değerleri ekleme
        int sayac=0;
        boolean esitMi;
        for (int i = 0; i < dizi1.length; i++) {
            esitMi=false;
            for (int j = i + 1; j < dizi1.length; j++) {
                if(dizi1[i]==dizi1[j]) {
                    System.out.println(dizi1[j]);
                    esitMi = true;
                    break;
                }
            }
            if(!esitMi){
                dizi2[sayac]=dizi1[i];
                sayac++;
            }
        }
        //Dizi2 elemanlarını yazdırma:
        for (int item:dizi2)
            System.out.print(item+"-");



    }
}
