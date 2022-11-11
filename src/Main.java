import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringChallenge("12:30pm-12:00am");

    }

    public static String StringChallenge(String str) {
        // code goes here
        String[] newStr = str.split("-");
        int hours1 = Integer.parseInt(newStr[0].substring(0, 2));
        int hours2 = Integer.parseInt(newStr[1].substring(0, 2));
        int min1 = Integer.parseInt(newStr[0].substring(3, 5));
        int min2 = Integer.parseInt(newStr[1].substring(3, 5));
        String zone1 = newStr[0].substring(5, 7);
        String zone2 = newStr[1].substring(5, 7);
        int ans = 0;
        if (zone2.equals(zone1)) {
            if (min1 < min2) {
                
            }
            ans = (hours1 - hours2) * 60;
            ans = ans + min1 - min2;
        } else {

        }
        System.out.println(hours1 + " " + hours2);
        System.out.println(Arrays.toString(newStr));
        return str;
    }
}
