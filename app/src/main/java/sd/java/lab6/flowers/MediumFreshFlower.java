package sd.java.lab6.flowers;

public class MediumFreshFlower extends Flower {
    private static final int FRESHNESS = 60; // Constant freshness value for MediumFreshFlower

    public MediumFreshFlower(String color, double length) {
        super(color, length, FRESHNESS);
    }

    @Override
    public double calculateCost() {
        return getLength() * getFreshness();
    }
}
