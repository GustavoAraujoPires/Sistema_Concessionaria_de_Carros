package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente,UUID> {
}
