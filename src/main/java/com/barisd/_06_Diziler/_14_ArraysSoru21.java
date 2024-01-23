package com.barisd._06_Diziler;

public class _14_ArraysSoru21 {
    // her bir satırın ortalamasını bulup, ortalama üzerindeki elemanların sayısını bulalım.
    public static void main(String[] args) {
        int[][] sayilar={
                {1,2,3,4},   //ort:2.5 ort üzerinde 2 tane eleman var.
                {5,6,7,100}, //1 tane
                {0,10,11,12} //3 tane
        };

        //Her bir satırın ortalamasını bulma:
        int satir = sayilar.length;

        for (int i = 0; i < satir; i++) {
            int sutun = sayilar[i].length;

            double toplam = 0;

            for (int j = 0; j < sutun; j++) {
                toplam += sayilar[i][j];
            }

            double ortalama = toplam / sutun;

            int sayac = 0;

            for (int j = 0; j < sutun; j++) {
                if (sayilar[i][j] > ortalama) {
                    sayac++;
                }
            }

            System.out.println((i+1) + ". satırın ortalaması: " + ortalama);
            System.out.println((i+1) + ". satırda ortalama üzerindeki eleman sayısı: " + sayac);
        }

    }
}
