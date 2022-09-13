import java.util.ArrayList;

public class Database {

private ArrayList<Superhero> name = new ArrayList<>();

public  void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
    Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);
//database[count] = superhero;
//count++;

    }
}

