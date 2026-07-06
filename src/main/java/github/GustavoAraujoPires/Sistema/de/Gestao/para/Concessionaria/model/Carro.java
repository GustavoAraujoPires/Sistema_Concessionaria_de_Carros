package github.GustavoAraujoPires.Sistema.de.Gestao.para.Concessionaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String modelo;
    private String marca;
    private String cor;
    private LocalDate ano;
    private Double preco;
    private String placa;
    private String combustivel;
    private List<StatusCarro> status;
}
