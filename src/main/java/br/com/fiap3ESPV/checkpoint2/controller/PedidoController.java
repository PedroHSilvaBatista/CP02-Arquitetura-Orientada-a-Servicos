package br.com.fiap3ESPV.checkpoint2.controller;

import br.com.fiap3ESPV.checkpoint2.model.DadosAtualizacaoPedido;
import br.com.fiap3ESPV.checkpoint2.model.DadosCadastroPedido;
import br.com.fiap3ESPV.checkpoint2.model.DadosDetalhamentoPedido;
import br.com.fiap3ESPV.checkpoint2.model.DadosListagemPedidos;
import br.com.fiap3ESPV.checkpoint2.service.PedidoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    @Transactional
    public void cadastrarPedido(@RequestBody @Valid DadosCadastroPedido dadosCadastroPedido) {
        pedidoService.cadastroPedido(dadosCadastroPedido);
    }

    @GetMapping
    public Page<DadosListagemPedidos> listarInstrutores(@PageableDefault(sort="clienteNome") Pageable pageable) {
        return pedidoService.listarPedidos(pageable);
    }

    @GetMapping("/{id}")
    public DadosDetalhamentoPedido exibirDetalhesDoPedido(@PathVariable Long id) {
        return pedidoService.exibeDetalhesDoPedido(id);
    }

    @PutMapping
    @Transactional
    public void atualizarPedido(@RequestBody @Valid DadosAtualizacaoPedido dadosAtualizacaoPedido) {
        pedidoService.atualizarPedido(dadosAtualizacaoPedido);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void removerPedido(@PathVariable Long id) {
        pedidoService.removerPedido(id);
    }
}
