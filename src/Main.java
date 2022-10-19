import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = "caaat";
        String str2 = "att";
        List<Character> list = new ArrayList<>();
        int size = 0;
        int count = 0, no = 0;
        if (str1.length() >= str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                list.add(str1.charAt(i));
            }
            size = list.size();
            for (int i = 0; i < str2.length(); i++) {
                if (list.contains(str2.charAt(i))) {
                    count++;
                    list.remove((Character) str2.charAt(i));

                } else no++;
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                list.add(str2.charAt(i));
            }
            for (int i = 0; i < str1.length(); i++) {
                if (list.contains(str1.charAt(i))) count++;
                else no++;
            }
        }
        System.out.println(size - count + no + " first method");


        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        count = 0;
        for (Map.Entry m1 : map2.entrySet()) {
            if (map1.containsKey(m1.getKey())) {
                int temp = map1.get(m1.getKey()) - (int) m1.getValue();
                count += Math.abs(temp);
                map1.remove(m1.getKey());
            } else count += (int) m1.getValue();
        }
        for (Map.Entry m : map1.entrySet()) {
            count += (int) m.getValue();
        }
        System.out.println(count + " second method");
    }
}
