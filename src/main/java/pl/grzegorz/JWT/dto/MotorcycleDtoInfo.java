package pl.grzegorz.JWT.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MotorcycleDtoInfo {

    private String brand;
    private String model;
    private int capacity;
    private double mechanicHorse;
    private int vintage;
}