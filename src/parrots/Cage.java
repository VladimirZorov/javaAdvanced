package parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    public String name;
    public int capacity;
    List<Parrot> data = new ArrayList<>();

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (data.size() < capacity) {
            data.add(parrot);
        }
    }

    public void remove(String name) {
        if (data.contains(name)) {
            data.remove(name);
        }
    }
    public String sellParrot(String name) {
        //TODO
        return name;
    }

    public String sellParrotBySpecies(String name) {
        //TODO
        return name;
    }

    public int count() {
        int pc = data.size();
        return pc;
    }
    public String report() {
        return toString("Parrots available at {cageName}:%n +
        {Parrot 1}
        {Parrot 2}
        (…)");
    }
}
