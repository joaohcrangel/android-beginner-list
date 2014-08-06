package br.curso.models;

public class Pessoa {
	
	private int id;
	private int idade;
	private String nome;
	private float peso;
	
	public Pessoa(int id, String nome, float peso, int idade) {
		super();
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.peso = peso;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
