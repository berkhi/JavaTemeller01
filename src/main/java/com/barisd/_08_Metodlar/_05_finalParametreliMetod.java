package com.barisd._08_Metodlar;

public class _05_finalParametreliMetod {

    int hiz = 0;

    public static void main(String[] args) {
        _05_finalParametreliMetod yeniNesneReferans = new _05_finalParametreliMetod();
        System.out.println(yeniNesneReferans.hiz);
        yeniNesneReferans.hizArtir(50);
        System.out.println(yeniNesneReferans.hiz);
    }

    public void hizArtir(final int yeniHiz) {
        /*
        final keywordü ile daha önce sabit oluşturmuştuk.
        metod içindeki parametreye final keywordü eklersek metod gövdesinde o parametrenin değerinin değiştirilmesini engellmiş oluruz.
         */
        // yeniHiz += 20; HATA! final keywordlü parametre değeri değiştirilemez!
        hiz = yeniHiz;
    }
}
