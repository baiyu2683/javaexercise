package com.zh;

import com.sun.scenario.animation.AnimationPulseMBean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zh on 2018-01-25.
 */
public class MyMain {
    public static <T> void method(T a) {
        System.out.println(a.getClass().getTypeName());
    }
    public static void main(String[] args) {
        Holder<Animal> holder = new Holder<>();
        holder.put(new Dog());
        method(holder.get());
        List<String> l = new ArrayList<>();
        l.addAll(new ArrayList<>());

        //通配符
        //上界，集合中除了null不能防止任何对象
        List<? extends Animal> animals = new ArrayList<>();
//        animals.add(new Dog());
//        animals.add(new Object());
//        animals.add(new Animal());
        animals.add(null);

        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Dog());

        //下界，dogs是Dog的基类型组成的集合，则集合中可以防止任何dog和其子类
        List<? super Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
//        dogs.add(new Animal());
//        dogs.add(new Object());
        dogs.add(new ChineseDog());
        dogs.add(null);
        List<?> list = new ArrayList<String>();
    }

    public void method(List list) {
        List<? extends Object> list1 = list;
        List<?> list2 = list;
    }

}