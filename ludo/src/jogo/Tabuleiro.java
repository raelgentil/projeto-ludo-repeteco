package jogo;

import java.util.List;

import excessoes.TabuleiroException;

public class Tabuleiro {
	private List<Casa> tabuleiro;
	
	public Tabuleiro(){
		this.tabuleiro = tabuleiro;
	}
	
	//nao esta pronto nem muito menos validado!!! 
	public void addCasa(Casa casa) throws TabuleiroException{
		for(Casa c: tabuleiro){
			
			//ID nulo
			if(casa.getId() == null){
				throw new TabuleiroException("ID Invalido: 'null'");
			}
			
			//ID vazio
			if(casa.getId() == ""){
				throw new TabuleiroException("ID Invalido: ''");
			}
			
			//comando nulo
			if(casa.getCasa() == null){
				throw new TabuleiroException("Tipo de casa invalido: 'null'");
			}
			
			//comando vazio
			if(casa.getCasa() == ""){
				throw new TabuleiroException("Tipo de casa invalido: ''");
			}
			
			//comando que nao existe --> ver os tipos de casa (padrao Strategy)
			if( (casa.getCasa() != "INICIO") || 
					(casa.getCasa() != "NADA") || 
					(casa.getCasa() != "REPETE") || 
					(casa.getCasa() != "PARA") || 
					(casa.getCasa() != "VOLTA") || 
					(casa.getCasa() != "AVANCA") || 
					(casa.getCasa() != "IR_PARA") || 
					(casa.getCasa() != "FIM") ){
				throw new TabuleiroException("Tipo de casa invalido: '" + casa.getCasa() + "'");
			}
			
			//ID já existente
			if(casa.getId() == c.getId()){
				throw new TabuleiroException("Ja existe uma casa com ID '" + casa.getId() + "'");
			}
			
			//apenas um INICIO/FIM
			if( (casa.getCasa() == "INICIO" && casa.getCasa() == c.getCasa()) || 
					(casa.getCasa() == "FIM" && casa.getCasa() == c.getCasa()) ){
				throw new TabuleiroException("");//verificar mensagem de erro!!!
			}
			
			//testes dos parâmetros
			
			//casas que nao tem parametros
			if( ( (casa.getCasa() == "INICIO") && (casa.getParam() != null) ) ||
					( (casa.getCasa() == "NADA") && (casa.getParam() != null) ) ||
					( (casa.getCasa() == "REPETE") && (casa.getCasa() != null) ) ||
					( (casa.getCasa() == "PARA") && (casa.getParam() != null) ) ){
				//?
			}
			
			//parametros errados
			if( (casa.getCasa() == "VOLTA") && (c.getParam() == "" /* comparar com os IDs das casas*/) ){
				
			}
			
			for(Casa cs: tabuleiro){
				if( casa.getParam() != cs.getId() ){
					throw new TabuleiroException("");
				}
			}
			/*
			else{
				tabuleiro.add(c);
				break;
			}*/
		}
	}
	
	public int getTamanhoTabuleiro(){
		int i = 0;
		for(Casa c: tabuleiro){
			i += i;
		}
		return i;
	}

	public List<Casa> getTabuleiro() {
		return tabuleiro;
	}

}
