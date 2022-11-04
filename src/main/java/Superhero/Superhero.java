package Superhero;

public class Superhero {

    private String name;
    private boolean isHuman;
    private String superPower;
    private int creationYear;
    private double strength;

    public Superhero(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        this.name = name;
        this.isHuman = isHuman;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public boolean getisHuman() {
        return isHuman;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String setSuperPower() {
        return superPower;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int setCreationYear() {
        return creationYear;

    }

    public double getStrength() {
        return strength;
    }

    public double setStrength() {
        return strength;
    }

    // ToString - Dette printer info om en superhelt
    public String toString() {
        return "Real name: " + name + "\nSuperpower: " + superPower + "\nYear of publication: " + creationYear + "\nStrength: " + strength + "\n";

    }

}
