package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.repository;

import github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendaRepository extends JpaRepository<Venda, UUID> {
}
