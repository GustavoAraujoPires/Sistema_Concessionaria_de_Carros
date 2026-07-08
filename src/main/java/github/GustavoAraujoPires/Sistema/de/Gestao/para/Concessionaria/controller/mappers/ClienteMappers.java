package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.ClienteDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMappers {

    Cliente toDTO(ClienteDTO dto);
}
