package com.cybertek.streams;

import com.cybertek.collections.ArrayLists;
import com.cybertek.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {

        System.out.println("***********COUNT***********");
        long count = Arrays.asList(1,2,34,5,6,6,4,6,5).stream().count();
        System.out.println(count);

        long count2 = Arrays.asList("Apple","Orange","Kiwi","Banana", "Apple","Cheery","Mango").stream().filter(str -> str.equals("Apple")).count();
        System.out.println(count2);

        System.out.println("***********FIND FIRST - FIND ANY***********");
        Role r = ArrayLists.createRoleList().stream().filter(role -> role.getDescription().equals("Employee")).findFirst().get();
        System.out.println(r.getId());

        Role r2 = ArrayLists.createRoleList().stream().filter(role -> role.getDescription().equals("Employee")).findAny().get();
        System.out.println(r2.getId());

        System.out.println("***********COLLECT***********");
        List<String> appleList = Arrays.asList("Apple","Orange","Kiwi","Banana", "Apple","Cheery","Mango")
                .stream().filter(s -> s.equals("Apple")).collect(Collectors.toList());

        System.out.println(appleList.stream().count());

        System.out.println("***********REDUCE***********");
        int total = Arrays.asList(3,4,5,6,12,20).stream().reduce(5,(x,y) -> x+y);
        System.out.println(total);

        String word = Arrays.asList("C","Y","B","E","R","T","E","K").stream().reduce("",(a,b) -> a+b);
        System.out.println(word);










    }
}
