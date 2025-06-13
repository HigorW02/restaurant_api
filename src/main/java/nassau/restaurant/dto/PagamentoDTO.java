package nassau.restaurant.dto;

public class PagamentoDTO {
    
    private Double cartao;
    private String pix;
    private Boolean aVista;

    public Double getCartao() {
        return cartao;
    }

    public void setCartao(Double cartao) {
        this.cartao = cartao;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public Boolean getAVista() {
        return aVista;
    }

    public void setAVista(Boolean aVista) {
        this.aVista = aVista;
    }
}
