package nassau.restaurant.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nassau.restaurant.dto.ProdutoDTO;
import nassau.restaurant.model.Produto;
import nassau.restaurant.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> listar(){
        return service.listarTodos();
    }

    @PostMapping
    public Produto criar(@RequestBody ProdutoDTO dto) {
        return service.salvar(dto);
    }
}
