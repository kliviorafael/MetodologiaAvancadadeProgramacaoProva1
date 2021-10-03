package service;

import model.Cerveja;

/**
 * 
 * Princ�pios SOLID Aplicados:
 * 
 * 1 - Invers�o de Depend�ncia
 * @author Klivio
 *
 */


public class Cervejas implements GerarCerveja {
	
	private Cerveja cervejateste;
	private Cerveja_FactoryInterface cerveja_factoryinterface;
	private Cerveja_Factory cerveja_factory;
	
	public Cervejas() {
		cerveja_factoryinterface = new GerarFactory();
	}
	
	
	public Cerveja criaCerveja(Cerveja cervejateste, String tipoCerveja) {
		this.cervejateste = cervejateste;
		
		cerveja_factory = cerveja_factoryinterface.criarFactory(); 
		
		return cerveja_factory.criarCerveja(cervejateste, tipoCerveja);
		
	}


	public String toString() {
		return "Resultado: " + cervejateste;
	}

	
	}


