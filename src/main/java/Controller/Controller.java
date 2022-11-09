package Controller;

import Superhero.Superhero;
import UI.Database;
import dataSource.FileHandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;


public class Controller {
    public Database database = new Database();
    FileHandler fileHandler = new FileHandler();

/*    public void MoveDataToDatabase() {            //Unødvendig, kan måske bruges senere
        ArrayList<Superhero> fileData = fileHandler.readData();
        for (int i = 0; i < fileHandler.getArrayFile().size(); i++){
            Superhero superhero = fileData.get(i);
            database.getHeroDatabase().add(superhero);
            fileData.remove(superhero);
        }
    }*/

    public ArrayList<Superhero> readData () { //Reads data file by calling Filehandler class method
        return fileHandler.readData();
    }

    public void saveData() throws FileNotFoundException { //Saves data file by calling Filehandler class method
        fileHandler.saveData(database.getHeroDatabase());
    }

    public ArrayList<Superhero> SortSuperNames(ArrayList<Superhero> unsortedList) { //Sorts data file with Database class method
        return database.SortSuperNames(unsortedList);
    }
    public ArrayList <Superhero> sortByIsHumanOrNot (ArrayList<Superhero> list1){
        return database.sortByIsHumanOrNot(list1);
    }
    public ArrayList <Superhero> sortSuperPower (ArrayList<Superhero> list2){
        return database.sortSuperPower(list2);
    }
    public ArrayList <Superhero> sortCreationYear (ArrayList<Superhero> list3){
        return database.sortCreationYear(list3);
    }
    public ArrayList <Superhero> sortSuperStrength (ArrayList<Superhero> list4){
        return database.sortSuperStrength(list4);
    }

}
