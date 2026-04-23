package br.com.fiap3ESPV.checkpoint2.model;

import java.time.LocalDate;

public record DadosListagemPedidos (Long id,
                                    String clienteNome,
                                    LocalDate dataPedido,
                                    Double valorTotal) {

    public DadosListagemPedidos(Pedido pedido) {
        this (pedido.getId(), pedido.getClienteNome(), pedido.getDataPedido(), pedido.getValorTotal());
    }
}
