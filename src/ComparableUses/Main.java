package ComparableUses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Movies m1 = new Movies(8.2, "The Avengers", 2012);
        Movies m2 = new Movies(7.5, "Dark Knight", 2014);
        Movies m3 = new Movies(8.0, "Iron Man 1", 2008);
        Movies m4 = new Movies(7.9, "Black Panther", 2018);
        Movies m5 = new Movies(6.7, "Thor", 2015);
        Movies m6 = new Movies(8.1, "ShangChi", 2020);
        Movies m7 = new Movies(7.9, "Black Panther", 2018);
        Movies m8 = new Movies(8.0, "Iron Man 1", 2008);

        List<Movies> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movies.add(m6);
        movies.add(m7);
        movies.add(m8);

//        System.out.println(movies);
        Collections.sort(movies);
        System.out.println("========================================");
        System.out.println(movies);
        System.out.println("Size of list : " + movies.size());
        System.out.println();
        System.out.println("========================================");
        Set<Movies> set = new HashSet<>();
        set.addAll(movies);
        System.out.println(set);
        System.out.println("Size of set : " + set.size());
    }
}
