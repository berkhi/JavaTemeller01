package com.barisd._01_KararYapilari;

import java.util.Scanner;

/**
 * Kullanıcının girdiği(SCANNER) ürün fiyatına göre indirim uygulayan bir program yazmanız gerekiyor.
 * Ürün fiyatı 1000 TL veya üzerinde ise %20,
 * 500-999 TL arası %10,
 * 100-499 TL arası %5 indirim uygulanacaktır.
 * Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
 */
public class Indirim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fiyat Giriniz:");
        double fiyat = sc.nextDouble();
        double sonFiyat=fiyat;

        if (fiyat >= 1000) {
            sonFiyat = fiyat * 0.8;
        }
        else if (fiyat >= 500) {
            sonFiyat = fiyat - (fiyat* 0.1);
        }
        else if (fiyat >= 100) {
            sonFiyat = fiyat - (fiyat* 0.05);
        }
        System.out.println(sonFiyat);


    }
}
