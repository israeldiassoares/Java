package br.com.israelsoares.maratonajava.javacore.Gassociation.test;

import br.com.israelsoares.maratonajava.javacore.Gassociation.domain.Jogador;
import br.com.israelsoares.maratonajava.javacore.Gassociation.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador1};
        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----- Jogador ----- ");
        jogador.print();

        System.out.println("----- Time ----- ");
        time.print();
    }
}
