package br.com.israelsoares.maratonajava.javacore.Gassociation.test;

import br.com.israelsoares.maratonajava.javacore.Gassociation.domain.Jogador;
import br.com.israelsoares.maratonajava.javacore.Gassociation.domain.Time;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bebeto");
        jogador1.setName("Ronaldinho");

        Time time = new Time("Curintxas");

        jogador1.setTime(time);

        jogador1.print();
    }
}
