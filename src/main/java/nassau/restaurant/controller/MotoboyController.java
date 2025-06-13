package nassau.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nassau.restaurant.dto.MotoboyDTO;
import nassau.restaurant.model.Motoboy;
import nassau.restaurant.service.MotoboyService;

@RestController
@RequestMapping("/motoboy")
public class MotoboyController {
    
   @Autowired
    private MotoboyService service; // ✅ Corrigido nome do atributo

    @GetMapping
    public List<Motoboy> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Motoboy criar(@RequestBody MotoboyDTO dto) {
        return service.salvar(dto);
    }
}