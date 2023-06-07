package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_Demo {

    public static void main(String[] args) {

//
//        ArrayList<Integer>sayilar=new ArrayList<>();
//        sayilar.add(20);
//        sayilar.add(10);
//        sayilar.add(20);
//        sayilar.add(40);
//        System.out.println("sayilar = " + sayilar);
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//        numbers.add(50);
//        System.out.println(numbers);
//
//        ArrayList<Integer> numbers2 = new ArrayList<>(sayilar);
//        System.out.println(numbers2);
//
//        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(10,20,30,5));


//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(new Car("Honda", 2002));
//        cars.add(new Car("Honda", 2002));
//        cars.add(new Car("Honda", 2002));

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//
//
//
//        numbers3.addAll(numbers);
//        System.out.println("numbers3 = " + numbers3);
//
//        numbers3.clear();
//        System.out.println("clear den sonra");
//        System.out.println("numbers3 = " + numbers3);
//
//        System.out.println("numbers3.isEmpty() = " + numbers3.isEmpty());//true
//        System.out.println("remove");
//        numbers2.remove(1);
//        System.out.println("numbers2 = " + numbers2);
//        System.out.println("remove all");
//        numbers.removeAll(numbers2);
//        System.out.println("numbers = " + numbers);
//        System.out.println("sort ");
//        Collections.sort(numbers2);
//        System.out.println("numbers4 = " + numbers2);
//
//        System.out.println(numbers2.get(1));
//        System.out.println(numbers.get(0));
//
//        // 2 boyutlu ArrayList
//
//        ArrayList < ArrayList<Integer> > numberList = new ArrayList<>();
//        numberList.add(numbers2);
//        numberList.add(numbers3);
//        numberList.add(numbers2);
//        System.out.println(numberList);
//
//        ArrayList<Integer> nubbb = new ArrayList<>(Arrays.asList(10,20,30));
//        ArrayList<Integer> kx = new ArrayList<>(Arrays.asList(150,520,430));
//
//        ArrayList < ArrayList<Integer> > numberList2 = new ArrayList<>();
//
//        numberList2.add(nubbb);
//        numberList2.add(kx);

        // Soru - 1 : TODO Bir Array i nasil Arraylist e donusturebilriz?....

        String[] arr = { "Java", "Python", "C++" };

//     ArrayList<String>languages1=new ArrayList<>(Arrays.asList(arr));
//        System.out.println("languages1 = " + languages1);
//
//
//     ArrayList<String>languages=new ArrayList<>();
//        languages.addAll(Arrays.asList(arr));
//
//        System.out.println("languages = " + languages);


        // Soru - 2 : TODO Bir Arraylist i Array e nasil donustururuz?.....
        ArrayList<String> diller = new ArrayList<>(Arrays.asList("Java", "Phyton", "C++"));
        String[]str=new String[diller.size()];
        diller.toArray(str);
        System.out.println("str = " + Arrays.toString(str));

//        ArrayList<String> al2=new ArrayList<>(Arrays.asList("java","python","c++"));
//        String [] s=new String[al2.size()];
//        for(int i=0; i<s.length; i++){
//            s[i]=al2.get(i);
//            System.out.println(s[i]);
//        }






    }
}
