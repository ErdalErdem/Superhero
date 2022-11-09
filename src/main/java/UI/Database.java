package UI;

import Superhero.Superhero;
import Comparator.*;
import java.util.ArrayList;
import java.util.Collections;

public class Database {
    private ArrayList<Superhero> heroDatabase = new ArrayList<>();
    private ArrayList<Superhero> searchResult = new ArrayList<>();


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

    public void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);
        heroDatabase.add(superhero);
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }

    public void addToDatabase(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
    }

    public ArrayList<Superhero> editSuperhero() {
        return heroDatabase;
    }

    public void editSuperhero(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        Superhero editSuperhero = new Superhero(name, isHuman, superPower, creationYear, strength);
    }

    public void deleteHero(int heroToDelete) {

        int deleteOnIndex = heroToDelete - 1;

        System.out.println(heroDatabase.get(deleteOnIndex).getName() + " has been deleted");

        heroDatabase.remove(deleteOnIndex);
    }

    public ArrayList<Superhero> SortSuperNames(ArrayList<Superhero> unsortedList) {
        ArrayList<Superhero> nameSortedList = new ArrayList<>();
        nameSortedList.addAll(unsortedList);
        Collections.sort(nameSortedList, new NameComparator());
        return nameSortedList;
    }

}






