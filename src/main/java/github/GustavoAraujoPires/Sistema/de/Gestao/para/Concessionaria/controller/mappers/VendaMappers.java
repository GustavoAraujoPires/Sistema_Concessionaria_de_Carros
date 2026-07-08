package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.VendaDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Venda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VendaMappers {
    Venda toDTO (VendaDTO dto);
}
