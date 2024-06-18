import java.util.*;

public class M_Problem_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String s : strs) {
            char[] arrCharS = s.toCharArray();
            Arrays.sort(arrCharS);
            String sortedS = new String(arrCharS);
            if (!map.containsKey(sortedS)) {
                map.put(sortedS, new LinkedList<>());
            }
            map.get(sortedS).add(s);
        }
        return new LinkedList<>(map.values());
    }
}
