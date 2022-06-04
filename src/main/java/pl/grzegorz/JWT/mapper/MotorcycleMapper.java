package pl.grzegorz.JWT.mapper;

import org.springframework.stereotype.Component;
import pl.grzegorz.JWT.builder.MotorcycleBuilder;
import pl.grzegorz.JWT.builder.MotorcycleDtoInfoBuilder;
import pl.grzegorz.JWT.dto.MotorcycleDto;
import pl.grzegorz.JWT.dto.MotorcycleDtoInfo;
import pl.grzegorz.JWT.model.Motorcycle;

import java.util.Objects;

@Component
public class MotorcycleMapper {

    public Motorcycle fromDtoToEntity(MotorcycleDto motorcycleDto) {
        if (!Objects.nonNull(motorcycleDto)) {
            return null;
        }
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        if (Objects.nonNull(motorcycleDto.getBrand())) {
            motorcycleBuilder.withBrand(motorcycleDto.getBrand());
        }
        if (Objects.nonNull(motorcycleDto.getModel())) {
            motorcycleBuilder.withModel(motorcycleDto.getModel());
        }
        if (motorcycleDto.getCapacity() > 0) {
            motorcycleBuilder.withCapacity(motorcycleDto.getCapacity());
        }
        if (motorcycleDto.getMechanicHorse() > 0) {
            motorcycleBuilder.withMechanicHorse(motorcycleDto.getMechanicHorse());
        }
        if (motorcycleDto.getVintage() > 0) {
            motorcycleBuilder.withVintage(motorcycleDto.getVintage());
        }
        return motorcycleBuilder.build();
    }

    public MotorcycleDtoInfo fromEntityToDtoInfo(Motorcycle motorcycle) {
        if (!Objects.nonNull(motorcycle)) {
            return null;
        }
        MotorcycleDtoInfoBuilder motorcycleDtoInfoBuilder = new MotorcycleDtoInfoBuilder();
        if (Objects.nonNull(motorcycle.getBrand())) {
            motorcycleDtoInfoBuilder.withBrand(motorcycle.getBrand());
        }
        if (Objects.nonNull(motorcycle.getModel())) {
            motorcycleDtoInfoBuilder.withModel(motorcycle.getModel());
        }
        if (motorcycle.getCapacity() > 0) {
            motorcycleDtoInfoBuilder.withCapacity(motorcycle.getCapacity());
        }
        if (motorcycle.getMechanicHorse() > 0) {
            motorcycleDtoInfoBuilder.withMechanicHorse(motorcycle.getMechanicHorse());
        }
        if (motorcycle.getVintage() > 0) {
            motorcycleDtoInfoBuilder.withVintage(motorcycle.getVintage());
        }
        return motorcycleDtoInfoBuilder.build();
    }
}
