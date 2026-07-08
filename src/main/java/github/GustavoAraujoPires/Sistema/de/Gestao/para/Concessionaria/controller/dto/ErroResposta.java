package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto;

import org.springframework.http.HttpStatus;
import java.util.List;

public record ErroResposta(int status, String mensagem, List<ErroCampo> erros) {

    public static ErroResposta clienteNaoEncontrado(String mensagem){
        return new ErroResposta(HttpStatus.NOT_FOUND.value(), mensagem, List.of());
    }

    public static ErroResposta idNaoEncontrado(String mensagem){
        return new ErroResposta(HttpStatus.NOT_FOUND.value(), mensagem, List.of());
    }

    public static ErroResposta usuarioNaoEncontrado(String mensagem){
        return new ErroResposta(HttpStatus.NO_CONTENT.value(), mensagem, List.of());
    }

    public static ErroResposta erroNaoTratado(String mensagem){
        return new ErroResposta(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Aconteceu um erro inesperado, entre em contato com o ADM, Obrigado !!", List.of());
    }
}
