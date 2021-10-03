package service;

import model.Cerveja;

public class TiposdeCerveja extends Cerveja{
	
	public TiposdeCerveja() {
	}

	
	//Construtor gerado com os atributos de Cerveja
	
	public TiposdeCerveja(String codigo, String nome, String data_Producao, String data_Validade, float preco) {
		super(codigo, nome, data_Producao, data_Validade, preco);
		
	}
	
	
	
	

}
