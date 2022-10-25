package br.com.junit.tests;

import br.com.junit.Conta;
import br.com.junit.TranferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validaExceptionTransferencia() {
        Conta contaOrigem = new Conta("1234");
        Conta contaDestion = new Conta("4548964");
        TranferenciaEntreContas tranferenciaEntreContas = new TranferenciaEntreContas();

        //Com uma função lambda utilizamos a classe que lança a excessão para realizar o teste
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> tranferenciaEntreContas.tranferencia(contaOrigem, contaDestion,-1));

        Assertions.assertDoesNotThrow(() -> tranferenciaEntreContas.tranferencia(contaOrigem, contaDestion,20));

    }
}
