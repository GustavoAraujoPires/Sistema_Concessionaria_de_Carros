package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarroRepository extends JpaRepository<Carro, UUID> {
}
