package br.com.generation.menu2;

public class genero extends informacoesPs{
	
	public void indiceGenero() {
		
		System.out.println("\nQual gênero você se identifica?");		
		int [] genero = new int [6];
		
				
		System.out.println("\n[1] ---> Homem cis\n");
		System.out.println("[2] ---> Mulher cis\n");
		System.out.println("[3] ---> Homem trans\n");
		System.out.println("[4] ---> Mulher trans\n");
		System.out.println("[5] ---> Não Binário\n");
		System.out.println("[6] ---> Outros\n");
		
	}
}
