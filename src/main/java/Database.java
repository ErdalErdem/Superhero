import java.util.ArrayList;
import java.util.Scanner;

public class Database {

private ArrayList<Superhero> heroDatabase = new ArrayList<>();

public Database() {
    ArrayList<Superhero> heroList = new ArrayList<>();
}
public  ArrayList<Superhero> getHeroDatabase() {
    return heroDatabase;
}

public void addToDatabse (String name, boolean isHuman, String superPower, int creationYear, double strength) {
    heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
}

public  void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
    Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);

    }
}

