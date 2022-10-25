package br.com.junit.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTest {

    @Test
    //@EnabledIfEnvironmentVariable(named="USER",matches = "Vitor") //Veirifica se a variavel de ambiente User, tem o nome de vitor
    @DisabledIfEnvironmentVariable(named="USERS",matches = "Vitor")
    void validarAlgoSomenteNoUserVitor(){
        Assertions.assertEquals(10,5 + 5);
    }
}
