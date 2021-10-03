package service;

public class GerarFactory implements Cerveja_FactoryInterface {

	public Cerveja_Factory criarFactory() {
		
		Cerveja_Factory cerveja = new Cerveja_Factory();
		
		return cerveja;
	}
	
}
