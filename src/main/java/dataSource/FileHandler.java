package dataSource;

import UI.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileHandler {
    Database database = new Database();
    private final File file = new File("demo.txt");
    PrintStream ps = new PrintStream(file);

    public FileHandler() throws FileNotFoundException {
    }

    public void saveData (){
        ps.println(database.getHeroDatabase());
        ps.close();
    }

}
