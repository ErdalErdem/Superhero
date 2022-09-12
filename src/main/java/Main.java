import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Name:");
        Scanner sc0 = new Scanner(System.in);
        String name = sc0.nextLine();

        System.out.println("Human?:");
        Scanner sc1 = new Scanner(System.in);
        String isHumanString = sc1.nextLine();
        boolean isHuman = (isHumanString == "y");


        System.out.println("Superpower:");
        Scanner sc2 = new Scanner(System.in);
       String superPower = sc2.nextLine();

        System.out.println("Year of creation:");
        Scanner sc3 = new Scanner(System.in);
        int creationYear = sc3.nextInt();

        System.out.println("Strength:");
        Scanner sc4 = new Scanner(System.in);
        double strength = sc4.nextDouble();

        System.out.println();

        Superhero hero1 = new Superhero(name, isHuman, superPower, creationYear, strength);

    }
}
