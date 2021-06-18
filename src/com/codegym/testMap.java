package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("chó",30);
        hashMap.put("gà",40);
        hashMap.put("bưởi",20);
        hashMap.put("cam",27);
        System.out.println("display");
        System.out.println(hashMap);

        Map<String,Integer>treeMap=new TreeMap<>(hashMap);
        System.out.printf("dispay treemap");
        System.out.println(treeMap);

        Map<String,Integer>linkedHashMap=new LinkedHashMap<>(30,20,true);
        hashMap.put("chó",30);
        hashMap.put("gà",40);
        hashMap.put("bưởi",20);
        hashMap.put("cam",27);
        System.out.println("show"+"bưởi"+linkedHashMap.get("bưởi"));
    }

}
