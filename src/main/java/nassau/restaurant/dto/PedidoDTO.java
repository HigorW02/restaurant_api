package nassau.restaurant.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PedidoDTO {

    private LocalDate dataPedido;
    private LocalTime timePedido;

    private Long usuarioId;
    private Long motoboyId;
    private Long pagamentoId;

    private List<Long> produtosIds;

    // Getters e Setters
    
    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalTime getTimePedido() {
        return timePedido;
    }

    public void setTimePedido(LocalTime timePedido) {
        this.timePedido = timePedido;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getMotoboyId() {
        return motoboyId;
    }

    public void setMotoboyId(Long motoboyId) {
        this.motoboyId = motoboyId;
    }

    public Long getPagamentoId() {
        return pagamentoId;
    }

    public void setPagamentoId(Long pagamentoId) {
        this.pagamentoId = pagamentoId;
    }

    public List<Long> getProdutosIds() {
        return produtosIds;
    }

    public void setProdutosIds(List<Long> produtosIds) {
        this.produtosIds = produtosIds;
    }
}
