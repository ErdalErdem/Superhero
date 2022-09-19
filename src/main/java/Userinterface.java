import java.util.Scanner;

public class Userinterface {

    private Database db = new Database();

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int userChoice = -1;

        System.out.println("Welcome to the hero collector\n" +
                "________________________________");

        while (userChoice != 9) {
            System.out.println("""                  
                    1. Add Superhero
                    2. Superhero List
                    3. Search Superhero
                    9. End Program
                    """);

            userChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            UserChoice(userChoice);

        }
    }

    public void UserChoice(int userChoice) {
        if (userChoice == 1)
            addSuperhero(); //Crud operation
        else if (userChoice == 2)
            superheroList(); //Crud operation
        else if (userChoice == 3)
            searchInput();
    }

    public void addSuperhero() {
        System.out.println("Enter the superhero's real name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println("Enter the superhero's year of publication: ");
        // int year = scanner.nextInt();
        int year = readIntger();

        System.out.println("Enter the superhero's strength: ");
        // double strength = scanner.nextDouble();
        double strength = readIntger();
        db.addSuperheroes(name, true, power, year, strength);
    }

    public void superheroList() {

        if (db.getHeroDatabase().size() == 0) {
            System.out.println("There's no Superhero registered...\n");
        } else {
            System.out.println("List of Superhero's registered\n");
            for (Superhero superhero : db.getHeroDatabase()) {
                System.out.println("Name:" + " " + superhero.getName() + " " + "Human:" + " " + superhero.getisHuman()+ " " + "Superpower:" + " " + superhero.getSuperPower()+ " " + "Year of creation" + " " + superhero.getCreationYear()+ " " + "Strength" + " " + superhero.getStrengh());
            }
        }
    }

    public void searchInput() {
        System.out.println("Enter Superhero name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.findSuperhero(findHero);
        if (superhero != null) {
            System.out.println("Information" + "\n Name:" + " " + superhero.getName() + " " + "Human:" + " " + superhero.getisHuman() + " " + "Superpower" +  " " + superhero.getSuperPower() + " " +"Year of creation" + " " + superhero.getCreationYear() + " " + "Strength" + " " + superhero.getStrengh());
        } else {
            System.out.println("Found nothing with this name.");
        }
    }

    public int readIntger() {
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println(text + " " + "Ugyldig data, indtast et tal.");
        }
        int result = scanner.nextInt();
        return result;
    }
}













