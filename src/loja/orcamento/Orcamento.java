package loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private final BigDecimal valor;

    public Integer getQuantidade() {
        return quantidade;
    }

    private final Integer quantidade;

    public Orcamento(BigDecimal valor, Integer quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

}
