package pl.grzegorz.JWT.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.grzegorz.JWT.repository.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;
}
