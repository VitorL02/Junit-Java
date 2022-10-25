package br.com.junit;

public class TranferenciaEntreContas {

    public void tranferencia(Conta contaOrigem,Conta contaDestino,int valor){

        if(valor <= 0){
           throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

    }
}
