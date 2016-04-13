package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();

        Random r = new Random();
        for (int i = 1; i < 1000; i++) {
            int key = r.nextInt(100);

            boolean result = map1.containsKey(key);

            if (result == false) {
                map1.put(key, 1);
            } else {
                int counter = map1.get(key);
                map1.put(key, counter + 1);
            }
        }
        System.out.println("map1=" + map1);

        //1.keyset
        Set<Integer> keys = map1.keySet();
        Iterator<Integer> it1 = keys.iterator();
        while (it1.hasNext()) {
            int key = it1.next();
            int value = map1.get(key);
            System.out.print(key + "=" + value+"; ");
        }
        System.out.println("");
        //2.entry
        Set< Map.Entry<Integer, Integer>> elements = map1.entrySet();
        Iterator<Map.Entry<Integer, Integer>> it2 = elements.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, Integer> element = it2.next();
            System.out.print(element.getKey()+"="+element.getValue()+"; ");
        }
    }

}
