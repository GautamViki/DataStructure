import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        String[] strArr = {"hello", "world", "after", "all"};
        List<String> list = Arrays.asList(strArr);
        System.out.println(list);
        Comparator<String> c = (o1, o2) -> {
            if (o1.length() < o2.length()) return -1;
            else if (o1.length() > o2.length()) return 1;
            else return o2.compareTo(o1);
        };
        Collections.sort(list, c);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}

