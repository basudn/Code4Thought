package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("red", 1);
		map.put("blue", 0);
		map.put("orange", 2);
		map.put("indigo", 2);
		List<String> returnList = new ArrayList<>();
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return o2.getValue() - o1.getValue();
                }
			}
        });
        int count = 0;
        for (Entry<String, Integer> entry : list) {
        	if(count == 0) {
        		count = entry.getValue();
        		returnList.add(entry.getKey());
        	} else if(count == entry.getValue()) {
        		returnList.add(entry.getKey());
        	}
		}
        System.out.println(returnList);
	}
}
