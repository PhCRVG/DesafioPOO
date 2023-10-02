package Produto;

import Interface.AparelhoCelular;
import Interface.Musica;
import Interface.Navegador;

public class Iphone implements AparelhoCelular, Navegador, Musica {

    public void ligar(String numero) {
        System.out.println("ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    public void CorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void tocar(String musica) {

        System.out.println("Reproduzindo " + musica);
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }
}