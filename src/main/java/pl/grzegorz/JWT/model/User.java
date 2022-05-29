package pl.grzegorz.JWT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Motorcycle> motorcycles;
    @ManyToMany
    private Set<Role> roles;
}
