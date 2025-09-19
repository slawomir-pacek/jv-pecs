package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<? extends T> type) {
        List<T> machines = new ArrayList<>();

        if (type == Bulldozer.class) {
            machines.add((T) new Bulldozer("Bulldozer A", "yellow", 5, 12000));
            machines.add((T) new Bulldozer("Bulldozer B", "red", 7, 14000));
            machines.add((T) new Bulldozer("Bulldozer C", "blue", 6, 13000));
        } else if (type == Excavator.class) {
            machines.add((T) new Excavator("Excavator X", "orange", 300));
            machines.add((T) new Excavator("Excavator Y", "blue", 500));
            machines.add((T) new Excavator("Excavator Z", "green", 400));
        } else if (type == Truck.class) {
            machines.add((T) new Truck("Truck 1", "white", 1000));
            machines.add((T) new Truck("Truck 2", "black", 1500));
            machines.add((T) new Truck("Truck 3", "gray", 1200));
        }

        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
