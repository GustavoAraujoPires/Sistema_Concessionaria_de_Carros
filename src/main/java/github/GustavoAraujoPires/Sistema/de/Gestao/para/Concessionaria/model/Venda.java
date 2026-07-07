package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "data_venda")
    private LocalDate dataVenda;
    @Column(name = "valor_venda")
    private Double valorVenda;
    @Column(name = "pagamento")
    private String formaPagamento;
    @Column(name = "cliente")
    private Cliente cliente;
    @Column(name = "carro")
    private Carro carro;
}
