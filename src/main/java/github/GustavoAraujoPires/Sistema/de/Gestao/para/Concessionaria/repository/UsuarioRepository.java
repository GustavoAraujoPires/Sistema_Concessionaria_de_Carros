package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    Usuario findByLogin(String login);

    Usuario findByEmail(String email);
}
