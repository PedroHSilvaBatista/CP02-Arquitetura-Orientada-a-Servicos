package br.com.fiap3ESPV.checkpoint2.service;

import br.com.fiap3ESPV.checkpoint2.model.DadosCadastroPedido;
import br.com.fiap3ESPV.checkpoint2.model.DadosListagemPedidos;
import br.com.fiap3ESPV.checkpoint2.model.Pedido;
import br.com.fiap3ESPV.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public void cadastroPedido(DadosCadastroPedido dadosCadastroPedido) {
        Pedido pedido = new Pedido(dadosCadastroPedido);
        System.out.println(pedido);
        // pedidoRepository.save(pedido);
    }

    public Page<DadosListagemPedidos> listarPedidos(Pageable pageable) {
        return pedidoRepository.findAllByAtivoTrue(pageable).map(DadosListagemPedidos::new);
    }
}
