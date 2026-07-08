package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record ClienteDTO(
        @NotBlank(message = "Nome Inválido")
        String nome,
        @Email(message = "Email Inválido")
        String email,
        @CPF(message = "CPF Inválido")
        String cpf,
        @NotBlank(message = "Endereço inválido")
        String endereco,
        @NotBlank(message = "Telefone inválido")
        String telefone
){}
