import Superhero.Superhero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database db;

    @BeforeEach
    void setUp() {
        // test fixture
        db = new Database();
        db.getHeroDatabase().addAll(List.of(
                new Superhero("Superman", false, "Laser", 1938, 10000.0),
                new Superhero("Spiderman", true, "Web", 1962, 7000),
                new Superhero("Iron man", true, "Money", 1963, 8000),
                new Superhero("Hulk", true, "strength", 1962, 10000),
                new Superhero("Batman", true, "Money", 1939, 10000)));

    }

    @Test
    void findSuperhero() {
        // Arrange test
        String name = "Superman";
        boolean isHuman = false;
        String superPower = "Laser";
        int creationYear = 1938;
        double strentgh = 10000.0;

        // act on method
        Superhero result = db.findSuperhero("Superman");

        //Assert result
        assertEquals(result.getName(), name);
    }

    @Test
    void findSuperhero1() {
        // Arrange test
        String name = "Batman";
        boolean isHuman = true;
        String superPower = "Money";
        int creationYear = 1939;
        double strentgh = 10000.0;

        // act on method
        Superhero result = db.findSuperhero("Batman");

        //Assert result
        assertEquals(result.getName(), name);
    }
    public Superhero findSuperhero2(String name) {
        // test sub
        // TODO lave en tester
        return new Superhero(name, false, "", 0, 0.0);

    }
}

