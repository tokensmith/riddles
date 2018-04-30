package org.rootservices.sum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SumExists {

    public Boolean exists(List<Integer> items, Integer sum) {
        Map<Integer, Integer> lookUp = new HashMap<>();

        for(Integer item: items) {
            Integer target = sum - item;
            if (lookUp.containsKey(target)) {
                return true;
            } else {
                lookUp.put(item, item);
            }
        }
        return false;
    }
}
