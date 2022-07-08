package parrots;

public class Parrot {
    public String name;
    public String species;
    public boolean available = true;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Parrot ({species}): {name}";
    }
}
