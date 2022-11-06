package dataSource;

import UI.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileHandler {
    Database database = new Database();
    private final File file = new File("demo.txt");

    public FileHandler() {
    }

    public void saveData () {
        PrintStream ps;
        try { //Try catch exception for the file handling
            ps = new PrintStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ps.println(database.getHeroDatabase());
        ps.close();
    }

}
