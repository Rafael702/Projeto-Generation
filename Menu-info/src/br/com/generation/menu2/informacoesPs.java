package br.com.generation.menu2;

import java.util.Scanner;

public class informacoesPs extends Regiao{
	
	public static void nomePacient() {
		
		System.out.println("\nQual é o seu nome?");
		Scanner sc = new Scanner(System.in);
		String nome;
		
	}
	
	public static void infoPaciente() {
		Scanner sc = new Scanner(System.in);
		String nome; 
		String zona = null;
		
		nomePacient();
		nome = sc.next();
		
		System.out.println("\n============================================");
		System.out.println("    EM CASO DE URGÃŠNCIA, DIGITE [1] ");
		System.out.println("    CASO QUEIRA SE CADASTRAR, DIGITE [2] ");
		System.out.println("    CASO VOCÊ QUEIRA SAIR DO PROGRAMA, DIGITE [0] ");
		
		int sos;
		sos = sc.nextInt();
		
		do {
			if(sos == 1) {
			System.out.println("\n================================================================");
			System.out.println("   Mantenha a calma " + nome + ", estamos aqui para te ajudar! ");
			System.out.println("   Você será direcionado a um agente humano!   ");
			System.out.println("================================================================");
				break;
			}
			 
			/**/
			// criar ramificaÃ§Ã£o/caminho pro SOS
			
			if(sos ==2) {
			
			
			
			System.out.println("============================================");
			System.out.println("\nOk " + nome + "! Agora você será nossa prioridade.");
			System.out.println("\nPor favor digite a sua idade:");
			int idadePaciente; 
			idadePaciente = sc.nextInt();
			
			
			System.out.println("=============================================");
			System.out.println("Certo " + nome + "! São mais algumas perguntas.");
			System.out.println("=============================================");
			
			
			
			System.out.println("\nQual gÃªnero vocÃª se identifica?");		
			int [] genero = new int [6];
			
			genero[0] = 1;
			genero[1] = 2;
			genero[2] = 3;
			genero[3] = 4;
			genero[4] = 5;
			genero[5] = 6;			
			
			System.out.println("\n[" + genero[0] + "] ---> Homem cis\n");
			System.out.println("[" + genero[1] + "] ---> Mulher cis\n");
			System.out.println("[" + genero[2] + "] ---> Homem trans\n");
			System.out.println("[" + genero[3] + "] ---> Mulher trans\n");
			System.out.println("[" + genero[4] + "] ---> Não Binário\n");
			System.out.println("[" + genero[5] + "] ---> Outros\n");
			int numeroGenero;
			numeroGenero = sc.nextInt();
			
			
			if(numeroGenero == 1) {
				System.out.println("============================================");
				System.out.println("Perfeito. Você se identifica como homem cis!");
				System.out.println("============================================");
				
				
			}
			if(numeroGenero == 2) {
				System.out.println("============================================");
				System.out.println("Perfeito. VocÃª se identifica como mulher cis!");
				System.out.println("============================================");
			}
			if(numeroGenero == 3) {
				System.out.println("============================================");
				System.out.println("Perfeito. VocÃª se identifica como homem trans!");
				System.out.println("============================================");
			}
			if(numeroGenero == 4) {
				System.out.println("============================================");
				System.out.println("Perfeito. Você se identifica como mulher trans!");
				System.out.println("============================================");
			}
			if(numeroGenero == 5) {
				System.out.println("============================================");
				System.out.println("Perfeito. Você se identifica como Não Binárie!");
				System.out.println("============================================");
			}
			if (numeroGenero == 6) {
				System.out.println("============================================");
				System.out.println("Perfeito, respeitamos sua privacidade!");
				System.out.println("============================================");
			}
			else if(numeroGenero < 0 || numeroGenero > 6) {
				System.out.println("=========================");
				System.out.println("Digite uma opção valida!");
				System.out.println("=========================");
				// precisa voltar pras opÃ§Ãµes
			}
			
			else {
				System.out.println("    EM CASO DE URGENCIA, DIGITE [1] ");
				System.out.println("    CASO QUEIRA SE CADASTRAR, DIGITE [2] ");
				System.out.println("    CASO VOCÊ QUEIRA SAIR DO CADASTRO, DIGITE [0] ");
				sos = sc.nextInt();
				
			}
			
						}
			}while(sos !=0);
		
					Regiao(zona);
		}
	
}
