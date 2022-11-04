import UI.Userinterface;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveData();
        Userinterface ui = new Userinterface();
        ui.startProgram();

    }
}





