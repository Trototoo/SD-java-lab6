package sd.java.lab6.flowers;

public class FreshFlower extends Flower {
    private static final int FRESHNESS = 100; // Constant freshness value for FreshFlower

    public FreshFlower(String color, double length) {
        super(color, length, FRESHNESS);
    }

    @Override
    public double calculateCost() {
        return getLength() * getFreshness();
    }
}
