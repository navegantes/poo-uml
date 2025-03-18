package iPhone.NavegadorInternet;

public class NavegadorInternet implements INavegadorInternet {

    public NavegadorInternet() {
        System.out.println("\nAbrindo Navegador de Internet");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página:\n> " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
