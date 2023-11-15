package sd.java.lab6.flowers;

abstract class Flower {
    private final String color;
    private final double length;
    private final int freshness;

    public Flower(String color, double length, int freshness) {
        // Check if color is at least 1 character long
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color must be at least 1 character long.");
        }

        // Check if length is greater than 0
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }

        this.color = color;
        this.length = length;
        this.freshness = freshness;
    }

    public double getLength() {
        return length;
    }

    public int getFreshness() {
        return freshness;
    }

    public abstract double calculateCost();

    @Override
    public String toString() {
        return color + " Flower - Length: " + length + " cm, Freshness: " + freshness;
    }
}
