package br.com.fiap3ESPV.checkpoint2.model;

import java.time.LocalDate;

public record DadosDetalhamentoPedido(Long id,
                                      String clienteNome,
                                      LocalDate dataPedido,
                                      Double valorTotal,
                                      boolean ativo) {

    public DadosDetalhamentoPedido (Pedido pedido) {
        this (pedido.getId(), pedido.getClienteNome(), pedido.getDataPedido(), pedido.getValorTotal(), pedido.isAtivo());
    }
}
