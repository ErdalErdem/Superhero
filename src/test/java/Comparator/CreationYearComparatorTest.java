package Comparator;

import Controller.Controller;
import Superhero.Superhero;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreationYearComparatorTest {

    @Test
    void compare() {
        Controller controller = new Controller();
        Superhero s1 = new Superhero("ole", true, "fisker", 1930, 10);
        Superhero s2 = new Superhero("batman", true, "bat powers", 1986, 100);
        Superhero s3 = new Superhero("spiderman", true, "spider powers", 2005, 50);
        Superhero s4 = new Superhero("bjorn", true, "advokat", 1990, 5);
        ArrayList<Superhero> actual = new ArrayList<Superhero>(Arrays.asList(s1, s2, s3, s4));
        ArrayList<Superhero> expected = new ArrayList<Superhero>(Arrays.asList(s3, s4, s2, s1)); //Den rigtige rækkefølge
        //Sorterer array list "actual" ifølge vores comparator som så burde give den samme rækkefølge som array list "expected"
        assertEquals(controller.sortCreationYear(actual), expected);
    }
}