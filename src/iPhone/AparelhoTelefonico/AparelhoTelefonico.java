package iPhone.AparelhoTelefonico;

public class AparelhoTelefonico implements IAparelhoTelefonico {

    public AparelhoTelefonico() {
        System.out.println("\nAbrindo Aparelho Telefônico");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
