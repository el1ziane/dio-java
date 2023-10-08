package one.digitalinovation.gof;


import one.digitalinovation.facade.Facade;
import one.digitalinovation.projeto.*;
import one.digitalinovation.strategy.*;

public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);


        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");



        ComportamentoAnimal latir = new Latir();
        ComportamentoAnimal comer = new Comer();
        ComportamentoAnimal brincar = new Brincar();
        Cachorro cachorro = new Cachorro();

        cachorro.setComportamentoAnimal(brincar);
        cachorro.executar();
        cachorro.executar();
        cachorro.setComportamentoAnimal(latir);
        cachorro.executar();
        cachorro.executar();
        cachorro.setComportamentoAnimal(comer);
        cachorro.executar();

    }

}
