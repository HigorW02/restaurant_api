package nassau.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nassau.restaurant.dto.PedidoDTO;
import nassau.restaurant.model.Pedido;
import nassau.restaurant.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public List<Pedido> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Pedido criar(@RequestBody PedidoDTO dto) {
        return service.salvar(dto);
    }
}
