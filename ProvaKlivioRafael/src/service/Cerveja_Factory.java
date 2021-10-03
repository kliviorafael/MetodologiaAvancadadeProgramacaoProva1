package service;

import model.Cerveja;

/**
 * 
 * Princípios do SOLID utilizados: 
 * 		1 - Responsabilidade Unica; 
 * 
 *  Construção da Factory do Objeto Cerveja;
 * 
 * @author Klivio
 *
 */

public class Cerveja_Factory {
	
	public Cerveja criarCerveja(Cerveja cerveja, String tipoCerveja) {

	if (tipoCerveja.equals("1")) {
		return new CervejaTrigo(cerveja); 	
		
	} else if (tipoCerveja.equals("2")) {
		return new CervejaSemAlcool(cerveja);
		
	} else if (tipoCerveja.equals("3")) {
		return new CervejaPuroMalte(cerveja);
		
	} else if (tipoCerveja.equals("4")) {
		return new CervejaPilsen(cerveja);
	
	} else if (tipoCerveja.equals("5")) {
		return new CervejaLaranja(cerveja);
		
	} else if (tipoCerveja.equals("6")) {
		return new CervejaLagger(cerveja);
		
	} else if (tipoCerveja.equals("7")) {
		return new CervejaCerejaAmendoa(cerveja);
	
	}
	
	return null;
}

}

	

