package pl.grzegorz.JWT.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.grzegorz.JWT.dto.UserDto;
import pl.grzegorz.JWT.dto.UserDtoInfo;
import pl.grzegorz.JWT.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDtoInfo> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/registration")
    public UserDtoInfo addUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @PatchMapping("/{id}/activate")
    public void activUserAsUser(@PathVariable long id) {
        userService.activeUserAsBiker(id);
    }
}
