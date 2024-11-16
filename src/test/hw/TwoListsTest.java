package hw;

import main.hw.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoListsTest {
    @Test
    void testCalculateAverage() {
        List<Integer> list = Arrays.asList(12,33,44,55);
        assertEquals(13.75 , TwoLists.calculateAverage(list));
    }
    @Test
    void testCompareLists() {
        List<Integer> firstListTest = Arrays.asList(12,33,44,55);
        List<Integer> secondListTest = Arrays.asList(12,33,44,55);
        assertEquals("Средние значения равны" , TwoLists.twoListsMassage(firstListTest,secondListTest ));
    }

    @Test
    void testCompareLists2() {
        List<Integer> firstListTest = Arrays.asList(12,23,25,26,37);
        List<Integer> secondListTest = Arrays.asList(12,23,25,26,36);
        assertEquals("Первый список имеет большее среднее значение", TwoLists.twoListsMassage(firstListTest,secondListTest ));
    }

    @Test
    void testCompareLists3() {
        List<Integer> firstListTest = Arrays.asList(12,23,25,26,36);
        List<Integer> secondListTest = Arrays.asList(12,23,25,26,37);
        assertEquals("Второй список имеет большее среднее значение", TwoLists.twoListsMassage(firstListTest,secondListTest ));
    }
}