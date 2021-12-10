package ru.geekbrains.lesson3;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {
        //увеличение размера массива
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*10;
        }
        System.out.println(Arrays.toString(arr));
        int arr1[] = new int[arr.length*2];
        System.arraycopy(arr,0,arr1,0,arr.length);
        arr = arr1;
        arr[10]= 1010;
        System.out.println(Arrays.toString(arr));
        //колеекции
        //ArrayList динамический массив
        List <Integer> arrList = new ArrayList<>();
        //размер автоматичесски увеличиваеться пр  добавление элементров
        for (int i = 0; i < 10; i++) {
            arrList.add(i*10);
        }
        System.out.println(arrList);
        for (int i = 0; i < 5; i++) {
            arrList.add(i*10);
        }

        //!!! так делать не желательно .Нужноь  использовать Set  а не contains
        arrList.contains(5);


        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.printf("Элменет по индексу [%d]: %d%n",5,arrList.get(5));
        arrList.remove(1);
        System.out.println(arrList);
        for (Integer val : arrList) {
            System.out.printf("Элменет массива %d%n",val);
        }
        //двухмерный ArrayList
        List <List<Integer>> twoDimArrList = new ArrayList<>();
        twoDimArrList.add(new ArrayList<>());
        twoDimArrList.get(0).add(123);

        //LinkenList и Queue
        System.out.println("Работа с очередью");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //Map - словарь
        Map<String, String> dict = new HashMap<>();
        dict.put("hello", "привет");
        dict.put("I", "я");
        dict.put("you", "ты");

        String word = "hello";
        System.out.printf("%s - %s", word, dict.get(word));
        System.out.println();
        //есть нужно несколь переврдов
        //такую структуру называют Multimap
        Map <String, List<String>> dict2 = new HashMap<>();

        Integer val = 10;
        int hashCode = val.hashCode();

        //val1 == val2 => val1.hashCode() ==val2.hashCode()
        //val1 != val2 => val1.hashCode() ==val2.hashCode() || val1.hashCode() !=val2.hashCode()

        // множество
        Set<String>  userRules = new HashSet<>();
        userRules.add("read");
        userRules.add("write");
        System.out.println("право на чтение " + userRules.contains("read"));
        System.out.println("право на удаление " + userRules.contains("delete"));


        Set <Integer> set = new TreeSet<>(); // new HashSet (порядок не определ) //new LinkedHashSet (в порядке в котором их добввляли)/
        // new TreeSet (в отсотрированом порядке)
        //размер автоматичесски увеличиваеться пр  добавление элементров
        for (int i = 15; i > 1; i--) {
            set.add(i*10);
        }
        set.add(81);
        for (Integer iVal : set) {
            System.out.println(iVal);
        }


        List<Object> list = Collections.emptyList();
        List<String> fghdfn = Arrays.asList("1", "123", "fghdfn");

        int[] intArr = new int[100];
        List<int[]> ints = Arrays.asList(intArr);




    }
}
