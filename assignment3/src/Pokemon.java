public class Pokemon {
    private int level;
    private double baseCatchRate;
    private String name;

    public int getLevel() {
        return this.level;
    }

    public double getBaseCatchRate() {
        return this.baseCatchRate;
    }

    public String getName() {
        return this.name;
    }
    
    public Pokemon(int level, double baseCatchRate, String name) {
        this.level = level;
        this.baseCatchRate = baseCatchRate;
        this.name = name;
    }

    public String toString() {
        return "A level " + getLevel() + " " + getName();
    }
}
