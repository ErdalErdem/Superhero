package Controller;

import UI.Database;
import dataSource.FileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Controller {
    public Database database = new Database();

    public File getHeroDatabaseFile(File file) {
        //FileOutputStream outputStream = new FileOutputStream(file);
        return file;
    }

    public void saveData() throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveData(database.getHeroDatabase());
    }
}
