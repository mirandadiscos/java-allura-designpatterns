package desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new MaisQueCincoItens(
                            new MaiorQueQuinhentos(
                            new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
