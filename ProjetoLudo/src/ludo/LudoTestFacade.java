package ludo;

import excessoes.JogadaException;
import excessoes.TabuleiroException;

public class LudoTestFacade {
	LudoFacade fachada = new LudoFacade();

	public void criarJogo(int numPecas, int tamanhoDado){
		fachada.criarJogo(numPecas, tamanhoDado);
	}

	public int getNumPecas(){
		return fachada.getNumPecas();
	}

	public int getTamanhoDado(){
		return fachada.getTamanhoDado();
	}

	public int getTamanhoTabuleiro(){
		return fachada.getTamanhoTabuleiro();
	}

	public void adicionaCasa(String id, String nome, String param) throws TabuleiroException{
		// implementar
	}

	public void jogar(int jogador, int dado) throws JogadaException{
		// implementar
	}

	public String getStatusJogo(){
		// implementar
		return null;
	}

	public void sairJogo(){
		// Sair do Jogo
	}

	public void iniciarJogo(){
		// Iniciar o Jogo
	}

}
