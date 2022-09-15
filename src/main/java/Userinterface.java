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
        int year = scanner.nextInt();

        System.out.println("Enter the superhero's strength: ");
        double strength = scanner.nextDouble();

        db.addSuperheroes(name, true, power, year, strength);
    }

    public void superheroList() {

        if (db.getHeroDatabase().size() == 0) {
            System.out.println("There's no Superhero registered...\n");
        } else {
            System.out.println("List of Superhero's registered\n");
            for (Superhero superhero : db.getHeroDatabase()) {
                System.out.println(superhero);
            }
        }
    }

    public void searchInput() {
        System.out.println("Enter Superhero name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.findSuperhero(findHero);
        if (superhero != null) {
            System.out.println("Information" + "\n" + superhero);
        } else {
            System.out.println("Found nothing with this name.");
        }
    }
}














