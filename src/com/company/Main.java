package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        //set2
        set2.add(0);
        set2.add(1);
        set2.add(2);

        symmetricDifference1(set1, set2);

    }

    public static Set<Integer> symmetricDifference1(Set<Integer> set1, Set<Integer> set2) {

        System.out.println("Set1 = " + set1);
        System.out.println("Set2 = " + set2);

        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);

        Set<Integer> temp = new HashSet<>();
        temp.addAll(set1);
        temp.retainAll(set2);
        result.removeAll(temp);
        System.out.println("Rest" + result);
        return result;

    }
}
