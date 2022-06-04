package pl.grzegorz.JWT.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.grzegorz.JWT.builder.UserBuilder;
import pl.grzegorz.JWT.builder.UserDtoInfoBuilder;
import pl.grzegorz.JWT.dto.MotorcycleDtoInfo;
import pl.grzegorz.JWT.dto.RoleDtoInfo;
import pl.grzegorz.JWT.dto.UserDtoInfo;
import pl.grzegorz.JWT.model.Motorcycle;
import pl.grzegorz.JWT.model.Role;
import pl.grzegorz.JWT.model.User;
import pl.grzegorz.JWT.dto.UserDto;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final MotorcycleMapper motorcycleMapper;
    private final RoleMapper roleMapper;
    private final PasswordEncoder passwordEncoder;

    public User fromDtoToEntity(UserDto userDto) {
        if (!Objects.nonNull(userDto)) {
            return null;
        }
        UserBuilder userBuilder = new UserBuilder();
        if (Objects.nonNull(userDto.getUsername())) {
            userBuilder.withUsername(userDto.getUsername());
        }
        if (Objects.nonNull(userDto.getPassword())) {
            userBuilder.withPassword(passwordEncoder.encode(userDto.getPassword()));
        }
        if (Objects.nonNull(userDto.getEmail())) {
            userBuilder.withEmail(userDto.getEmail());
        }
        return userBuilder.build();
    }

    public UserDtoInfo fromEntityToDtoInfo(User user) {
        if (!Objects.nonNull(user)) {
            return null;
        }
        UserDtoInfoBuilder userDtoInfoBuilder = new UserDtoInfoBuilder();
        if (Objects.nonNull(user.getUsername())) {
            userDtoInfoBuilder.withUserName(user.getUsername());
        }
        if (Objects.nonNull(user.getEmail())) {
            userDtoInfoBuilder.withEmail(user.getEmail());
        }
        if (Objects.nonNull(user.getMotorcycles())) {
            userDtoInfoBuilder.withMotorcycles(toMotorcycleDtoInfoList(user.getMotorcycles()));
        }
        if (Objects.nonNull(user.getAuthorities())) {
            userDtoInfoBuilder.withRoles(toRoleDtoInfoList(user.getAuthorities()));
        }
        return userDtoInfoBuilder.build();
    }

    private List<MotorcycleDtoInfo> toMotorcycleDtoInfoList(List<Motorcycle> motorcycles) {
        return motorcycles
                .stream()
                .map(motorcycleMapper::fromEntityToDtoInfo)
                .collect(Collectors.toList());
    }

    private List<RoleDtoInfo> toRoleDtoInfoList(Set<Role> roles) {
        return roles
                .stream()
                .map(roleMapper::fromEntityToDtoInfo)
                .collect(Collectors.toList());
    }
}
