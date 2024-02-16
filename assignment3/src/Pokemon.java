public class Pokemon {
    private short level;
    private double baseCatchRate;

    public short getLevel() {
        return this.level;
    }

    public double getBaseCatchRate() {
        return this.baseCatchRate;
    }
    
    public Pokemon(short level, double baseCatchRate) {
        this.level = level;
        this.baseCatchRate = baseCatchRate;
    }
}
