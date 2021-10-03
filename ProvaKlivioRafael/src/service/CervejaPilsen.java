package service;

import model.Cerveja;

/**
 * Príncipio SOLID aplicado: 
 * 
 *     2 - Aberto - Fechado. 
 *     Aberto para extensão, fechado para modificar.
 * 
 */


public class CervejaPilsen extends Cerveja{
	

	private Cerveja cerveja;

	public CervejaPilsen(Cerveja cerveja) {
		this.cerveja = cerveja;
	}
	
	@Override
	public String toString() {
		
		String resultado; 
		
		resultado = "Segue os dados da Cerveja do Tipo Pilsen: " +
					"\n" + cerveja;
		
		return resultado; 
	}
	
}
