package com.datastructure.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Whitelist {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("hello", "help");
        maps.put("hello1", "namaste");
        System.out.println(maps);

        System.out.println(maps.keySet());
        maps.keySet().remove("hello1");
        System.out.println(maps.keySet());
        System.out.println(maps);
    }
}
