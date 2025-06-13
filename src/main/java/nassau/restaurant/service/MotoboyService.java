package nassau.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassau.restaurant.dto.MotoboyDTO;
import nassau.restaurant.model.Motoboy;
import nassau.restaurant.repository.MotoboyRepository;

@Service
public class MotoboyService {
    
    @Autowired
    private MotoboyRepository repository;

    public List<Motoboy> listarTodos(){
        return repository.findAll();
    }

    public Motoboy salvar(MotoboyDTO dto) {
        Motoboy motoboy = new Motoboy();
        motoboy.setNome(dto.getNome());
        motoboy.setPlaca(dto.getPlaca());
        motoboy.setTelefone(dto.getTelefone());
        return repository.save(motoboy);
    }
}
