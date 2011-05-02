package ludo;

import jogo.Casa;
import jogo.JogoLudo;
import excessoes.JogadaException;
import excessoes.TabuleiroException;

public class LudoFacade {
	JogoLudo jogo;

	public void criarJogo(int numPecas, int tamanhoDado){
		jogo.criarJogo(numPecas, tamanhoDado);
	}

	public int getNumPecas(){
		return jogo.getNumPecas();
	}

	public int getTamanhoDado(){
		return jogo.getTamanhoDado();
	}

	public int getTamanhoTabuleiro(){
		// implementar
		return -1;
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
