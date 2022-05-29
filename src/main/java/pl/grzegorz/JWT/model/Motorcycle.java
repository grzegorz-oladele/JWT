package pl.grzegorz.JWT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "motorcycles")
@Getter
@Setter
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String model;
    private int capacity;
    private double mechanicHorse;
    private int vintage;
    @ManyToOne
    private User user;
}
