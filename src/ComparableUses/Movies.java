package ComparableUses;

import java.util.Objects;

public class Movies implements Comparable<Movies> {
    private final Double rating;
    private final String name;
    private final Integer year;

    Movies(Double rating, String name, Integer year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "\n Year : " + getYear() + " Name : " + getName() + " Rating : " + getRating() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return movies.getName().equals(name) && movies.getYear().equals(year) && movies.getRating().equals(rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, name, year);
    }

    @Override
    public int compareTo(Movies o) {
        return this.year - o.year;
    }
}
