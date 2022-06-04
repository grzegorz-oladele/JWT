package pl.grzegorz.JWT.builder;

import pl.grzegorz.JWT.dto.RoleDtoInfo;

public class RoleDtoInfoBuilder {

    private String role;

    public RoleDtoInfoBuilder withRole(String role) {
        this.role = role;
        return this;
    }

    public RoleDtoInfo build() {
        RoleDtoInfo roleDtoInfo = new RoleDtoInfo();
        roleDtoInfo.setRole(role);
        return roleDtoInfo;
    }
}
