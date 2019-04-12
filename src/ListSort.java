import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class ListSort {
 
    public static void main(String[] args) {
 
        List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
 
        Map<Object, Object> map = new HashMap<Object, Object>();
 
        Map<Object, Object> map1 = new HashMap<Object, Object>();
        Map<Object, Object> map2 = new HashMap<Object, Object>();
        Map<Object, Object> map3 = new HashMap<Object, Object>();
 
        map.put("number", 1);
        map1.put("number", 6);
        map2.put("number", 4);
        map3.put("number", 3);
        list.add(map);
        list.add(map1);
        list.add(map2);
        list.add(map3);
 
        Collections.sort(list, new Comparator<Map<Object, Object>>() {
 
            public int compare(Map<Object, Object> o1, Map<Object, Object> o2) {
 
                int map1value = (Integer) o1.get("number");
                int map2value = (Integer) o2.get("number");
 
                return map1value - map2value;
            }
        });
        System.out.println(list);
    }
}