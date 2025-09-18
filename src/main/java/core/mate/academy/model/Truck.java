package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;

    public Truck() {}

    public Truck(String name, String color, int loadCapacity) {
        setName(name);
        setColor(color);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + getName() + " started transporting.");
    }
}
