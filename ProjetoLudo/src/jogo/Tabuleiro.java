package jogo;

import java.util.List;

import excessoes.TabuleiroException;

public class Tabuleiro {
	private List <Casa> tabuleiro;
	
	public Tabuleiro(){
		this.tabuleiro = tabuleiro;
	}
	
	public void adicionarCasa(Casa casa) throws TabuleiroException{
		
		if(semID(casa)){
			
			if(casa.getNome() == "INICIO"){
				if(umInicio(casa)){
					tabuleiro.add(casa);
				}else{
					throw new TabuleiroException("Tipo de casa invalido: '" + casa.getNome() + "'");
				}
			}
			
			if(casa.getNome() == "FIM"){
				if(umFim(casa)){
					tabuleiro.add(casa);
				}else{
					throw new TabuleiroException("Tipo de casa invalido: '" + casa.getNome() + "'");
				}
			}
			
			if(casa.getNome() == "NADA"){
				tabuleiro.add(casa);
			}
			
			if(casa.getNome() == "REPETE"){
				tabuleiro.add(casa);
			}
			
			if(casa.getNome() == "PARA"){
				tabuleiro.add(casa);
			}
			
			if(casa.getNome() == "VOLTA"){
				int qtde = Integer.parseInt(casa.getParametro());
				if( (qtde >= 0) && (qtde <= tabuleiro.indexOf(casa)) ){
					tabuleiro.add(casa);
				}else{
					throw new TabuleiroException("Numero de casas para voltar invalido: '" + casa.getParametro() + "'");
				}
			}
			
			if(casa.getNome() == "AVANCA"){
				int qtde = Integer.parseInt(casa.getParametro());
				if( (qtde >= tabuleiro.indexOf(casa)) && (qtde <= tabuleiro.size()) ){
					tabuleiro.add(casa);
				}else{
					throw new TabuleiroException("Numero de casas para voltar invalido: '" + casa.getParametro() + "'");
				}
			}
			
			if(casa.getNome() == "IR_PARA"){
				if(!semID(casa)){
					tabuleiro.add(casa);
				}else{
					throw new TabuleiroException("Nao existe casa com id '" + casa.getParametro() + "'");
				}	
			}else{
				throw new TabuleiroException("Tipo de casa invalido: '" + casa.getNome() + "'");
			}
		}else{
			throw new TabuleiroException("ID Invalido: '" + casa.getID() + "'");
		}
		
	}
	
	public int getTamanhoTabuleiro(){
		return tabuleiro.size();
	}
	
	//verifica se tem o ID na lista
	public boolean semID(Casa casa){
		boolean tem = true;
		for(Casa c: tabuleiro){
			if(c.getID() == casa.getID()){
				tem = false;
			}
		}
		return tem;
	}
	
	//verifica se ja existe uma casa INICIO
	public boolean umInicio(Casa casa){
		boolean tem = true;
		for(Casa c: tabuleiro){
			if(c.getNome() == "INICIO"){
				tem = false;
			}
		}
		return tem;
	}
	
	//verifica se ja existe uma casa FIM
	public boolean umFim(Casa casa){
		boolean tem = true;
		for(Casa c: tabuleiro){
			if(c.getNome() == "FIM"){
				tem = false;
			}
		}
		return tem;
	}


}
