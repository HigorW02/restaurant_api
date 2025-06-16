package nassau.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{id}")
    public Endereco atualizar(@PathVariable Long id, @RequestBody EnderecoDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
