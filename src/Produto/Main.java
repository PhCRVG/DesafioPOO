package Produto;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar("70707070");
        iphone.atender();
        iphone.CorreioVoz();

        iphone.tocar("Flowers - Miley Cyrus");
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }

}
