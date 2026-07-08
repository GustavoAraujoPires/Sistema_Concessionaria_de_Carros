package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.service;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.IdNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.exception.UsuarioNaoEncontradoException;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Usuario;
import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;

    public void salvar (Usuario usuario){
        var senha = usuario.getSenha();
        usuario.setSenha(encoder.encode(senha));
        repository.save(usuario);
    }

    public Usuario buscarPorLogin(String login) {
        if (login != null) {
            return repository.findByLogin(login);
        }
        throw new UsuarioNaoEncontradoException("Login não encontrado");
    }

    public Usuario buscarPorEmail(String email){
        if (email.isEmpty()){
            throw new UsuarioNaoEncontradoException("Email não encontrado");
        }
        return repository.findByEmail(email);
    }

    public void deletar(UUID id) {
        if (id != null) {
            repository.deleteById(id);
        }
        throw new IdNaoEncontradoException("Id não encontrado !!");
    }

}
