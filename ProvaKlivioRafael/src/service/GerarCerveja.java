package service;

import model.Cerveja;


/** Princ�pios Solid Aplicados: 
 * 
 * 		1 - Responsabilidade �nica;  
 * 		2 - Segrega��o de Interfaces; 
 * 
 * **/		

public interface GerarCerveja {
	
		public Cerveja criaCerveja (Cerveja cerveja, String tipoCerveja);

}
