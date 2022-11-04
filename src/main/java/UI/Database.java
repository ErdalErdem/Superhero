package UI;

import Superhero.Superhero;

import java.util.ArrayList;
import java.util.List;

public class Database{
    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> searchResult;


    public Database() {

        Superhero p1 = new Superhero("Superman", false, "Laser", 1938, 10000);
        Superhero p2 = new Superhero("Spiderman", true, "Web", 1962, 7000);
        Superhero p3 = new Superhero("Iron man", true, "Money", 1963, 8000);
        Superhero p4 = new Superhero("Hulk", true, "strength", 1962, 10000);
        Superhero p5 = new Superhero("Batman", true, "Money", 1939, 10000);

        heroDatabase = new ArrayList<Superhero>(List.of(p1, p2, p3, p4, p5));
        searchResult = new ArrayList<>();

    }

    public void tilhoejSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));

    }
/*
    public ArrayList<Superhero.Superhero> takeSuperheroes() {
        return heroDatabase;
    }

 */

    public Superhero findSuperhero(String name) {
        for (Superhero p : heroDatabase) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;

    }

    public ArrayList<Superhero> findSuperheroes(String name) {
        searchResult.clear();
        for (Superhero p : heroDatabase) {
            if (p.getName().equals(name))
                searchResult.add(p);

        }
        return searchResult;
    }

        public void addSuperheroes (String name,boolean isHuman, String superPower,int creationYear, double strength){
            Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);
            heroDatabase.add(superhero);
        }

        public ArrayList<Superhero> getHeroDatabase () {
            return heroDatabase;
        }

        public void addToDatabse (String name,boolean isHuman, String superPower,int creationYear, double strength) {
            heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
        }

    public ArrayList<Superhero> editSuperhero () {
        return heroDatabase;
    }
            public void editSuperhero (String name,boolean isHuman, String superPower,int creationYear, double strength){
        Superhero editSuperhero = new Superhero(name,isHuman, superPower, creationYear, strength);

        }
    public void deleteHero(int heroToDelete){

        int deleteOnIndex = heroToDelete - 1;

        System.out.println(heroDatabase.get(deleteOnIndex).getName() + " has been deleted");

        heroDatabase.remove(deleteOnIndex);
    }

}






