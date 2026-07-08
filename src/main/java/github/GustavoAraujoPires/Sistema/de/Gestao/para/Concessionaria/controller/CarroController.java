package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.CarroDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers.CarroMappers;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Carro;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service.CarroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("carros")
@RequiredArgsConstructor
public class CarroController {

    private final CarroService service;
    private final CarroMappers mappers;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carro salvar (@RequestBody @Valid CarroDTO dto){
        var carro = mappers.toDTO(dto);
        return service.salvar(carro);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Carro buscarPorId (@PathVariable UUID id){
        return service.buscarPorId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Carro> buscarTodos(){
        return service.buscarTodosCarro();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Carro atualizarCarro (@PathVariable UUID id,@RequestBody Carro carro){
        return service.atualizarCarro(id,carro);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletarCarro (@PathVariable UUID id){
        service.deletar(id);
    }
}
