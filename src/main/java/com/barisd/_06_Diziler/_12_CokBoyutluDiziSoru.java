package com.barisd._06_Diziler;

/*
int[][] sayilar={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
			}
sayilar dizisinin her satırındaki
ve sütunundaki toplamları
 ayrı ayrı ekrana yazdırın.
 */
public class _12_CokBoyutluDiziSoru {
    public static void main(String[] args) {
        //Can Deniz:
        int[][] sayilar={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int toplamSatir = 0;
        int toplamSutun = 0;

        // Satır toplamlarını bulma
        // [0][0] [0][1] [0][2] [0][3]
        // [1][0] [1][1] [1][2] [1][3]
        // [2][0] [2][1] [2][2] [2][3]
        for (int i = 0; i < sayilar.length; i++) // Satır sayısı kadar döner
        {
            for (int j = 0; j <sayilar[i].length ; j++) // Sütun sayısı kadar döner
            {
                toplamSatir += sayilar[i][j]; // satırdaki her bir değeri ekler.

            }
            System.out.println(i+". satırdaki sayıların toplamı : " + toplamSatir);
            toplamSatir = 0; // 0 ladıktan sonra yeni satıra geçilir.
        }

        //Sütun toplamı
        // [0][0]           // [0][1]
        // [1][0]           // [1][1]
        // [2][0]           // [2][1]

        for (int i = 0; i < sayilar[0].length; i++)
        {
            for (int j = 0; j <sayilar.length ; j++)
            {
                toplamSutun += sayilar[j][i];
            }
            System.out.println(i+". sütundaki sayıların toplamı : " + toplamSutun);
            toplamSutun = 0; // 0 ladıktan sonra yeni sütun toplamı bulmaya geçilir.
        }



        //Mina:
        int[][] dizi={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};



        for (int i = 0; i < dizi.length; i++) {
            int satirToplam=0;
            for (int j = 0; j < dizi[i].length; j++) {
                satirToplam+=dizi[i][j];

            }System.out.println((i+1)+". satır toplamı: "+satirToplam);
        }

        for (int i = 0; i < 4; i++) {
            int sutunToplam=0;
            for (int j = 0; j < 3; j++) {
                sutunToplam+=dizi[j][i];
            }System.out.println((i+1)+".ci sütun toplamı: "+sutunToplam);
        }

    }
}
