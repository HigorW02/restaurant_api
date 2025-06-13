package nassau.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassau.restaurant.dto.EnderecoDTO;
import nassau.restaurant.model.Endereco;
import nassau.restaurant.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;
    
    public List<Endereco> listarTodos() {
        return repository.findAll();
    }

    public Endereco salvar(EnderecoDTO dto) {
        Endereco endereco = new Endereco();
        endereco.setRua(dto.getRua());
        endereco.setBairro(dto.getBairro());
        endereco.setNumero(dto.getNumero());
        endereco.setReferencia(dto.getReferencia());
        return repository.save(endereco); // ✅ faltava esse retorno
    }
}
