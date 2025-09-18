package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketCapacity) {
        setName(name);
        setColor(color);
        this.bucketCapacity = bucketCapacity;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getName() + " started digging.");
    }
}

