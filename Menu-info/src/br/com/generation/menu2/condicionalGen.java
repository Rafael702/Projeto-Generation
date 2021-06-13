package br.com.generation.menu2;

public class condicionalGen extends genero{
	
	public void condGen(informacoesPs objeto) {
		
		indiceGenero();
		objeto.setGenero(sc.nextInt());
		 
		do {
		if(objeto.getGenero() == 1) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como homem cis!");
			System.out.println("============================================");
			
			
		}else if(objeto.getGenero() == 2) {
			System.out.println("============================================");
			System.out.println("Perfeito. VocÃª se identifica como mulher cis!");
			System.out.println("============================================");
		}
		else if(objeto.getGenero() == 3) {
			System.out.println("============================================");
			System.out.println("Perfeito. VocÃª se identifica como homem trans!");
			System.out.println("============================================");
		}
		else if(objeto.getGenero() == 4) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como mulher trans!");
			System.out.println("============================================");
		}
		else if(objeto.getGenero() == 5) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como Não Binárie!");
			System.out.println("============================================");
		}
		else if (objeto.getGenero() == 6) {
			System.out.println("============================================");
			System.out.println("Perfeito, respeitamos sua privacidade!");
			System.out.println("============================================");
		}
		else{
			System.out.println("=========================");
			System.out.println("Digite uma opção valida!");
			System.out.println("=========================");
			condGen(objeto);
			}	
		
		}while(objeto.getGenero() == 0);// precisa voltar pras opÃ§Ãµes
		
	}
}
