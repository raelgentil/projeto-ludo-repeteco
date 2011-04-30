package jogo;

import java.util.List;

import excessoes.TabuleiroException;

public class Tabuleiro {
	private List<Casa> tabuleiro;
	
	public Tabuleiro(){
		this.tabuleiro = tabuleiro;
	}
	
	public void addCasa(Casa casa) throws TabuleiroException{
		for(Casa c: tabuleiro){
			
			//ID nulo
			if(c.getId() == null){
				throw new TabuleiroException("ID Invalido: 'null'");
			}
			
			//ID vazio
			if(c.getId() == ""){
				throw new TabuleiroException("ID Invalido: ''");
			}
			
			//comando nulo
			if(c.getCasa() == null){
				throw new TabuleiroException("Tipo de casa invalido: 'null'");
			}
			
			//comando vazio
			if(c.getCasa() == ""){
				throw new TabuleiroException("Tipo de casa invalido: ''");
			}
			
			//comando que nao existe --> ver os tipos de casa (padrao Strategy)
			if( (c.getCasa() != "INICIO") || 
					(c.getCasa() != "NADA") || 
					(c.getCasa() != "REPETE") || 
					(c.getCasa() != "PARA") || 
					(c.getCasa() != "VOLTA") || 
					(c.getCasa() != "AVANCA") || 
					(c.getCasa() != "IR_PARA") || 
					(c.getCasa() != "FIM") ){
				throw new TabuleiroException("Tipo de casa invalido: '" + c.getCasa() + "'");
			}
			
			//ID já existente
			if(c.getId() == casa.getId()){
				throw new TabuleiroException("Ja existe uma casa com ID '" + c.getId() + "'");
			}
			
			//apenas um INICIO/FIM
			if( (c.getCasa() == "INICIO" && c.getCasa() == casa.getCasa()) || 
					(c.getCasa() == "FIM" && c.getCasa() == casa.getCasa()) ){
				throw new TabuleiroException("");//verificar mensagem de erro!!!
			}
			
			else{
				tabuleiro.add(c);
				break;
			}
		}
	}
	
	public int getTamanhoTabuleiro(){
		int i = 0;
		for(Casa c: tabuleiro){
			i += i;
		}
		return i;
	}

}
