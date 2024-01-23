package com.barisd._06_Diziler;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class _13_ArraysSinifi {
    public static void main(String[] args) {
        int[] sayilar={5,1,3,2,4};
        String[] isimler={"Ahmet","Kenan","Can","Su"};
        System.out.println("Orjinal Dizi:"+ Arrays.toString(sayilar));
        System.out.println("Orjinal Dizi:"+ Arrays.toString(isimler));
        // 1- Arrays.Sort :Diziyi sıralı hale getirme: ( Küçükten büyüğe veya A'dan Z'ye doğru sıralar.)
        // Bu metod orjinal dizide değişikliğe sebep olur.

        Arrays.sort(sayilar);
        Arrays.sort(isimler);
        // 2-Arrays.toString: Diziyi stringe çevirir. başına[  sonuna ], eleman aralarında virgüller ekleyerek yazdırır.
        System.out.println("Arrays.sorttan sonra Dizi:"+ Arrays.toString(sayilar));
        System.out.println("Arrays.sorttan sonra Dizi:"+ Arrays.toString(isimler));

        //3.Arrays.binarySearch: (Eleman arama) Aranan elemanın index numarasını döner. Eğer eleman dizide yoksa negatif bir sayı döner.
        int index= Arrays.binarySearch(sayilar,7);
        System.out.println((index>=0)?"ELEMAN DİZİDE VAR":"DİZİDE YOK");

        //4.Arrays.equals: İçindeki elemanlar ve elemanların sırası aynı ise True döner.
        int[] array1={0,1,2};
        int[] array2={1,0,2};
        boolean esitMi=Arrays.equals(array1,array2);
        System.out.println(esitMi);

        //5.Arrays.fill : İstenilen eleman ile diziyi doldurma
        int[] array3=new int[10];
        System.out.println("Array3 ilk hali:"+Arrays.toString(array3));
        Arrays.fill(array3,1);
        System.out.println("Arrays.fill den sonra:"+Arrays.toString(array3));
        Arrays.fill(array3,5,10,4); // fromIndex dahil, toIndex hariç olarak belirlenen aralığa belirlenen değeri atar.
        System.out.println("Arrays.fill 5,10,4 den sonra:"+Arrays.toString(array3));

        //6.Arrays.copyOf : Diziden kopya alma
        int[] array4={5,1,2,4,3};

        int[] array4Copy= Arrays.copyOf(array4,10); //newLength Yeni oluşacak dizinin eleman sayısını belirtir.
        //Kopyalanacak dizideki elemanlardan kaç tanesinin alınacağı belirlenebilir. (2 , 5 ve 10 değerleri için deneyin.)
        System.out.println("array4Copy:"+Arrays.toString(array4Copy));

        //7. Arrays.copyOfRange
        int[] array4copyOfRange= Arrays.copyOfRange(array4,2,3);
        System.out.println(Arrays.toString(array4copyOfRange));

        //8. Arrays.stream
        // sum():
        int sum = Arrays.stream(array4).sum();
        System.out.println("sum():"+sum);
        // average():
        OptionalDouble average = Arrays.stream(array4).average();
        System.out.println("average():"+average);
        // count():
        long count = Arrays.stream(array4).count();
        System.out.println("count():"+count);
        // max():
        OptionalInt max = Arrays.stream(array4).max();
        System.out.println("max():"+max);
        // min():
        OptionalInt min = Arrays.stream(array4).min();
        System.out.println("min():"+min);

        // Arrays.asList() : Bir arrayi bir List'e çevirme:
        int[] array5={5,10,20};
        List<int[]> list = Arrays.asList(array5);
        System.out.println("int Arrays.asList: "+list); //içindeki dizinin adresini gösterir.

        // Arrays.asList() : Bir arrayi bir List'e çevirme:
        Integer[] array6={5,10,20};
        List<Integer> liste = Arrays.asList(array6);
        System.out.println("Integer Arrays.asList: "+liste); // dizi içindeki elemanları gösterir.


        // Arrays.deepToString: Çok boyutlu dizideki tüm elemanları yazdırmak için kullanılabilir.
        int[][] cokBoyutluDizi={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(cokBoyutluDizi));
        System.out.println(Arrays.deepToString(cokBoyutluDizi));
    }
}
