package dataSource;

import Superhero.Superhero;
import UI.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    ArrayList<Superhero> arrayFile = new ArrayList<>();

    public FileHandler() {
    }


    public ArrayList<Superhero> getArrayFile(){
        return arrayFile;
    }

    public ArrayList<Superhero> readData () {
        //Scanner sc = null;
        ArrayList<Superhero> readList = new ArrayList<Superhero>();
        try {
            Scanner sc = new Scanner(new File("superheroes.csv"));
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] attributes = line.split(";");
                Superhero readHero = new Superhero(
                        attributes[0],
                        Boolean.parseBoolean(attributes[1]),
                        attributes[2],
                        Integer.parseInt(attributes[3]),
                        Double.parseDouble(attributes[4]));
                readList.add(readHero);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return readList;
    }

    public void saveData (ArrayList <Superhero> superheroes) {
        try { //Try catch exception for the file handling
            PrintStream ps = new PrintStream(new File("superheroes.csv"));
            for (Superhero superhero : superheroes) {
                ps.print(superhero.getName());
                ps.print(";");
                ps.print(superhero.getisHuman());
                ps.print(";");
                ps.print(superhero.getSuperPower());
                ps.print(";");
                ps.print(superhero.getCreationYear());
                ps.print(";");
                ps.print(superhero.getStrength());
                ps.println();
            }
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
