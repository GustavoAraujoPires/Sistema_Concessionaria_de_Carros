package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.IdNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Carro;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarroService {

    private final CarroRepository repository;

    public Carro salvar (Carro carro){
        return repository.save(carro);
    }

    public List<Carro> buscarTodosCarro(){
        return repository.findAll();
    }

    public Carro buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado !!"));
    }

    public Carro atualizarCarro(UUID id, Carro carro){
        var Carro = repository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado !!"));
        Carro.setModelo(carro.getModelo());
        Carro.setAno(carro.getAno());
        Carro.setCor(carro.getCor());
        Carro.setMarca(carro.getMarca());
        Carro.setCombustivel(carro.getCombustivel());
        Carro.setPreco(carro.getPreco());
        Carro.setPlaca(carro.getPlaca());
        Carro.setStatus(Carro.getStatus());
        return repository.save(Carro);
    }

    public void deletar (UUID id) {
        if (id != null) {
            repository.deleteById(id);
        }
        throw new IdNaoEncontradoException("Id não encontrado !!");
    }
}
