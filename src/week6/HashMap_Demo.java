package week6;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"kedi");
        hm.put(2,"kedi");
        hm.put(3,"kopek");
        hm.put(4,"kedi");
        System.out.println("hm = " + hm);


        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        //eklenme sirasina  gore cagiriyor
        lhm.put(2,"aslan");
        lhm.put(3,"tilki");
        lhm.put(1,"fare");
        lhm.put(2,"kedi");
        System.out.println("lhm = " + lhm);

        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(0,"Deve");
        tm.put(9,"Kelebek");
        tm.put(1,"Guvercin");
        tm.put(8,"yilan");
        System.out.println("tm = " + tm);

        for (Integer key:tm.keySet()){
            System.out.println("key = " + key);
        }

        for (String value:tm.values()){
            System.out.println("value = " + value);
        }
        for (Map.Entry<Integer,String> keyValue:tm.entrySet()){
            System.out.println("keyValue.getKey() = " + keyValue.getKey());
            System.out.println("keyValue.getValue() = " + keyValue.getValue());
        }
        System.out.println(tm.containsValue("insan"));//false
        tm.remove(0);
        System.out.println("tm remove dan sonra = " + tm);
        tm.clear();
        System.out.println("tm clear den sonra = " + tm);

        // AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.
        //AddElements(hs, 1,2,3,4,5,101,102,103);
        //AddElements(hs, 1);
        HashSet<Integer>hs=new HashSet<>();
        addElements(hs,1,2,3);
        System.out.println("hs = " + hs);
        addElements(hs,1,2,3,4,5,6,7,8,9);
        System.out.println("hs = " + hs);
        addElements(hs,10);
        System.out.println("hs = " + hs);

        // Soru  : bir metod oluşturup bir HashSet i
        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.
        Integer[] dizi={1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        HashSet<Integer>hs2= generateSet(dizi);

        System.out.println("hs2 = " + hs2);
    }
    public static HashSet<Integer>generateSet(Integer[] dizi){

        HashSet<Integer>hs=new HashSet<>(Arrays.asList(dizi));
        return hs;
    }



    public static void addElements(HashSet<Integer> hs,Integer...sayilar){
        //1.yontem
        //hs.addAll(Arrays.asList(sayilar));

        //2.yontem
        for (int i = 0; i < sayilar.length; i++) {
            hs.add(sayilar[i]);

        }

    }
}
