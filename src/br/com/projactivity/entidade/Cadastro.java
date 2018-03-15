package br.com.projactivity.entidade;

public class Cadastro {

	private int id;
	private double peso;
	private String nome;
	private String tipo;
	private String datacadastro;
	private double valor;
	


	public Cadastro(){
		
	}
	
	public Cadastro(int id, double peso, double valor, String nome, String tipo, String datacadastro) {
		this.id = id;
		this.peso = peso;
		this.nome = nome;
		this.tipo = tipo;
		this.datacadastro = datacadastro;
	}

	public int getId() {
		return id;
	}

	public void setCodigo(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
