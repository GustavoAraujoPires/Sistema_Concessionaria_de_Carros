package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.dto.VendaDTO;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.controller.mappers.VendaMappers;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Venda;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service.VendaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("vendas")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService service;
    private final VendaMappers mappers;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venda salvar (@RequestBody @Valid VendaDTO dto, UUID id){
        var vendas = mappers.toDTO(dto);
        return service.salvar(vendas, id);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Venda buscarPorId(@PathVariable UUID id){
        return service.buscarPorId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> buscarTodas (){
        return service.buscarTodos();
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void atualizarVenda (@PathVariable UUID id){
        service.deletar(id);
    }
}
