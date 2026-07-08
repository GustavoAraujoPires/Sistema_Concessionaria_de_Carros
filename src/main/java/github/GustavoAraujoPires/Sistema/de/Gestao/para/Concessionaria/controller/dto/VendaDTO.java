package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Carro;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Cliente;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record VendaDTO(
        @NotNull(message = "Data inválida")
        LocalDate dataVenda,
        @NotNull(message = "Valor inválido")
        Double valorVenda,
        @NotNull(message = "Forma de Pagamento inválida")
        String formaPagamento,
        @NotNull(message = "Cliente inválido")
        Cliente cliente,
        @NotNull(message = "Carro inválido")
        Carro carro
){}
