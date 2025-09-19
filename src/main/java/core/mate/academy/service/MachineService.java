package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    List<T> getAll(Class<? extends T> type);

    // poprawione zgodnie z PECS
    void fill(List<? super T> machines, T value);

    void startWorking(List<? extends Machine> machines);
}
