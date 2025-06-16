package nassau.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nassau.restaurant.dto.MotoboyDTO;
import nassau.restaurant.model.Motoboy;
import nassau.restaurant.service.MotoboyService;

@RestController
@RequestMapping("/motoboy")
public class MotoboyController {
    
    @Autowired
    private MotoboyService service; 

    @GetMapping
    public List<Motoboy> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Motoboy criar(@RequestBody MotoboyDTO dto) {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public Motoboy atualizar(@PathVariable Long id, @RequestBody MotoboyDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
