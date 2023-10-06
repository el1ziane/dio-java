// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe que representa o iPhone
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean musicaTocando = false;
    private String musicaAtual = "";
    private boolean ligacaoAtiva = false;
    private String numeroChamada = "";
    private boolean navegando = false;
    private String paginaAtual = "";

    @Override
    public void tocar() {
        if (!musicaTocando) {
            System.out.println("Iniciando a reprodução de música.");
            musicaTocando = true;
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            System.out.println("Pausando a reprodução de música.");
            musicaTocando = false;
        } else {
            System.out.println("Não há música em reprodução para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
        musicaAtual = musica;
    }

    @Override
    public void ligar(String numero) {
        if (!ligacaoAtiva) {
            System.out.println("Iniciando ligação para o número: " + numero);
            ligacaoAtiva = true;
            numeroChamada = numero;
        } else {
            System.out.println("Já existe uma ligação em andamento.");
        }
    }

    @Override
    public void atender() {
        if (ligacaoAtiva) {
            System.out.println("Atendendo chamada de: " + numeroChamada);
        } else {
            System.out.println("Não há chamada para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (ligacaoAtiva) {
            System.out.println("Iniciando correio de voz para a chamada de: " + numeroChamada);
            ligacaoAtiva = false;
            numeroChamada = "";
        } else {
            System.out.println("Não há chamada ativa para iniciar o correio de voz.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        if (!navegando) {
            System.out.println("Exibindo a página: " + url);
            navegando = true;
            paginaAtual = url;
        } else {
            System.out.println("Já está navegando em uma página. Feche a aba atual para abrir uma nova.");
        }
    }

    @Override
    public void adicionarNovaAba(String url) {
        if (navegando) {
            System.out.println("Abrindo uma nova aba com a página: " + url);
        } else {
            System.out.println("Não está navegando em nenhuma página para abrir uma nova aba.");
        }
    }

    @Override
    public void atualizarPagina() {
        if (navegando) {
            System.out.println("Atualizando a página atual: " + paginaAtual);
        } else {
            System.out.println("Não está navegando em nenhuma página para atualizar.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba("https://www.google.com");
        iphone.atualizarPagina();
    }
}

