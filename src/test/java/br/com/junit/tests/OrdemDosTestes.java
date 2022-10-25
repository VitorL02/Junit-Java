package br.com.junit.tests;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemDosTestes {


    @Order(3)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);

    }

    @Order(1)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);

    }
}
