package com.barisd._08_Metodlar;

public class _00_MetodYazim {
    /*
       //metod adı+parametreListesi= Metod İmzası
       public int sum(int sayi1,int sayi2){ //metodun başlığı
           //metodun gövdesi
       }

 */
    public static void main(String[] args) {
        System.out.println("Main çalıştı.");
        int max = max(7, 15);
        System.out.println(max);

        System.out.println(sum(8,10)); // parametreye geçilen değerlere argüman denir. (Actual Parameter)

        System.out.println(square(5));

        System.out.println(sum(3,5,7));

        System.out.println(sum(8.0,2.5,6));

        selamVer();

        System.out.println(merhabaDe());

        baslikYazdir("OKUL OTOMASYONU");
        baslikYazdir("NOTLARI LİSTELE");
    }

    public static int max(int x,int y){
        System.out.println("Max metodu çalıştı.");
        if(x>y)
            return x;
        else
            return y;
    }
// Metod Overloading: Aynı isimde farklı parametre tiplerinde veya sayısında metodlar yazmak.

    //dışarıdan 2tane int parametre alan ve toplamlarını int olarak dönen sum metodunu yazın.
    public static int sum(int a,int b){ //Formal Parameter
        return a+b;
    }
    //dışarıdan 3tane int parametre alan ve toplamlarını int olarak dönen sum metodunu yazın.
    public static int sum(int x,int y,int z){ //Formal Parameter
        return x+y+z;
    }
    //dışarıdan 3tane double parametre alan ve toplamlarını double olarak dönen sum metodunu yazın.
    public static double sum(double x,double y,double z){ //Formal Parameter
        return x+y+z;
    }
    //verilen sayının karesini dönen metodu yazınız.
    public static int square(int a) {
        Math.pow(a,2);
        return (a*a);
    }

    //Metodları isimlendirirken değişken isimlendirme kurallarına uyuyoruz.


    //Geri değer dönmeyen metod:
    public static void selamVer(){
        System.out.println("Selam!");
    }

    public static String merhabaDe(){ // metodun geri dönüş tipi ile metodun adı arasına hiçbir şey giremez.
        return "Merhaba";
    }

    public static int onKati(int sayi){ // bir metod sadece bir return keywordu içerebilir.

        return sayi*10;
        //returndan sonra herhangi bir şey yazılamaz. Unreachable Statement olur.
    }
    //Eğer metoddan birden fazla değer döndürmek isterseniz Array yada Nesne geriye dönebilirsiniz.


    /*
      System.out.println("***********************************");
                    System.out.println("************SINIF LİSTESİ**********");
                    System.out.println("***********************************");
     */

    public static void baslikYazdir(String baslik){
        System.out.println("***********************************");
        System.out.println("************"+baslik+"**********");
        System.out.println("***********************************");
        return; // GEREK YOK!
    }




}
