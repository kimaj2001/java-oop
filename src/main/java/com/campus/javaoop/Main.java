package com.campus.javaoop;

import com.campus.javaoop.logic.BubbleSort;
import com.campus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[reulst] " + sort.sort(Arrays.asList("1","2","5","3")));
    }
}
