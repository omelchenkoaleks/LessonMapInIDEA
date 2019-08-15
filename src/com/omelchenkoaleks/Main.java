package com.omelchenkoaleks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        /*
            Map является интерфейсом = в нем объявлено довольно много методов, которые нужно реализовать, но есть уже
            готовые реализации:
                ЭТО HashMap<> и TreeMap<> - чем они отличаются?
                    в HashMap элементы располагаются беспорядочно, в TreeMap в алфавитном порядке

         */
//        Map<String, String> dictionary = new HashMap<>(); // поменяй на TreeMap и посмотри разницу
//        dictionary.put("home", "дом");
//        dictionary.put("milk", "молоко");
//        dictionary.put("money", "деньги");
//        dictionary.put("close", "закрывать");
//        dictionary.put("open", "открывать");
//
//        for (String key : dictionary.keySet()) {
//            System.out.println(key);
//        }

        /*
            КАК МОЖНО ЕЩЕ ИСПОЛЬЗОВАТЬ:
                можем исползовать его, чтобы создать почти полноценный POJO-объект
                например, мы хотим создать объект User, у которого есть поля (name, lastName, age), но при этом
                не созадвая отдеьльный класс, КАК?

                1. Создан объект user, который на самом деле является объектом типа Map
                2. Если захоим создать массив users =
         */
//        Map<String, Object> user = new HashMap<>();
//        user.put("name", "Иван");
//        user.put("lastName", "Иванов");
//        user.put("age", 40); // здесь тип int, можно в параметрах указать родительский класс

        ArrayList<Map<String, Object>> users = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Map<String, Object> user = new HashMap<>();
            user.put("name", "Иван" + i);
            user.put("lastName", "Иванов" + i);
            user.put("age", 40);
            users.add(user);
        }

        for (Map<String, Object> user : users) {
//            // выводятся все ключи каждого из 50 пользователей
//            for (String key : user.keySet()) {
//                System.out.println(key);
//            }
//            // выводим все значения
//            for (Object value : user.values()) {
//                System.out.println(value);
//            }
            // получаем значения по всем ключам
            for (String key : user.keySet()) {
                System.out.println(user.get(key));
            }
        }
    }
}
