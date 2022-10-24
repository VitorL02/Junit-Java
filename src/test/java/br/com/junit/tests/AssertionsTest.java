package br.com.junit.tests;

import br.com.junit.Pessoa;
import static org.junit.jupiter.api.Assertions.*; // Realiza a importação estatica e permite declarar sem o assertions
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTest {

    @Test
    void validarLancamento(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};  // Valores Diferentes{-1,5,2,3,10};

        assertArrayEquals(primeiroLancamento,segundoLancamento); // Realiza a comparação de dois Arrays
       // Assertions.assertNotEquals(primeiroLancamento,segundoLancamento); // Realiza a comparação de dois Arrays
    }


    @Test
    void validarObjetoNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        Pessoa jose = new Pessoa("Jose", LocalDate.now());
        assertNotNull(jose);

    }

    @Test
    void validarNumerosTiposDiferente(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor,outroValor);

    }



}
