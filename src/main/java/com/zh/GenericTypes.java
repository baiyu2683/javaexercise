package com.zh;

import java.net.InetSocketAddress;
import java.util.List;

/**
 * Created by zh on 2018-01-25.
 */
public class GenericTypes {
    public void method(List<String> list){
        System.out.println("string");
    }

    //类型擦除导致不能重载
//    public int method(List<Integer> list) {
//        System.out.println("int");
//    }
}
