package Controller;

import UI.Database;
import dataSource.FileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Controller {
    public Database database = new Database();

    public void getHeroDatabaseFile() {
        //FileOutputStream outputStream = new FileOutputStream(file);
        FileHandler fileHandler = new FileHandler();
        //fileHandler.readData(database.getHeroDatabase());
        fileHandler.readData();
    }

    public void saveData() throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveData(database.getHeroDatabase());
    }
}
