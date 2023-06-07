package com.campus.javaoop.service;

import com.campus.javaoop.logic.JavaSort;
import com.campus.javaoop.logic.Sort;

import java.util.List;

public class Service {
    private final Sort<String> sort;

    public Service(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
