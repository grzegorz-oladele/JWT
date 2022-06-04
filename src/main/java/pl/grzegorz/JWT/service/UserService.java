package pl.grzegorz.JWT.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.grzegorz.JWT.dto.UserDto;
import pl.grzegorz.JWT.dto.UserDtoInfo;
import pl.grzegorz.JWT.mapper.UserMapper;
import pl.grzegorz.JWT.model.Role;
import pl.grzegorz.JWT.model.User;
import pl.grzegorz.JWT.repository.RoleRepository;
import pl.grzegorz.JWT.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleRepository roleRepository;

    public List<UserDtoInfo> getAllUsers() {
        List<User> users = userRepository.findAll();
        return toUserDtoInfoList(users);
    }

    public UserDtoInfo createUser(UserDto userDto) {
        User user = userMapper.fromDtoToEntity(userDto);
        User user1 = userRepository.save(user);
        return userMapper.fromEntityToDtoInfo(user1);
    }

    public void activeUserAsBiker(long id) {
        User user = userRepository.findById(id).orElseThrow();
        user.setEnabled(true);
        Role user_role = roleRepository.findByName("ROLE_USER");
        user.getAuthorities().add(user_role);
        user.setId(id);
        userRepository.save(user);
    }


    private List<UserDtoInfo> toUserDtoInfoList(List<User> users) {
        return users
                .stream()
                .map(userMapper::fromEntityToDtoInfo)
                .collect(Collectors.toList());
    }
}
