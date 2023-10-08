package one.digitalinovation.projeto;

import one.digitalinovation.strategy.Comportamento;

public class Cachorro {

    private ComportamentoAnimal comportamento;

    public void setComportamentoAnimal(ComportamentoAnimal comportamento) {
        this.comportamento = comportamento;
    }

    public void executar(){
        comportamento.executar();
    }
}

