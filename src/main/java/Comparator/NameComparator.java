package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public abstract class NameComparator implements Comparator<Superhero> {

    public int compare(Superhero o1, Superhero o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
