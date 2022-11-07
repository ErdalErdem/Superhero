package dataSource;

import Superhero.Superhero;
import UI.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandler {
    //private final File file = new File("demo.txt");

    public FileHandler() {
    }

    public void saveData (ArrayList <Superhero> superheroes) {
        PrintStream ps;
        try { //Try catch exception for the file handling
            ps = new PrintStream("superheroes.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //ps.println(superheroes);
        for (int i = 0; i < superheroes.size(); i++){
            ps.println(superheroes.get(i));
        }
        ps.close();
    }

}
