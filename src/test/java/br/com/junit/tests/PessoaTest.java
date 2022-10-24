package br.com.junit.tests;

import br.com.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2016, 10, 10));

        Assertions.assertEquals( 6,pessoa.getIdade());
    }
    @Test
    void validarMaiorIdade(){
        Pessoa maiorDeIdade = new Pessoa("Jose", LocalDate.of(2001,10,5));
        Assertions.assertTrue(maiorDeIdade.isMaiorDeIdade());

        Pessoa menorDeIdade = new Pessoa("Cleiton", LocalDate.of(2019,10,5));
        Assertions.assertFalse(menorDeIdade.isMaiorDeIdade());
    }
}
