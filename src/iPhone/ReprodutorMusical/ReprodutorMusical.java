package iPhone.ReprodutorMusical;

public class ReprodutorMusical implements IReprodutorMusical {

    private String musicaCorrente;

    public ReprodutorMusical() {
        this.musicaCorrente = null;
        System.out.println("\nReprodutor Musical");
    }

    @Override
    public void tocar() {
        if (musicaCorrente == null) {
            System.out.println("Nenhuma música selecionada");
            return;
        }
        System.out.println("Tocando música: " + musicaCorrente);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaCorrente = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
