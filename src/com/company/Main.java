package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        //ЗАДАНИЕ 1: массив повторяющихся слов:

        List array = new ArrayList(); //повторяются 2 инструмента: гитара и скрипка
        array.add("гитара");
        array.add("барабаны");
        array.add("бас");
        array.add("гитара");
        array.add("тромбон");
        array.add("металлофон");
        array.add("скрипка");
        array.add("виолончель");
        array.add("контрабас");
        array.add("скрипка");

        System.out.println(array); // выведем весь массив ArrayList
        Set arraySecond = new HashSet(array); // выведем массив , удалив дубликаты через HashSet
        System.out.println(arraySecond);
        Map countInstruments = new HashMap(); // для подсчета количества "инструмент = количество"

         for (Object i : array) {
            if (countInstruments.containsKey(i)) {
                countInstruments.put(i, (int) countInstruments.get(i) + 1);
            } else {
                countInstruments.put(i, 1);
            }
        }
        System.out.println(countInstruments);

        // ЗАДАНИЕ 2: Телефонный справочник


//        Map list2 = new HashMap();
//        list2.put("Тарантино", new PhoneBook("Тарантино", "7777777"));
//        list2.put("Джармуш", new PhoneBook("Джармуш", "6666666"));
//        list2.put("Линч", new PhoneBook("Линч", "55555555"));
//        list2.put("Коппола", new PhoneBook("Коппола", "44444444"));
//        list2.put("Коппола", new PhoneBook("Коппола", "33333333"));
//        list2.put("Миядзаки", new PhoneBook("Миядзаки", "22222222"));
//        list2.put("Кубрик", new PhoneBook("Кубрик", "11111111"));
//        System.out.println(list2.get("Коппола"));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Тарантино", "7777777");
        phoneBook.add("Джармуш", "6666666");
        phoneBook.add("Линч", "55555555");
        phoneBook.add("Коппола", "44444444");
        phoneBook.add("Коппола", "33333333");
        phoneBook.add("Миядзаки", "22222222");
        phoneBook.add("Кубрик", "11111111");

        System.out.println(phoneBook.get("Коппола"));






    }






}














