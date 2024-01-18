package com.barisd._02_Donguler;

public class ContinueOrnek {
    public static void main(String[] args) {
       /*
        int i = 0;
        for (; i < 5; i++) {
            if(i==3)
                continue; //3.adımı atlar ve bir sonraki adımdan devam eder.
            System.out.println(i);
        }
        System.out.println("DÖNGÜ SONLANDI");


        int i=0;
        while(i<5){
            i++; //while döngüsünde artışı continuedan önce yapmak gerekli. Aksi halde sonsuz döngüde kalır.
            if(i==3)
                continue;

            System.out.println(i);
        }
        System.out.println("DÖNGÜ SONLANDI");
 */
        // Labeled Continue
        disdongu:
        for (int i = 0; i < 5; i++) {
            icdongu:
            for (int j = 0; j < 5; j++) {
                if(j==3)
                    continue disdongu;
                System.out.println("i:"+i+"j:"+j);
            }
        }
        System.out.println("DÖNGÜ SONLANDI");

    }
}
