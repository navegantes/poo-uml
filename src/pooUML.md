```mermaid
---
config:
  layout: elk
  elk:
    mergeEdges: false
    nodePlacementStrategy: NETWORK_SIMPLEX
  theme: dark
---
classDiagram

    iPhone --> Aplicativo 
    iPhone *-- IReprodutorMusical
    iPhone *-- IAparelhoTelefonico
    iPhone *-- INavegadorInternet

    IReprodutorMusical  <|.. ReprodutorMusical
    IAparelhoTelefonico <|.. AparelhoTelefonico
    INavegadorInternet  <|.. NavegadorInternet 
    

    class iPhone {
        -ReprodutorMusical
        -AparelhoTelefonico
        -NavegadorInternet

      +AbrirReprodutorMusical()
      +AbrirAparelhoTelefonico()
      +AbrirNavegadorInternet()
    }

    class Aplicativo {
    <<enumeration>>
    REPRODUTOR_MUSICAL
    APARELHO_TELEFONICO
    NAVEGADOR_INTERNET
    }

    class IReprodutorMusical {
    <<interface>> 
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class IAparelhoTelefonico {
    <<interface>> 
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class INavegadorInternet {
    <<interface>> 
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    

```