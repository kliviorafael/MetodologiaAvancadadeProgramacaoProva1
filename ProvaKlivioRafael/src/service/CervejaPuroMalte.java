package service;

import model.Cerveja;

/**
 * Príncipio SOLID aplicado: 
 * 
 *     2 - Aberto - Fechado. 
 *     Aberto para extensão, fechado para modificar.
 * 
 */

public class CervejaPuroMalte extends Cerveja{
	

	private Cerveja cerveja;

	public CervejaPuroMalte(Cerveja cerveja) {
		this.cerveja = cerveja;
	}
	
	@Override
	public String toString() {
		
		String resultado; 
		
		resultado = "Segue os dados da Cerveja do Tipo Puro Malte: " +
					"\n" + cerveja;
		
		return resultado; 
	}
	
}
