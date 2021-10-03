package model;

public class Cerveja {
	
	//atributos
	
		public String Codigo; 
		public String Nome; 
		public String Data_Producao; 
		public String Data_Validade; 
		public float Preco;
		
		// Construtor
		
		public Cerveja() {
			
		}
		
		public Cerveja(String codigo, String nome, String data_Producao, String data_Validade, float preco) {
			this.Codigo = codigo;
			this.Nome = nome;
			this.Data_Producao = data_Producao;
			this.Data_Validade = data_Validade;
			this.Preco = preco;
		}

		// Gets e Sets

		public String getCodigo() {
			return Codigo;
		}


		public void setCodigo(String codigo) {
			Codigo = codigo;
		}


		public String getNome() {
			return Nome;
		}


		public void setNome(String nome) {
			Nome = nome;
		}


		public String getData_Producao() {
			return Data_Producao;
		}


		public void setData_Producao(String data_Producao) {
			Data_Producao = data_Producao;
		}


		public String getData_Validade() {
			return Data_Validade;
		}


		public void setData_Validade(String data_Validade) {
			Data_Validade = data_Validade;
		}


		public float getPreco() {
			return Preco;
		}


		public void setPreco(float preco) {
			Preco = preco;
		}
		
		
		public String toString() {
			
			
			String resultado = "Informações Cadastro - Cerveja:  " + 
					           "\n\tCódigo: " + this.getCodigo() +  
					           "\n\tNome: " + this.getNome() +
					           "\n\tData de Produção: " + this.getData_Producao() +
					           "\n\tData de Validade: " + this.getData_Validade() +
					           "\n\tPreço: " + this.getPreco();
					            
			return resultado; 
		}

}
