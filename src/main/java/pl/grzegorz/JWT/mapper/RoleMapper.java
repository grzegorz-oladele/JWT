package pl.grzegorz.JWT.mapper;

import org.springframework.stereotype.Component;
import pl.grzegorz.JWT.builder.RoleDtoInfoBuilder;
import pl.grzegorz.JWT.dto.RoleDtoInfo;
import pl.grzegorz.JWT.model.Role;

import java.util.Objects;

@Component
public class RoleMapper {

    public RoleDtoInfo fromEntityToDtoInfo(Role role) {
        if (!Objects.nonNull(role)) {
            return null;
        }
        RoleDtoInfoBuilder roleDtoInfoBuilder = new RoleDtoInfoBuilder();
        if (Objects.nonNull(role.getName())) {
            roleDtoInfoBuilder.withRole(role.getName());
        }
        return roleDtoInfoBuilder.build();
    }
}
