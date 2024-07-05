package vn.edu.likelion.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1, 7, 18, 25, 77, 300, 101);

        int minValue = listInteger.stream().sorted().limit(1).findFirst().orElse(0);
        int maxSecondValue = listInteger.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().orElse(0);

        System.out.println("Array elements: " + listInteger);
        System.out.println("Second largest element: " + maxSecondValue);
        System.out.println("The smallest element: " + minValue);
    }
}
