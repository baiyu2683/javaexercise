package com.zh;

import java.util.Arrays;

/**
 * Created by zh on 2018-01-25.
 */
public class Holder<T> {
    T t;
    public T get() {
        System.out.println(t.getClass().getTypeName());
        return t;
    }
    public boolean put(T t) {
        System.out.println(Arrays.toString(this.getClass().getTypeParameters()));
        this.t = t;
        return true;
    }
}
