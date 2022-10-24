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
}
