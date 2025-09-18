package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;
    private double weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeWidth, double weight) {
        setName(name);
        setColor(color);
        this.bladeWidth = bladeWidth;
        this.weight = weight;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getName() + " started pushing soil.");
    }
}
