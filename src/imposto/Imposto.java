package imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;
// Design Pattern Strategy - cada regra é uma classe e nao um if
public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
