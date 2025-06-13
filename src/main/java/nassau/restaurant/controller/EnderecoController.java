package nassau.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nassau.restaurant.dto.EnderecoDTO;
import nassau.restaurant.model.Endereco;
import nassau.restaurant.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService service;

    @GetMapping
    public List<Endereco> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Endereco criar(@RequestBody EnderecoDTO dto) {
        return service.salvar(dto);
    }
}
