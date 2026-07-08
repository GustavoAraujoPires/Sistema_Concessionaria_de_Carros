package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.UsuarioDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMappers {

    Usuario toDTO(UsuarioDTO dto);
}
