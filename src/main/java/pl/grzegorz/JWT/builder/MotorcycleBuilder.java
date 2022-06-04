package pl.grzegorz.JWT.builder;

import pl.grzegorz.JWT.model.Motorcycle;

public class MotorcycleBuilder {

    private String brand;
    private String model;
    private int capacity;
    private double mechanicHorse;
    private int vintage;

    public MotorcycleBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public MotorcycleBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public MotorcycleBuilder withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public MotorcycleBuilder withMechanicHorse(double mechanicHorse) {
        this.mechanicHorse = mechanicHorse;
        return this;
    }

    public MotorcycleBuilder withVintage(int vintage) {
        this.vintage = vintage;
        return this;
    }

    public Motorcycle build() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand(brand);
        motorcycle.setModel(model);
        motorcycle.setCapacity(capacity);
        motorcycle.setMechanicHorse(mechanicHorse);
        motorcycle.setVintage(vintage);
        return motorcycle;
    }
}
