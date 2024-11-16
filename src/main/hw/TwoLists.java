package main.hw;

import java.util.List;

public class TwoLists {
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
