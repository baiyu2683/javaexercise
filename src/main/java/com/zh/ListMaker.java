package com.zh;

import com.sun.xml.internal.fastinfoset.util.StringIntMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zh on 2018-01-25.
 */
public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<>();
    }

    T[] arr;

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> strings = stringMaker.create();
        stringMaker.arr = (String[])Array.newInstance(String.class, 10);
        System.out.println(stringMaker.arr.length);
    }
}
