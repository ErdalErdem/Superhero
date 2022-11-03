package UI;

import java.util.Scanner;
import Controller.Controller;
import Superhero.Superhero;
import Colors.ConsoleColors;
public class Userinterface {
    private Controller controller = new Controller();


    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int userChoice = -1;

        System.out.println("Welcome to the hero collector\n" +
                "________________________________");

        while (userChoice != 9) {
            System.out.println("""                  
                    1. Add Superhero.Superhero
                    2. Superhero.Superhero List
                    3. Search Superhero.Superhero
                    4. Edit Superhero.Superhero
                    5. Delete hero
                    9. End Program
                    """);

            userChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            UserChoice(userChoice);

        }
    }

    // brugers muligheder af valg

    public void UserChoice(int userChoice) {
        if (userChoice == 1)
            addSuperhero(); //Crud operation
        else if (userChoice == 2)
            superheroList(); //Crud operation
        else if (userChoice == 3)
            searchInput();
        else if (userChoice == 4)
            editSuperhero();
        else if (userChoice == 5)
            deleteHero();
    }

    // tilføje superhelte

    public void addSuperhero() {
        System.out.println("Enter the superhero's real name:");
        String name = scanner.nextLine();

       /* System.out.println("Is your superhero human?");
        boolean isHuman = */

        System.out.println("Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println("Enter the superhero's year of publication: ");
        // int year = scanner.nextInt();
        int year = readIntger();

        System.out.println("Enter the superhero's strength:");
        // double strength = scanner.nextDouble();
        double strength = readDouble();
        controller.database.addSuperheroes(name, true, power, year, strength);
    }

    // fremvisning af superhetle liste
    public void superheroList() {

        if (controller.database.getHeroDatabase().size() == 0) {
            System.out.println("There's no Superhero.Superhero registered...\n" + ConsoleColors.RED);
        } else {
            System.out.println("List of Superhero.Superhero's registered\n");
            for (Superhero superhero : controller.database.getHeroDatabase()) {
                System.out.println("Name:" + " " + superhero.getName() + " " + "Human:" + " " + superhero.getisHuman() + " " + "Superpower:" + " " + superhero.getSuperPower() + " " + "Year of creation" + " " + superhero.getCreationYear() + " " + "Strength" + " " + superhero.getStrength());
            }
        }
    }

    // søgning af superhelte.

    public void searchInput() {
        System.out.println("Enter Superhero.Superhero name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = controller.database.findSuperhero(findHero);
        if (superhero != null) {
            System.out.println("Information" + "\n Name:" + " " + superhero.getName() + " " + "Human:" + " " + superhero.getisHuman() + " " + "Superpower" + " " + superhero.getSuperPower() + " " + "Year of creation" + " " + superhero.getCreationYear() + " " + "Strength" + " " + superhero.getStrength());
        } else {
            System.out.println("Found nothing with this name."+ ConsoleColors.RED);
        }
    }

    // Så bruger kan redigere på fremtidige superhelte.

    public void editSuperhero() {

        int editUserChoice = -1;

        System.out.println("""
                                
                Welcome to superhero edit tool!
                                
                """);
        while (editUserChoice != 9) {
            System.out.println("""
                    1. Edit 
                    9. Back to main menu
                    """);

            editUserChoice = readIntger();
            scanner.nextLine();
            editSuperhero(editUserChoice);
        }

    }

    private void editSuperhero(int editUserChoice) {
        if (editUserChoice == 1)
            editTool();
        else if (editUserChoice != 9) {
            System.out.println("Please try again, choose between 1 or 9." + ConsoleColors.RED);
        }
    }

    public void editTool() {

        if (controller.database.getHeroDatabase().size() == 0) {
            System.out.println("There's no Superhero.Superhero registered"+ ConsoleColors.RED);
        } else {
            System.out.println("List of Superhero.Superhero's registered");

            for (int i = 0; i < controller.database.getHeroDatabase().size(); i++) {
                System.out.println(i + 1 + " Superhero.Superhero: \n" + controller.database.getHeroDatabase().get(i));
            }


            System.out.println("Enter which superhero you want to change");
            int numb = scanner.nextInt();
            Superhero editHero;
            scanner.nextLine();

            if (numb - 1 >= controller.database.getHeroDatabase().size()) {
                System.out.println("Invalid data, try again"+ ConsoleColors.RED);
            } else {
                editHero = controller.database.getHeroDatabase().get(numb - 1);
                System.out.println("Edit superhero" + editHero.getName() + " " + editHero.getSuperPower() + " " + editHero.getCreationYear() + " " + editHero.getStrength());

                System.out.println("Edit superhero and press enter" + " " + "If no need for editing press enter");


                System.out.println("Current name: " + editHero.getName());
                System.out.println("Please enter the new name below");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    editHero.setName();
                }
                System.out.println("Current Super Power: " + editHero.getSuperPower());
                System.out.println("Please enter the updated superpower");
                String newPower = scanner.nextLine();
                if (!newPower.isEmpty()) {
                    editHero.setSuperPower();
                }

                System.out.println("Current Year of publication: " + editHero.getCreationYear());
                System.out.println("Please enter updated creation year");
                String newYear = scanner.nextLine();
                if (!newYear.isEmpty()) {
                    editHero.setCreationYear();
                }

                System.out.println("Strength: " + editHero.getStrength());
                System.out.println("Enter the updated strength");
                String newStrength = scanner.nextLine();
                if (!newStrength.isEmpty()) {
                    editHero.setStrength();
                }
            }
        }
    }

    // Bruger velighed: Kode der forhindre bruger at lave ERRORS.

    public int readIntger() {
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println(text + " " + "Invalid data, input a number please."+ ConsoleColors.RED);
        }
        int result = scanner.nextInt();
        return result;
    }


    public int readDouble() {
        while (!scanner.hasNextDouble()) {
            String text = scanner.next();
            System.out.println(text + " " + "Invalid data, input a number please."+ ConsoleColors.RED);
        }
        int result = scanner.nextInt();
        return result;
    }


    // for at slette superheroes

    private void deleteHero() {

        if (controller.database.getHeroDatabase().isEmpty()) {
            System.out.println("No heroes found in our database"+ ConsoleColors.RED);
        } else {

            System.out.println("Choose hero you want to delete: \n");
            for (Superhero hero :controller.database.getHeroDatabase()) {
                System.out.println(controller.database.getHeroDatabase().indexOf(hero) + 1 + ". " + hero.getName());
            }


            int RI = readIntger();
            System.out.println("Are you sure, you want delete this superhero? " + controller.database.getHeroDatabase().get(RI - 1).getName() + "?\n1. Delete " + controller.database.getHeroDatabase().get(RI - 1).getName() + "\n2. Dont delete");

            int v2 = readIntger();
            switch (v2) {
                case 1:
                    controller.database.deleteHero(RI);
                case 2:
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Input is not valid"+ ConsoleColors.RED);
                    break;


            }
        }
    }
}















