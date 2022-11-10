package db;

import Superhero.Superhero;
import Comparator.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {
    private ArrayList<Superhero> heroDatabase = new ArrayList<>();


    public Superhero findSuperhero(String name) {
        for (Superhero p : heroDatabase) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);
        heroDatabase.add(superhero);
    }

    public ArrayList<Superhero> getHeroDatabase() {
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
    public ArrayList <Superhero> sortByIsHumanOrNot (ArrayList<Superhero> list1){
        ArrayList <Superhero> humanOrNotList = new ArrayList<>();
        humanOrNotList.addAll(list1);
        Collections.sort(humanOrNotList, new IsHumanComparator());
        return humanOrNotList;
    }
    public ArrayList <Superhero> sortSuperPower(ArrayList<Superhero> list2){
        ArrayList<Superhero> superPowerList = new ArrayList<>();
        superPowerList.addAll(list2);
        Collections.sort(superPowerList, new SuperPowerComparator());
        return superPowerList;
    }
    public ArrayList <Superhero> sortCreationYear (ArrayList <Superhero> list3){
        ArrayList <Superhero> creationYearList = new ArrayList<>();
        creationYearList.addAll(list3);
        Collections.sort(creationYearList, new CreationYearComparator().reversed());
        return creationYearList;
    }
    public ArrayList <Superhero> sortSuperStrength(ArrayList<Superhero> list4){
        ArrayList<Superhero> strengthList = new ArrayList<>();
        strengthList.addAll(list4);
        Collections.sort(strengthList, new StrengthComparator().reversed());
        return strengthList;
    }

    public ArrayList<Superhero> sortByPrimarySecondary(ArrayList<Superhero> unsortedList, int a, int b) {
        ArrayList<Superhero> sortingList = new ArrayList<>(unsortedList);

        Comparator<Superhero> comparator1 = null;
        Comparator<Superhero> comparator2 = null;

        switch (a) {
            case 1 -> comparator1 = new NameComparator();
            case 2 -> comparator1 = new IsHumanComparator();
            case 3 -> comparator1 = new SuperPowerComparator();
            case 4 -> comparator1 = new CreationYearComparator().reversed();
            case 5 -> comparator1 = new StrengthComparator().reversed();
        }

        switch (b) {
            case 1 -> comparator2 = new NameComparator();
            case 2 -> comparator2 = new IsHumanComparator();
            case 3 -> comparator2 = new SuperPowerComparator();
            case 4 -> comparator2 = new CreationYearComparator().reversed();
            case 5 -> comparator2 = new StrengthComparator().reversed();
        }
        if(!comparator1.getClass().equals(comparator2.getClass()))
            Collections.sort(sortingList, comparator1.thenComparing(comparator2));
        else{
            throw new IllegalArgumentException();
        }
        return sortingList;
    }

}






