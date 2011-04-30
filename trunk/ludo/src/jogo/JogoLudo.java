package jogo;

public class JogoLudo {
	private int numPecas;
	private int tamanhoDado;
	
	public JogoLudo(){
		
	}
	
	public void criarJogo(int numPecas, int tamanhoDado){
		if(numPecas > 0)/*o jogo deve ter pelo menos 1 jogador --> tratar o nao cumprimento*/{
			this.numPecas = numPecas;
			this.tamanhoDado = tamanhoDado;
		}
	}
	
	//Joyce talvez seja melhor criar uma classe para os jogadores com os seus identificadores e em que casa estao
	/*
	public void getStatusJogo(){
		for(int i=1; i==getNumPecas(); i++){
			System.out.println("J" + i);
		}
	}
	*/

	public int getNumPecas() {
		return numPecas;
	}

	public int getTamanhoDado() {
		return tamanhoDado;
	}

}
