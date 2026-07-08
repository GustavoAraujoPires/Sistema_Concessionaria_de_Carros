package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.ClienteDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers.ClienteMappers;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.ClienteNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Cliente;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;
    private final ClienteMappers mappers;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar (@RequestBody @Valid ClienteDTO dto){
        var cliente = mappers.toDTO(dto);
        return service.salvar(cliente);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente buscarPorId (@PathVariable UUID id){
        return service.buscarPorId(id);
    }

    @GetMapping("{cpf}")
    public Cliente buscarPorCpf(@PathVariable String cpf){
        if(cpf.isEmpty()){
            throw new ClienteNaoEncontradoException("Cliente não encontrado, com esse CPF");
        }
        return service.buscarPorCpf(cpf);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Cliente> buscarTodos(){
        return service.buscarTodos();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente atualizar (@RequestBody Cliente cliente, @PathVariable UUID id){
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletar (@PathVariable UUID id){
        service.deletar(id);
    }
}
