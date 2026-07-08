package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.commum;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.ErroResposta;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.ClienteNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.IdNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErroResposta ClienteNaoEncontrado(ClienteNaoEncontradoException e){
        return ErroResposta.clienteNaoEncontrado(e.getMessage());
    }

    @ExceptionHandler(IdNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErroResposta IdNaoEncontrado(IdNaoEncontradoException e){
        return ErroResposta.idNaoEncontrado(e.getMessage());
    }

}
