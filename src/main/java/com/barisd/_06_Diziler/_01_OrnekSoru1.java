package com.barisd._06_Diziler;

import java.util.Random;

// 0-100 arasında rastgele değerlerle oluşturulmuş 20 elemanlı notlar dizisi tanımlayın.
// Sonra da bu sayıların ortalamasını, max, min gösterin.
public class _01_OrnekSoru1 {
    public static void main(String[] args) {
        // 20 elemanlı notlar dizi tanımlama:
        int[] notlar = new int[20];
        //Random sınıfından nesne üretildi.
        Random random = new Random();

        //Dizideki tüm elemanlara 0-100 arası rastgele değerleri atama:
        for (int i = 0; i < notlar.length; i++)
        {
            notlar[i] = random.nextInt(0,101);
        }

        int max= notlar[0];
        int min = notlar[0];
        int toplam =0;
        //Foreach döngüsü ile dizi içinde gezinme
        System.out.println("****NOTLAR****");
        for (int item: notlar)
        {
            toplam += item;
            if (item>max)
            {
                max = item;
            }
            if (item<min)
            {
                min = item;
            }
            System.out.println(item);
        }

        System.out.println("Ortalama Not:"+toplam/notlar.length);
        System.out.println("Max Not:"+max);
        System.out.println("Min Not:"+min);
    }
}
