package Controller;

import UI.Database;
import dataSource.FileHandler;

import java.io.FileNotFoundException;

public class Controller {
    public Database database = new Database();

    public void saveData() throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveData(database.getHeroDatabase());
    }
}
