package br.com.fiap3ESPV.checkpoint2.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clienteNome;
    private LocalDate dataPedido;
    private Double valorTotal;
    private boolean ativo = true;

    public Pedido(DadosCadastroPedido dadosCadastroPedido) {
        this.clienteNome = dadosCadastroPedido.nomeCliente();
        this.dataPedido = LocalDate.now();
        this.valorTotal = dadosCadastroPedido.valorTotal();
    }
}
