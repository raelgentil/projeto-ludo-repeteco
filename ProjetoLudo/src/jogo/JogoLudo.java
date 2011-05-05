package jogo;

import java.util.Map;

public class JogoLudo {
	private int numPecas;
	private int tamanhoDado;
	
	public JogoLudo(){
		
	}
	
	public void criarJogo(int pecas, int dado){
		this.numPecas = pecas;
		this.tamanhoDado = dado;
	}

	public int getNumPecas() {
		return numPecas;
	}

	public int getTamanhoDado() {
		return tamanhoDado;
	}

}
