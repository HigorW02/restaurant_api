package nassau.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassau.restaurant.dto.PagamentoDTO;
import nassau.restaurant.model.Pagamento;
import nassau.restaurant.repository.PagamentoRepository;

@Service
public class PagamentoService { 
    
    @Autowired
    private PagamentoRepository repository;

    public List<Pagamento> listarTodos() {
        return repository.findAll();
    }

    public Pagamento salvar(PagamentoDTO dto) {
        Pagamento pagamento = new Pagamento();
        pagamento.setCartao(dto.getCartao());
        pagamento.setPix(dto.getPix());
        pagamento.setAVista(dto.getAVista()); 
        return repository.save(pagamento); 
    }
}
