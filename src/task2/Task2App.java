package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2App {
    public static void main(String[] args) {

        List<Integer> listInts1 = new ArrayList<>();
        List<Integer> listInts2 = new ArrayList<>();

        listInts1.add(1);
        listInts1.add(2);
        listInts1.add(3);
        listInts1.add(4);
        listInts1.add(5);

        listInts2.add(1);
        listInts2.add(2);
        listInts2.add(3);
        listInts2.add(4);
        listInts2.add(5);
        listInts2.add(6);
        listInts2.add(7);
        listInts2.add(8);
        listInts2.add(9);

        System.out.println("\nЭлементы списка 1: \n" + listInts1);
        System.out.println("\nЭлементы списка 2: \n" + listInts2);

        System.out.println("\nДобавление всех значений из списка 2 в список 1");
        CollectionUtils.addAll(listInts2, listInts1);

        System.out.println("Список 1 после добавления: \n" + listInts1);

        System.out.print("\nПолучение индекса третьего элемента в первом списке: ");
        int el = listInts1.get(2);
        System.out.println(CollectionUtils.indexOf(listInts1, el));

        System.out.println("\nСокращение списка 1 до 3-х элементов: ");
        listInts1 = CollectionUtils.limit(listInts1, 3);
        System.out.println(listInts1);

        System.out.println("\nДобавление элемента \"999\" в список 1:");
        CollectionUtils.add(listInts1, 999);
        System.out.println(listInts1);



        System.out.println("Удаление всех элементов, содержащихся в списке 2 из списка 1 ");
        CollectionUtils.removeAll(listInts2, listInts1);
        System.out.println(listInts2);

        System.out.println("\nПроверим, содержатся ли элементы первого списка, " +
                "во втором списке:\n результат - " + CollectionUtils.containsAll(listInts1, listInts2));
        listInts2 = listInts1;

        System.out.println("\nТеперь присвоим значение списка 1 списку 2 и проверим снова:\n" +
                "результат - " + CollectionUtils.containsAll(listInts1, listInts2));
    }
}

