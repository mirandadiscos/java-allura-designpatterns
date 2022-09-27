package desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
//Chain of Responsability ,
// uma heranca, onde cada regra é uma classe em que é chamada a proxima,
// nao precisando de ifs
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    public abstract BigDecimal calcular(Orcamento orcamento);
}
