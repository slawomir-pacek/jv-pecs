package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return (List<T>) List.of(new Bulldozer("Bulldozer A", "yellow", 5, 12000),
                    new Bulldozer("Bulldozer B", "red", 7, 14000),
                    new Bulldozer("Bulldozer C", "blue", 6, 13000)
            );
        } else if (type == Excavator.class) {
            return (List<T>) List.of(
                    new Excavator("Excavator X", "orange", 300),
                    new Excavator("Excavator Y", "blue", 500),
                    new Excavator("Excavator Z", "green", 400)
            );
        } else if (type == Truck.class) {
            return (List<T>) List.of(
                    new Truck("Truck 1", "white", 1000),
                    new Truck("Truck 2", "black", 1500),
                    new Truck("Truck 3", "gray", 1200)
            );
        }
        return List.of(); // pusta lista dla nieznanych typów
    }

    @Override
    public void fill(List<Object> machines, T value) {
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
