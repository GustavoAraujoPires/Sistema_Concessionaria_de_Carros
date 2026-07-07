package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.ClienteNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.IdNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository.ClienteRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente salvar(Cliente cliente){
        if (cliente != null) {
            return repository.save(cliente);
        }
        throw new ClienteNaoEncontradoException("Cliente Invalido !!");
    }

    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }

    public Cliente buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(()-> new IdNaoEncontradoException("Id não encontrado !!"));
    }

    public Cliente atualizar(UUID id, Cliente cliente){
        var Cliente = repository.findById(id).orElseThrow(() -> new IdNaoEncontradoException("Id não encontrado !!"));
        Cliente.setNome(cliente.getNome());
        Cliente.setEmail(Cliente.getEmail());
        Cliente.setCpf(Cliente.getCpf());
        Cliente.setTelefone(cliente.getTelefone());
        Cliente.setEndereco(cliente.getEndereco());
        return repository.save(Cliente);
    }

    public void deletar (UUID id) {
        if (id != null) {
            repository.deleteById(id);
        }
        throw new IdNaoEncontradoException("Id não encontrado !!");
    }
}
