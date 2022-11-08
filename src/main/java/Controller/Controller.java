package Controller;

import Superhero.Superhero;
import UI.Database;
import dataSource.FileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Controller {
    public Database database = new Database();
    FileHandler fileHandler = new FileHandler();

    public ArrayList<Superhero> getHeroDatabaseFile() {
        //FileOutputStream outputStream = new FileOutputStream(file);
        //fileHandler.readData(database.getHeroDatabase());
        for (Superhero superhero : fileHandler.getArrayFile()){
            fileHandler.getArrayFile().remove(superhero);
            database.getHeroDatabase().add(superhero);
        }
        fileHandler.readData();
        return database.getHeroDatabase();
    }

/*    public void moveArrayList(){
        for (Superhero superhero : fileHandler.getArrayFile()){
            fileHandler.getArrayFile().remove(superhero);
            database.getHeroDatabase().add(superhero);
        }
    }*/

    public void saveData() throws FileNotFoundException {
        fileHandler.saveData(database.getHeroDatabase());
    }
}
