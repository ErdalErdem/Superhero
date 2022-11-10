package Controller;

import Superhero.Superhero;
import db.Database;
import dataSource.FileHandler;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Controller {
    public Database database = new Database();
    FileHandler fileHandler = new FileHandler();

    public ArrayList<Superhero> readData() { //Reads data file by calling Filehandler class method
        return fileHandler.readData();
    }

    public void saveData() throws FileNotFoundException { //Saves data file by calling Filehandler class method
        fileHandler.saveData(database.getHeroDatabase());
    }

    public ArrayList<Superhero> SortSuperNames(ArrayList<Superhero> unsortedList) { //Sorts data file with Database class method
        return database.SortSuperNames(unsortedList);
    }

    public ArrayList<Superhero> sortByIsHumanOrNot(ArrayList<Superhero> list1) {
        return database.sortByIsHumanOrNot(list1);
    }

    public ArrayList<Superhero> sortSuperPower(ArrayList<Superhero> list2) {
        return database.sortSuperPower(list2);
    }

    public ArrayList<Superhero> sortCreationYear(ArrayList<Superhero> list3) {
        return database.sortCreationYear(list3);
    }

    public ArrayList<Superhero> sortSuperStrength(ArrayList<Superhero> list4) {
        return database.sortSuperStrength(list4);
    }

    public ArrayList<Superhero> sortByPrimarySecondary(ArrayList<Superhero> unsortedList, int valg1, int valg2) {
        return database.sortByPrimarySecondary(unsortedList, valg1, valg2);
    }
}