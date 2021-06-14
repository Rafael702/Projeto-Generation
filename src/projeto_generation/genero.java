package projeto_generation;

public class genero extends informacoesPs{
	
	public void indiceGenero() {
		
		System.out.println("\nQual gênero você se identifica?");		
						
		System.out.println("\n[1] Homem cis");
		System.out.println("[2] Mulher cis");
		System.out.println("[3] Homem trans");
		System.out.println("[4] Mulher trans");
		System.out.println("[5] Não Binárie");
		System.out.println("[6] Prefiro não dizer");
		
	}
	
	public void condGen(informacoesPs objeto) {
		
		indiceGenero();
		objeto.setGenero(sc.nextInt());
		 
		do {
		if(objeto.getGenero() == 1) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como HOMEM CIS!");
			System.out.println("============================================");
			
			
		}else if(objeto.getGenero() == 2) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como MULHER CIS!");
			System.out.println("============================================");
		}
		else if(objeto.getGenero() == 3) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como HOMEM TRANS!");
			System.out.println("============================================");
		}
		else if(objeto.getGenero() == 4) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como MULHER TRANS!");
			System.out.println("============================================");
		}
		else if(objeto.getGenero() == 5) {
			System.out.println("============================================");
			System.out.println("Perfeito. Você se identifica como NÃO BINÁRIE!");
			System.out.println("============================================");
		}
		else if (objeto.getGenero() == 6) {
			System.out.println("============================================");
			System.out.println("Sem problemas, respeitamos sua privacidade!");
			System.out.println("============================================");
		}
		else{
			System.out.println("=========================");
			System.out.println("Digite uma opção valida!");
			System.out.println("=========================");
			condGen(objeto);
			}	
		
		}while(objeto.getGenero() == 0);
		
	}
}
