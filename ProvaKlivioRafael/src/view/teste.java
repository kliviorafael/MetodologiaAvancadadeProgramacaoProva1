package view;

import java.util.Scanner;

import model.Cerveja;
import service.Cervejas;
import service.TiposdeCerveja;

/**
 * Princ�pios SOLID aplicados:
 * 
 *  - Substitui��o de Liskov
 * 
 * @author Klivio
 *
 */

public class teste {
	
	public static void main(String[] args ) {
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.println ("        Bem-vindo ao G.R.A.G.A.S       ");
		System.out.println (" =-  Sistema de Gerenciamento de Bebidas  =-");
		
		System.out.println (" =-=-=-   Cadastro de Cerveja     -=-=-");
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		System.out.println (" =- Por favor, insira as informa��es solicitadas =-");
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		Scanner codigo = new Scanner (System.in); 
		System.out.println("O c�digo da Cerveja �:     ");
		String code = codigo.next(); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");

		Scanner nome = new Scanner (System.in); 
		System.out.println("O nome da Cerveja �:     ");
		String name = nome.next(); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");

		
		
		Scanner data_prod = new Scanner (System.in); 
		System.out.println("A data de produ��o �:     ");
		String date_pro = data_prod.next(); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		Scanner data_val = new Scanner (System.in); 
		System.out.println("A data de validade �:     ");
		String date_val = data_val.next(); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		Scanner preco = new Scanner (System.in); 
		System.out.println("O pre�o da cerveja �:     ");
		float valor = preco.nextFloat(); 
		
		
	 	Cerveja cerveja = new TiposdeCerveja(code, name, date_pro, date_val, valor);

		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		System.out.println (" =-=- Segue abaixo os tipos de Cerveja  =-=-");
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.println (" 1 - Cerveja Trigo  ");
		System.out.println (" 2 - Cerveja Sem �lcool  ");
		System.out.println (" 3 - Cerveja Puro Malte  ");
		System.out.println (" 4 - Cerveja Pilsen ");
		System.out.println (" 5 - Cerveja Laranja ");
		System.out.println (" 6 - Cerveja Lagger ");
		System.out.println (" 7 - Cerveja de Cereja e Am�ndoas ");
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		Scanner escolha = new Scanner (System.in); 
		System.out.println("Digite qual cerveja voc� deseja realizar cadastro:     ");
		String choice = escolha.next(); 
		
		Cervejas cervejas = new Cervejas(); 
		Cerveja cervejateste = cervejas.criaCerveja(cerveja, choice);
		
		System.out.println(cervejateste);
		
	}
	

}