package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    // ZMIANA: List<T> zamiast List<? extends T>
    List<T> getAll(Class<? extends T> type);

    void fill(List<Object> machines, T value);

    void startWorking(List<? extends Machine> machines);
}
