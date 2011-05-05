package ludo;

import jogo.Casa;
import jogo.JogoLudo;
import jogo.Tabuleiro;
import excessoes.JogadaException;
import excessoes.TabuleiroException;

public class LudoFacade {
	JogoLudo jogo = new JogoLudo();
	Tabuleiro tabuleiro = new Tabuleiro();

	public void criarJogo(int numPecas, int tamanhoDado){
		//jogo = new JogoLudo(numPecas, tamanhoDado);
		jogo.criarJogo(numPecas, tamanhoDado);
	}

	public int getNumPecas(){
		return jogo.getNumPecas();
	}

	public int getTamanhoDado(){
		return jogo.getTamanhoDado();
	}

	public int getTamanhoTabuleiro(){
		return tabuleiro.getTamanhoTabuleiro();
	}

	public void adicionaCasa(Casa casa) throws TabuleiroException{
		// implementar
	}

	public void jogar(int jogador, int dado) throws JogadaException{
		// implementar
	}

	public String getStatusJogo(){
		// implementar
		return null;
	}

	public void iniciarJogo(){
		// Iniciar o Jogo
	}

	public void sairJogo(){
		// Sair do Jogo
	}

}
