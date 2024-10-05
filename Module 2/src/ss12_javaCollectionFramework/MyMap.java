package ss12_javaCollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        System.out.println(mySet);

        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1,1);
        myMap.put(2,1);
        myMap.put(3,1);
        myMap.put(4,1);
        myMap.put(5,1);
    }
}
