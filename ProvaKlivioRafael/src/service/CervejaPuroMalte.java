package service;

import model.Cerveja;

/**
 * Pr�ncipio SOLID aplicado: 
 * 
 *     2 - Aberto - Fechado. 
 *     Aberto para extens�o, fechado para modificar.
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
