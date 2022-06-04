package pl.grzegorz.JWT.builder;

import pl.grzegorz.JWT.dto.MotorcycleDtoInfo;

public class MotorcycleDtoInfoBuilder {

    private String brand;
    private String model;
    private int capacity;
    private double mechanicHorse;
    private int vintage;

    public MotorcycleDtoInfoBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public MotorcycleDtoInfoBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public MotorcycleDtoInfoBuilder withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public MotorcycleDtoInfoBuilder withMechanicHorse(double mechanicHorse) {
        this.mechanicHorse = mechanicHorse;
        return this;
    }

    public MotorcycleDtoInfoBuilder withVintage(int vintage) {
        this.vintage = vintage;
        return this;
    }

    public MotorcycleDtoInfo build() {
        MotorcycleDtoInfo motorcycleDtoInfo = new MotorcycleDtoInfo();
        motorcycleDtoInfo.setBrand(brand);
        motorcycleDtoInfo.setModel(model);
        motorcycleDtoInfo.setCapacity(capacity);
        motorcycleDtoInfo.setMechanicHorse(mechanicHorse);
        motorcycleDtoInfo.setVintage(vintage);
        return motorcycleDtoInfo;
    }
}
