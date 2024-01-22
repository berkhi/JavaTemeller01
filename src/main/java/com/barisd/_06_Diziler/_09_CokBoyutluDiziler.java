package com.barisd._06_Diziler;

public class _09_CokBoyutluDiziler {
    public static void main(String[] args) {
        //Tanımlama:
        int[] sayilar={5,6,7}; //tek boyutlu dizi
        int[][] koordinatlar={
                {1,2},
                {3,4},
                {5,6}
        }; //iki boyutlu dizi satır=3 sütun=2
        int[][] koordinatlar2={
                {1,2,3},
                {4,5,6}
        }; //iki boyutlu dizi  satır=2 sütun=3

        int[][] dizi=new int[3][2]; // 3 satır 2 sütunlu dizi. ilk değer satır sayısı, ikinci değer sütun sayısı.
        dizi[0][0]=5; //0.satır 0.sütun
        dizi[0][1]=10;//0.satır 1.sütun

        dizi[1][0]=15;//1.satır 0.sütun
        dizi[1][1]=20;//1.satır 1.sütun

        dizi[2][0]=25;//2.satır 0.sütun
        dizi[2][1]=30;//2.satır 1.sütun

        System.out.println("Dizi length:"+dizi.length); // satır sayısını getirir. 3
        System.out.println("dizi[i].length:"+dizi[0].length); // ilgili satırdaki sütun sayısını getirir. 2
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.println(dizi[i][j]);
            }
        }





    }
}
