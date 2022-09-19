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
        public Superhero() {
        }
        public String getName() {
            return name;
            }

            public boolean getisHuman() {
        return isHuman;
            }
            public String getSuperPower() {
        return superPower;
            }

    public int getCreationYear() {
        return creationYear;
    }

    public double getStrengh() {
        return strength;
    }

}
