import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // brugerens input.
        Database superHeroDatabase = new Database();

        int brugerValg = 0;

        do {
            System.out.println("""
                    Velkommen til Superhero Collector.
                    1. Opret superhelt.
                    9. Afslut.
                    """);

            brugerValg = sc.nextInt();
            sc.nextLine();
            if (brugerValg == 1) {
                System.out.println("Superheros name?");
                String name = sc.nextLine();
                System.out.println("Is superhero human?");
                String isHumanString = sc.next();
                boolean isHuman = false;
                if (isHumanString.equalsIgnoreCase("j")) {
                    isHuman = true;
                }
                sc.nextLine();
                System.out.println("Superheros power");
                String superPower = sc.nextLine();
                System.out.println("Superheros creation year");
                int creationYear = sc.nextInt();
                System.out.println("Superhoeros strength");
                double strength = sc.nextDouble();

                superHeroDatabase.addSuperheroes(name, isHuman, superPower, creationYear, strength);
            } else {
                System.exit(0);
            }
        }

            while (brugerValg != 9) ;

        }
    }


