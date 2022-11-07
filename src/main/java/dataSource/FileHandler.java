package dataSource;

import Superhero.Superhero;
import UI.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandler {
    private final File file = new File("demo.txt");

    public FileHandler() {
    }

    public void saveData (ArrayList <Superhero> superheroes) {
        PrintStream ps;
        try { //Try catch exception for the file handling
            ps = new PrintStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ps.println(superheroes);
        ps.close();
    }

}
