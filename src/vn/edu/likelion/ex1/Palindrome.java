package vn.edu.likelion.ex1;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {
    public static void main(String[] args) {

        Predicate<String> convert = (s) -> {
                String reversed = new StringBuilder(s).reverse().toString();
                return reversed.equals(s);
        };


//        System.out.println("Madam is a palindrome? " + convert.test("Madam"));
//        System.out.println("radar is a palindrome? " + convert.test("radar"));
//        System.out.println("defied is a palindrome? " + convert.test("defied"));

        System.out.println("Madam is a palindrome? " + compare("Madam"));
        System.out.println("radar is a palindrome? " + compare("radar"));
        System.out.println("defied is a palindrome? " + compare("defied"));

    }

    private static boolean compare(String string){
        String reversed = Stream.of(string).map(s1 -> new StringBuilder(string).reverse()).collect(Collectors.joining());
        return reversed.equals(string);
    }
}
