package iPhone;

import iPhone.ReprodutorMusical.*;
import iPhone.AparelhoTelefonico.*;
import iPhone.NavegadorInternet.*;

public class iPhone {

    private IReprodutorMusical reprodutorMusical;
    private IAparelhoTelefonico aparelhoTelefonico;
    private INavegadorInternet navegadorInternet;

    public iPhone() {
        System.out.println("Iniciando iPhone...");
        this.reprodutorMusical = null;
        this.aparelhoTelefonico = null;
        this.navegadorInternet = null;
    }

    public void carregarAplicativo(AppEnum app) {

        switch (app) {
            case REPRODUTOR_MUSICAL -> {
                ReprodutorMusical();
            }
            case APARELHO_TELEFONICO -> {
                AparelhoTelefonico();
            }
            case NAVEGADOR_INTERNET -> {
                NavegadorInternet();
            }
        }
    };

    public void ReprodutorMusical() {
        this.reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Música 1");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    };

    public void AparelhoTelefonico() {
        this.aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("0800 123456");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    };

    public void NavegadorInternet() {
        this.navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina("https://www.google.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
