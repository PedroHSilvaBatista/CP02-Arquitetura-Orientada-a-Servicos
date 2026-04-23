package br.com.fiap3ESPV.checkpoint2.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record DadosCadastroPedido (@NotBlank String nomeCliente,
                                   @Positive
                                   Double valorTotal) {

}
