package nassau.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nassau.restaurant.dto.PagamentoDTO;
import nassau.restaurant.model.Pagamento;
import nassau.restaurant.service.PagamentoService;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
    
    @Autowired
    private PagamentoService service;

    @GetMapping
    public List<Pagamento> listar(){
        return service.listarTodos();
    }

    @PostMapping
    public Pagamento criar(@RequestBody PagamentoDTO dto){
        return service.salvar(dto);
    }
}
