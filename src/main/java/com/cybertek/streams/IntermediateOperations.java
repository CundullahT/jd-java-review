package com.cybertek.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Integer[] numbersArray = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> numbersStream = Arrays.stream(numbersArray);

        System.out.println("***********FILTER***********");

        //FILTER
        System.out.println(numbersStream.filter(number -> number%2 !=0).count());

        Stream<String> strStream = Arrays.asList("Apple","Orange","Kiwi","Banana", "Apple","Cheery","Mango").stream();
        System.out.println(strStream.filter(str -> str.length() == 5).count());

        //System.out.println(strStream.filter(str -> str.startsWith("A")).count()); //ERROR

        Arrays.asList("Apple","Orange","Kiwi","Banana", "Apple","Cheery","Mango").stream().filter(str -> str.equals("Apple")).forEach(str -> System.out.println(str));

        System.out.println("***********MAP***********");
        Arrays.asList("Apple","Orange","Kiwi","Banana", "Apple","Cheery","Mango").stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));

        System.out.println("***********DISTINCT***********");
        Arrays.asList("Apple","Orange","Kiwi","Banana", "Apple","Cheery","Mango").stream().distinct().forEach(str -> System.out.println(str));

        System.out.println("***********SORTED ORDER***********");
        Arrays.asList(1,2,3,4,6,5,7,8,9).stream().sorted().forEach(number -> System.out.println(number));

        System.out.println("***********SORTED REVERSED ORDER***********");
        Arrays.asList(1,2,3,4,6,5,7,8,9).stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));











    }
}
