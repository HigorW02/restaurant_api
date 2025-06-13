package nassau.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassau.restaurant.dto.ProdutoDTO;
import nassau.restaurant.model.Produto;
import nassau.restaurant.repository.ProdutoRepository;

@Service
public class ProdutoService {
  
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto salvar(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setImagem(dto.getImagem()); 
        produto.setPrice(dto.getPrice());
        return repository.save(produto);
    }
}
