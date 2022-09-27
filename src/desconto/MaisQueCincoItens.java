package desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class MaisQueCincoItens extends Desconto{

    public MaisQueCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidade() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
