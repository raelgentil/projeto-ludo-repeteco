package jogo;

import java.util.Map;

public class JogoLudo {
	private int numPecas;
	private int tamanhoDado;
	private Map<String, String> jogadores;
	Tabuleiro tabuleiro;
	
	public JogoLudo(){
		
	}
	
	//passa para o jogo o tamanho do dado e a quantidade de jogadores
	public void criarJogo(int numPecas, int tamanhoDado){
		if(numPecas > 0)/*o jogo deve ter pelo menos 1 jogador*/{
			//this.numPecas = numPecas;
			//this.tamanhoDado = tamanhoDado;
			setNumPecas(numPecas);
			setTamanhoDado(tamanhoDado);
		}else{
			System.out.println("É necessário pelo menos 1 jogador!");
		}
	}
	
	//coloca os jogadores na posicao inicial
	public void iniciarJogo(){
		String casa = "sem cada INICIO!";
		for(Casa c: tabuleiro.getTabuleiro()){
			if(c.getCasa() == "INICIO"){
				casa = c.getId();
				break;
			}
		}
		
		for(int i=1; i <= getNumPecas(); i++){
			jogadores.put("J" + i, casa);
		}
	}
	
	//ver em que casa cada jogador esta
	public void getStatusJogo(){
		for(int i=1; i<=jogadores.size(); i++){
			String casa = jogadores.get("J" + i);
			System.out.print("J" + i + ":" + casa);
			if(i < jogadores.size()){
				System.out.print("/");
			}
		}
	}
	
	//terminar o jogo
	public void sairJogo(){
		//???
	}

	public int getNumPecas() {
		return numPecas;
	}

	public int getTamanhoDado() {
		return tamanhoDado;
	}

	public void setNumPecas(int numPecas) {
		this.numPecas = numPecas;
	}

	public void setTamanhoDado(int tamanhoDado) {
		this.tamanhoDado = tamanhoDado;
	}

}
