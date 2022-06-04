package pl.grzegorz.JWT.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDtoInfo {

    private String name;
    private String username;
    private String email;
    private List<MotorcycleDtoInfo> motorcycles;
    private List<RoleDtoInfo> roles;
}
