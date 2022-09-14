import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // brugerens input.
        Database superHeroDatabase = new Database();

        int brugerValg = 0;

        do {
            System.out.println("""
                    Velkommen to the Superhero Collector.
                    1. Create superhero.
                    2. Show superheroes made.
                    3. Find superhero.
                    9. Exit.
                    """);

            brugerValg = sc.nextInt();
            sc.nextLine();
            if (brugerValg == 1) {
                System.out.println("Superheroes name?");
                String name = sc.nextLine();
                System.out.println("Is superhero human?");
                String isHumanString = sc.next();
                boolean isHuman = false;
                if (isHumanString.equalsIgnoreCase("j")) {
                    isHuman = true;
                }
                sc.nextLine();
                System.out.println("Superheroes power");
                String superPower = sc.nextLine();
                System.out.println("Superheros creation year");
                int creationYear = sc.nextInt();
                System.out.println("Superhoeros strength");
                double strength = sc.nextDouble();

                superHeroDatabase.addSuperheroes(name, isHuman, superPower, creationYear, strength);
            } else {
                System.exit(0);
            }

            brugerValg = sc.nextInt();
            sc.nextLine();
            if (brugerValg == 2) {
                for (Superhero heroes : superHeroDatabase.getHeroDatabase()) {
                    System.out.println("Superhero name" + heroes.getName());
                    if (heroes.getisHuman() == true) {
                        System.out.println("\nHuman?: Yes");
                    } else {
                        System.out.println("\nHuman?: No");
                    }
                    System.out.println("Superpower:" + heroes.getSuperPower());
                    System.out.println("Creation year" + heroes.getCreationYear());
                    System.out.println("Strength" + heroes.getStrengh());
                }

            }
            else if (brugerValg == 3);
                System.out.println("Søg på et helts civil navn: ");
                String searchName = sc.nextLine();
            boolean searchIsHuman = sc.nextBoolean();
            String searchSuperpower = sc.nextLine();
            int searchCreationYear = sc.nextInt();
            double searchStrength = sc.nextDouble();
            superHeroDatabase.addSuperheroes(searchName, searchIsHuman, searchSuperpower, searchCreationYear, searchStrength);
        }
        while (brugerValg != 9);

    }
}



