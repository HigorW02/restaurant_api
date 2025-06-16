package nassau.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassau.restaurant.dto.PedidoDTO;
import nassau.restaurant.model.Motoboy;
import nassau.restaurant.model.Pagamento;
import nassau.restaurant.model.Pedido;
import nassau.restaurant.model.Produto;
import nassau.restaurant.model.Usuario;
import nassau.restaurant.repository.MotoboyRepository;
import nassau.restaurant.repository.PagamentoRepository;
import nassau.restaurant.repository.PedidoRepository;
import nassau.restaurant.repository.ProdutoRepository;
import nassau.restaurant.repository.UsuarioRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MotoboyRepository motoboyRepository;

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Pedido salvar(PedidoDTO dto) {
        Pedido pedido = new Pedido();
        return preencherPedidoComDTO(pedido, dto);
    }

    public Pedido atualizar(Long id, PedidoDTO dto) {
        Pedido pedido = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
        return preencherPedidoComDTO(pedido, dto);
    }

    public void deletar(Long id) {
        if (!pedidoRepository.existsById(id)) {
            throw new RuntimeException("Pedido não encontrado");
        }
        pedidoRepository.deleteById(id);
    }

    private Pedido preencherPedidoComDTO(Pedido pedido, PedidoDTO dto) {
        pedido.setDataPedido(dto.getDataPedido());
        pedido.setTimePedido(dto.getTimePedido());

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Motoboy motoboy = motoboyRepository.findById(dto.getMotoboyId())
                .orElseThrow(() -> new RuntimeException("Motoboy não encontrado"));
        Pagamento pagamento = pagamentoRepository.findById(dto.getPagamentoId())
                .orElseThrow(() -> new RuntimeException("Pagamento não encontrado"));
        List<Produto> produtos = produtoRepository.findAllById(dto.getProdutosIds());

        pedido.setUsuario(usuario);
        pedido.setMotoboy(motoboy);
        pedido.setPagamento(pagamento);
        pedido.setProdutos(produtos);

        return pedidoRepository.save(pedido);
    }
}
