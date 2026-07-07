package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.IdNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Cliente;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Venda;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository.CarroRepository;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository.ClienteRepository;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VendaService {

    private final VendaRepository repository;
    private final ClienteRepository clienteRepository;
    private final CarroRepository carroRepository;


    public Venda salvar (Venda venda, UUID id){
        var cliente = clienteRepository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado"));
        var carro = carroRepository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado !!"));
        var vendas = repository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado !!"));
        vendas.setCliente(cliente);
        vendas.setCarro(carro);
        return repository.save(venda);
    }

    public List<Venda> buscarTodos(){
        return repository.findAll();
    }

    public Venda buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado !!"));
    }

    public void deletar (UUID id){
        if (id != null){
            repository.deleteById(id);
        }
        throw new IdNaoEncontradoException("Id não encontrado !!");
    }
}
