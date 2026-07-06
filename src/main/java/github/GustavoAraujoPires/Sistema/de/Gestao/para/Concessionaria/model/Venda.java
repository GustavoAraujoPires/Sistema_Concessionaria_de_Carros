package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate dataVenda;
    private Double valorVenda;
    private String formaPagamento;
}
