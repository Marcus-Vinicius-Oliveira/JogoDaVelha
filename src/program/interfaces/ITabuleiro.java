package program.interfaces;

import program.Jogador;
import program.entities.Tabuleiro;

public interface ITabuleiro {

    Boolean verificaGanhador(Tabuleiro tabuleiro, Jogador jogador1, Jogador jogador2);
}
