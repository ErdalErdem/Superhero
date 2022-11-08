package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public abstract class CreationYearComparator implements Comparator <Superhero> {

    public int compare(Superhero o1, Superhero o2) {
        return Double.compare(o1.getCreationYear(), o2.getCreationYear());
    }
}
