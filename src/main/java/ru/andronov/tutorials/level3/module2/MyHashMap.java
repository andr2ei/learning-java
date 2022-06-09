package ru.andronov.tutorials.level3.module2;

import ru.andronov.tutorials.level3.module1.Cat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<>(10);
        map.put("my_cat", new Cat("Barsik", 10));
        map.put("friends_cat", new Cat("Tom", 11));
        map.put("parents_cat", new Cat("Fantik", 11));
        for (Map.Entry<String, Cat> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " " + kv.getValue());
        }
        System.out.println();
        map.remove("my_cat");
        for (Map.Entry<String, Cat> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " " + kv.getValue());
        }
        System.out.println();
        Iterator<Map.Entry<String, Cat>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());
            iter.remove();
        }

        for (Map.Entry<String, Cat> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " " + kv.getValue());
        }

    }
}
