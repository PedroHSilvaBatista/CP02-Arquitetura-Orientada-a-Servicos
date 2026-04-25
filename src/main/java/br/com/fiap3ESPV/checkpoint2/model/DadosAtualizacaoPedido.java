package br.com.fiap3ESPV.checkpoint2.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record DadosAtualizacaoPedido (Long id,
                                      @NotBlank
                                      String clienteNome,
                                      LocalDate dataPedido,
                                      @Positive
                                      Double valorTotal,
                                      boolean ativo) {
}
