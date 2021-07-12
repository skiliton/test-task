package com.repeta;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    static char firstNotRepeatingCharacter(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        s
                .chars()
                .mapToObj(i -> (char)i)
                .forEach(c -> {
                    map.put(c,map.getOrDefault(c,0)+1);
                });
        return map
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse('_');
    }
}
