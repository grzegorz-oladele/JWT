package pl.grzegorz.JWT.builder;

import pl.grzegorz.JWT.dto.MotorcycleDtoInfo;
import pl.grzegorz.JWT.dto.RoleDtoInfo;
import pl.grzegorz.JWT.dto.UserDtoInfo;

import java.util.List;

public class UserDtoInfoBuilder {

    private String name
    private String username;
    private String email;
    private List<MotorcycleDtoInfo> motorcycles;
    private List<RoleDtoInfo> roles;

    public UserDtoInfoBuilder withUserName(String username) {
        this.username = username;
        return this;
    }

    public UserDtoInfoBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserDtoInfoBuilder withMotorcycles(List<MotorcycleDtoInfo> motorcycles) {
        this.motorcycles = motorcycles;
        return this;
    }

    public UserDtoInfoBuilder withRoles(List<RoleDtoInfo> roles) {
        this.roles = roles;
        return this;
    }

    public UserDtoInfo build() {
        UserDtoInfo userDtoInfo = new UserDtoInfo();
        userDtoInfo.setUsername(username);
        userDtoInfo.setEmail(email);
        userDtoInfo.setMotorcycles(motorcycles);
        userDtoInfo.setRoles(roles);
        return userDtoInfo;
    }
}
