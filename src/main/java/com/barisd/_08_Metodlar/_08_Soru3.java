package com.barisd._08_Metodlar;

import java.util.Arrays;

//Soru 3: Bir tam sayı dizisi parametre alan ve diziyi küçükten büyüğe doğru sıralayarak geri döndüren bir metod yazınız.
public class _08_Soru3 {
    public static void main(String[] args) {
        int dizi[] = {9, 15, 30, 2, 5};

        System.out.println(Arrays.toString(diziSirala(dizi)));
    }

    public static int[] diziSirala(int[] dizi) {
        Arrays.sort(dizi);
        return dizi;
    }
}
