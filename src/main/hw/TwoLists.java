package main.hw;

import java.util.List;
/**
 * Класс TwoLists, это мой main класс в котором будет написан код.
 * */
public class TwoLists {
    /**
     * Метод twoListsMassage принимает на вход 2 списка,
     * рассчитывает их среднее значение и выдает
     * сообщение по результатам расчета.
     * @param firstList - список чисел.
     * @param secondList - список чисел.
     * @return  - возвращает текст сообщения.
     * */
    public static String twoListsMassage(final List<Integer> firstList,
                                         final List<Integer> secondList) {
        double firstAverage = calculateAverage(firstList);
        double secondAverage = calculateAverage(secondList);
        String result = "";
        if (firstAverage > secondAverage) {
            result = "Первый список имеет большее среднее значение";
            System.out.println("Первый список имеет большее среднее значение");
        }
        if (firstAverage < secondAverage) {
            result = "Второй список имеет большее среднее значение";
            System.out.println("Второй список имеет большее среднее значение");
        }
        if (firstAverage == secondAverage) {
            result = "Средние значения равны";
            System.out.println("Средние значения равны");
        }
        return result;
    }
    /**
     * Метод calculateAverage принимает на вход список чисел
     * и рассчитывает его среднее значение.
     * @param list - список чисел.
     * @return - возвращает среднее значение списка.
     * */
    public static double calculateAverage(final List<Integer> list) {

        if (list == null || list.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int num : list) {
            sum = sum + num;
        }

        return (double) sum / list.size();
    }
}
