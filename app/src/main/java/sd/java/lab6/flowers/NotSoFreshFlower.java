package sd.java.lab6.flowers;

public class NotSoFreshFlower extends Flower {
    private static final int FRESHNESS = 30; // Constant freshness value for NotSoFreshFlower

    public NotSoFreshFlower(String color, double length) {
        super(color, length, FRESHNESS);
    }

    @Override
    public double calculateCost() {
        return getLength() * getFreshness();
    }
}
