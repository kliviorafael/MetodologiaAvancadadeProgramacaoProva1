package service;

import model.Cerveja;


/** Princípios Solid Aplicados: 
 * 
 * 		1 - Responsabilidade Única;  
 * 		2 - Segregação de Interfaces; 
 * 
 * **/		

public interface GerarCerveja {
	
		public Cerveja criaCerveja (Cerveja cerveja, String tipoCerveja);

}
