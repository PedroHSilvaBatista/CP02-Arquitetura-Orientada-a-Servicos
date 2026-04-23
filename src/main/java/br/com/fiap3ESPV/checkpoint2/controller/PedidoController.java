package br.com.fiap3ESPV.checkpoint2.controller;

import br.com.fiap3ESPV.checkpoint2.model.DadosCadastroPedido;
import br.com.fiap3ESPV.checkpoint2.model.DadosListagemPedidos;
import br.com.fiap3ESPV.checkpoint2.service.PedidoService;
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
    public void cadastrarPedido(@RequestBody @Valid DadosCadastroPedido dadosCadastroPedido) {
        pedidoService.cadastroPedido(dadosCadastroPedido);
    }

    @GetMapping
    public Page<DadosListagemPedidos> listarInstrutores(@PageableDefault(sort="clienteNome") Pageable pageable) {
        return pedidoService.listarPedidos(pageable);
    }


}
