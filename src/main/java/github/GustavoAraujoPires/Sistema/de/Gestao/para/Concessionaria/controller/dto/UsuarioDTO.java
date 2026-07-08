package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record UsuarioDTO(
        @NotBlank(message = "login invalido")
        String login,
        @NotBlank(message = "Senha invalida")
        String senha,
        @Email(message = "Email invalido")
        String email,
        @NotNull
        List<String> roles) {
}
