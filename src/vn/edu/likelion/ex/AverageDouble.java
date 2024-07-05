package vn.edu.likelion.ex;

import java.util.Arrays;
import java.util.List;

public class AverageDouble {
    public static void main(String[] args) {
        List<Double> listDouble = Arrays.asList(7.6, 4.87, 9.01, 3.5, 6.34);

        double result = listDouble.stream().mapToDouble(Double::doubleValue).
                average().orElse(0.0);

        System.out.println(result);
    }
}
