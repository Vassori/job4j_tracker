package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("vassori.mail@gmail.com", "Oleg Komissarov");
        map.put("vassori.mail@gmail.com", "Komissarov Oleg");
        map.put("gaku.jp@gmail.com", "コミッサロフ・オレグ");
        for (String key : map.keySet()) {
            String name = map.get(key);
            System.out.printf("Email: %s = Name: %s\n", key, name);
        }
    }
}
