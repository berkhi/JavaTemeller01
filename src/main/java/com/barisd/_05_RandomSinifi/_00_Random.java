package com.barisd._05_RandomSinifi;

import java.util.Random;

public class _00_Random {
    public static void main(String[] args) {
        Random random=new Random();
        int rastgeleSayi=random.nextInt(100); // bound hariçtir. 0-99 değerlerini üretebilir.
        System.out.println(rastgeleSayi);

        //1-6 arasında rastgele sayı üretsin:
        for (int i = 0; i < 100; i++) {
            int zar=random.nextInt(1,7); // ilk değer dahil, ikinci değer hariç olarak rastgele sayı üretir.
            System.out.println(zar);
        }

        double rastgele=random.nextDouble(5);
        System.out.println(rastgele);

    }
}
