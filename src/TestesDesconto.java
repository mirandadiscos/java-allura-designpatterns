import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImposto;
import imposto.ICMS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {
    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
