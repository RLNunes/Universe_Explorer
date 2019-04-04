package pt.rln.universe_explorer;

public class WorldGen {

    private String planetName;
    private int planetMass, planetBases, planetMilitary, planetColonies;
    private double planetGravity;
    private long planetPopulation;
    private boolean planetProtection;

    public WorldGen(String name, int mass, double gravity) {
        planetName = name;
        planetMass = mass;
        planetGravity = gravity;
        planetColonies = 1;
        planetPopulation = 1000;
        planetBases = 1;
        planetMilitary = 100;
        planetProtection = true;
    }

    void setPlanetColonies(int numColonies) {
        planetColonies += numColonies;
    }

    int getPlanetColonies() {
        return planetColonies;
    }

    void setPlanetMilitary(int numBases) {
        planetBases += numBases;
    }

    int getPlanetMilitary() {
        return  planetBases;
    }

    void turnForceFieldOn() {
        planetProtection = true;
    }

    void turnForceFieldOff() {
        planetProtection = false;
    }

    boolean getForceFieldState() {
       return planetProtection;
    }

    void setColonyImmigration(int numColonists) {
        planetPopulation += numColonists;
    }

    long getColonyImmigration() {
        return planetPopulation;
    }

    void setBaseProtection(int numForces) {
        planetMilitary += numForces;
    }

    int getBaseProtection() {
        return planetMilitary;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getPlanetMass() {
        return planetMass;
    }

    public double getPlanetGravity() {
        return planetGravity;
    }
}
