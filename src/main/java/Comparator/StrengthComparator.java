package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public abstract class StrengthComparator implements Comparator <Superhero> {

    public int compare(Superhero o1, Superhero o2) {
        return Double.compare(o1.getStrength(), o2.getStrength());
    }
}
