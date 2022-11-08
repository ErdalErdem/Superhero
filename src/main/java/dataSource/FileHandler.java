package dataSource;

import Superhero.Superhero;
import UI.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    //private final File file = new File("demo.txt");
    private PrintStream ps;

    ArrayList<Superhero> readFile = new ArrayList<>();

    public FileHandler() {
    }

/*    public void readData (ArrayList <Superhero> superheroes) {
        try {
            for (int i = 0; i < superheroes.size(); i++){
                ps.println(superheroes.get(i));
            }
        }
        catch (NullPointerException NPE) {
            throw new RuntimeException(NPE);
        }
    }*/

    public void readData () {
        Scanner sc = new Scanner("superheroes.txt");
        while (sc.hasNextLine()){
            String line = sc.next();
            String[] attributes = line.split(" ");
            Superhero readHero = new Superhero(
                    attributes[0],
                    Boolean.parseBoolean(attributes[1]),
                    attributes[2],
                    Integer.parseInt(attributes[3]),
                    Double.parseDouble(attributes[4]));
            readFile.add(readHero);
        }
    }

    public void saveData (ArrayList <Superhero> superheroes) {
        try { //Try catch exception for the file handling
            ps = new PrintStream("superheroes.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //ps.println(superheroes);
        for (int i = 0; i < superheroes.size(); i++){
            ps.print(superheroes.get(i));
        }
        ps.close();
    }

}
