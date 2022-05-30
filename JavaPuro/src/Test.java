import Facade.Facade;
import Singleton.CepApi;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;

public class Test {
    public static void main(String[] args) {

//        Testes relacionados ao Design Pattern (Padrão de Projeto) Singleton:
//        Singleton = Permite a criacao de uma unica instancia de uma classe e um modo
//        de recupera-la

        System.out.println("\n=== Singleton ===");

        System.out.println("Singleton Lazy:");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("\nSingleton Eager");
        CepApi eager = CepApi.getInstancia();
        System.out.println(eager);
        eager = CepApi.getInstancia();
        System.out.println(eager);

        System.out.println("\nSingleton Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

//        ################################################
//        Testes relacionados ao Design Pattern (Padrão de Projeto) Strategy:
//        Strategy = simplifica a variacao de algoritimos com a resolucao de um mesmo problema por uma interface

        System.out.println("\n=== Strategy ===");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
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
        robo.setComportamento(normal);
        robo.mover();

//        ################################################
//        Testes relacionados ao Design Pattern (Padrão de Projeto) Facade:
//        Facade = prover uma interface que seja mais simples e reduza a complexidade das integracoes com subsistemas

        System.out.println("\n=== Facade ===");

        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "14500155");
    }
}
