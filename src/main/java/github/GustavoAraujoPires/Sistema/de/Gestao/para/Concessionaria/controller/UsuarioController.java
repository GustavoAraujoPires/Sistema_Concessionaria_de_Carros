package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.UsuarioDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers.UsuarioMappers;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Usuario;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;
    private final UsuarioMappers mappers;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid UsuarioDTO dto){
        var usuario = mappers.toDTO(dto);
        service.salvar(usuario);
    }

    @GetMapping("{login}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario buscarPorLogin(@PathVariable String login){
        return service.buscarPorLogin(login);
    }

    @GetMapping("{email}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario buscarPorEmail(@PathVariable String email){
        return service.buscarPorEmail(email);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletar (UUID id){
        service.deletar(id);
    }
}