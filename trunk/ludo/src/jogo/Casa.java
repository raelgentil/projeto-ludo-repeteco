package jogo;

import interfaces.CasaIF;

public class Casa {
	private String id;
	private String casa;
	//Comandos cas;
	private String param;
	protected CasaIF comando;
	
	public Casa(String id, String  casa, String param){
		this.id = id;
		this.casa = casa;
		this.param = param;
	}
	//Método do evento
	public void Comando(String casa){
		comando.comando(casa);
	}

	public String getId() {
		return id;
	}

	public String getCasa() {
		return casa;
	}

	public String getParam() {
		return param;
	}

}
