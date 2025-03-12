package org.example.general;

import java.util.Arrays;
import java.util.List;

public class General {

    public static void main(String[] args) {

        List<List<String>> categories = Arrays.asList(
                Arrays.asList("Fruits", "Apple", "Banana"),
                Arrays.asList("Vegetables", "Carrot", "Potato"),
                Arrays.asList("Beverages", "Tea", "Coffee", "Juice")
        );


        categories.stream().flatMap(List::stream).forEach(System.out::println);
    }

}
