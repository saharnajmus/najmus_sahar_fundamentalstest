package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {
    protected String name;
    protected double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        if (Double.compare(plant.height, height) != 0) return false;
        return name.equals(plant.name);
    }


}
