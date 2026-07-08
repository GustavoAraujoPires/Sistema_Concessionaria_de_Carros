package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.StatusCarro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public record CarroDTO(
        @NotBlank(message = "Modelo inválido")
        String modelo,
        @NotBlank(message = "Marca inválida")
        String marca,
        @NotBlank(message = "Cor inválida")
        String cor,
        @NotBlank(message = "Ano inválido")
        LocalDate ano,
        @NotBlank(message = "Preco inválido")
        Double preco,
        @NotBlank(message = "Placa inválida")
        String placa,
        @NotBlank(message = "Combustivel inválido")
        String combustivel,
        @NotNull(message = "Status inválido")
        List<StatusCarro> status
){}
