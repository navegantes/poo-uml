import iPhone.iPhone;
import iPhone.AppEnum;

public class App {

    public static void main(String[] args) throws Exception {
        iPhone iphone = new iPhone();

        iphone.carregarAplicativo(AppEnum.REPRODUTOR_MUSICAL);
        iphone.carregarAplicativo(AppEnum.APARELHO_TELEFONICO);
        iphone.carregarAplicativo(AppEnum.NAVEGADOR_INTERNET);
    }
}
