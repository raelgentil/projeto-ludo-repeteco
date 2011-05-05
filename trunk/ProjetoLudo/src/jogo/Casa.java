package jogo;

public class Casa {
	private String ID;
	private String nome;
	private String parametro;
	
	public Casa(String id, String nome, String param){
		this.ID = id;
		this.nome = nome;
		this.parametro = param;
	}
	
	public Casa(String id, String nome){
		this.ID = id;
		this.nome = nome;
	}

	public String getID() {
		return ID;
	}

	public String getNome() {
		return nome;
	}

	public String getParametro() {
		return parametro;
	}

}
