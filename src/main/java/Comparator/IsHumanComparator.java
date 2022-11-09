package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class IsHumanComparator implements Comparator <Superhero> {

    public int compare(Superhero o1, Superhero o2) {
        return Boolean.compare(o1.getisHuman(), o2.getisHuman());
    }
}
