package pl.grzegorz.JWT.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.grzegorz.JWT.repository.MotorcycleRepository;

@Service
@RequiredArgsConstructor
public class MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;
}
