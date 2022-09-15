import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> searchResult;


    public Database() {

        Superhero p1 = new Superhero("Superman", false, "laser", 1938, 9000);
        Superhero p2 = new Superhero("Superman", false, "laser", 1938, 9000);
        Superhero p3 = new Superhero("Superman", false, "laser", 1938, 9000);
        Superhero p4 = new Superhero("Superman", false, "laser", 1938, 9000);
        Superhero p5 = new Superhero("Superman", false, "laser", 1938, 9000);

        heroDatabase = new ArrayList<Superhero>(List.of(p1, p2, p3, p4, p5));
        searchResult = new ArrayList<>();
    }


    public void tilhoejSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
    }

    public ArrayList<Superhero> takeSuperheroes() {
        return heroDatabase;
    }

    public Superhero findSuperhero(String name) {
        for (Superhero p : heroDatabase) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;

    }

    public ArrayList<Superhero> findSuperheroes(String name) {
        for (Superhero p : heroDatabase) {
            if (p.getName().equals(name))
                searchResult.add(p);

        }
        return searchResult;
    }

        public void addSuperheroes (String name,boolean isHuman, String superPower,int creationYear, double strength){
            Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);

        }

        public ArrayList<Superhero> getHeroDatabase () {
            return heroDatabase;
        }

        public void addToDatabse (String name,boolean isHuman, String superPower,int creationYear, double strength){
            heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));


        }
    }





