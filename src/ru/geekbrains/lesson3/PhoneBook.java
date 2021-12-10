package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    // Для цикла for, отображения кол-ва номеров.
    private static int num = 0;

    //Создаем HashMap, Который принимает уникальный ключ String и ArrayList<String>.
    HashMap<String, HashSet<String>> phoneMap = new HashMap();

    // Создаем метод add, добавления телефонов.
    public void add(String name, String phone) {
        // Создаем отдельный ArrayList.
        HashSet<String> strings = phoneMap.get(name); //Ищу существующую фамилию
        // Выводим
 //       System.out.println("Фамилии = " + name);

        if (strings == null) {
            HashSet<String> listOfPhones = new HashSet<>();
            listOfPhones.add(phone);
            phoneMap.put(name, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(name, strings);
        }
    }
    // Стандарт метод
    public static void main(String[] args) {

        // Инициализируем PhoneBook
        PhoneBook pb = new PhoneBook();
        // Список сотрудников и телефонов.
        pb.add("Пупкин", "8(800)555-35-35");
        pb.add("Захаров", "8(495)415-82-82");
        pb.add("Крылов", "8(800)410-20-20");
        pb.add("Перов", "8(800)474-58-58");
        pb.add("Костенко", "8(496)274-16-79");
        pb.add("Печенкин", "8(925)316-65-82");
        pb.add("Яйкин", "8(903)155-20-90");
        pb.add("Носяйкин", "8(903)675-75-10");
        pb.add("Печенкин", "8(495)613-43-04");
        pb.add("Пупкин", "8(800)555-38-55");

        // Цикл фор, проверка имени. Если совпадает имя, вывести все телефоны.
        for (String x : pb.get("Пупкин")) {
            num++;
            System.out.println("Пупкин " + num + " телефон: " + x);
        }
    }


    // Метод получающий телефон по фамилии, возвращает фамилию.
    public HashSet<String> get(String name) {
        return phoneMap.get(name);
    }


}
