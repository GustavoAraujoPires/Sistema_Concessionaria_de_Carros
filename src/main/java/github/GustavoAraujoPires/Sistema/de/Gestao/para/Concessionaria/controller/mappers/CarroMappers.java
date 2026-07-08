package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.CarroDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Carro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarroMappers {

    Carro toDTO(CarroDTO dto);
}
