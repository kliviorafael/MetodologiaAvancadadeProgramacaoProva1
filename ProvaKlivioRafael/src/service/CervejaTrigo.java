package service;

import model.Cerveja;

/**
 * Pr?ncipio SOLID aplicado: 
 * 
 *     2 - Aberto - Fechado. 
 *     Aberto para extens?o, fechado para modificar.
 * 
 */

public class CervejaTrigo extends Cerveja{
	

	private Cerveja cerveja;

	public CervejaTrigo(Cerveja cerveja) {
		this.cerveja = cerveja;
	}
	
	@Override
	public String toString() {
		
		String resultado; 
		
		resultado = "Segue os dados da Cerveja do Tipo Trigo: " +
					"\n" + cerveja;
		
		return resultado; 
	}
}
