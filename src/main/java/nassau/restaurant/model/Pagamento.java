package nassau.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pagamento {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Double cartao;
    private String pix;
    private Boolean aVista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
