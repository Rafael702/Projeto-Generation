package projeto_generation;

import java.util.Scanner;

public class informacoesPs {
	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int sos = 7;
	private int segue;
	private int reg;
	private int idade;
	private int genero;
	
	public void setNome(String nome){
			this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getSos() {
		return sos;
	}

	public void setSos(int sos) {
		this.sos = sos;
	}

	public int getSegue() {
		return segue;
	}

	public void setSegue(int segue) {
		this.segue = segue;
	}
	
	

	public int getReg() {
		return reg;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	

	
	
	
	

	
	
	
	
	
	
}
