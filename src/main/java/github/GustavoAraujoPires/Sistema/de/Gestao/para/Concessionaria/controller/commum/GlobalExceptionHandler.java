package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.commum;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.ErroResposta;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.ClienteNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.ErroNaoTratadoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.IdNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.UsuarioNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErroResposta clienteNaoEncontrado(ClienteNaoEncontradoException e){
        return ErroResposta.clienteNaoEncontrado(e.getMessage());
    }

    @ExceptionHandler(IdNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErroResposta idNaoEncontrado(IdNaoEncontradoException e){
        return ErroResposta.idNaoEncontrado(e.getMessage());
    }

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ErroResposta usuarioNaoEncontrado(UsuarioNaoEncontradoException e){
        return ErroResposta.usuarioNaoEncontrado(e.getMessage());
    }

    @ExceptionHandler(ErroNaoTratadoException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErroResposta erroNaoTratado(ErroNaoTratadoException e){
        return ErroResposta.erroNaoTratado(e.getMessage());
    }
}
