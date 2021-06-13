package br.com.generation.menu2;

import java.util.Scanner;

public class direcionamento extends informacoesPs{
	
	public void direcao() {
		Scanner sc  = new Scanner(System.in);
		
		
		if(getSos() == 1) {
			System.out.println("\n================================================================");
			System.out.println("   Mantenha a calma " + getNome() + ", estamos aqui para te ajudar! ");
			System.out.println("   Você será direcionado a um agente humano!   ");
			System.out.println("Digite 1, para seguir com o cadastro e ser direcionado ao agente humano");
			System.out.println("Ou, digite 0 para sair do programa");
			int segue = sc.nextInt();
			
			if(segue == 1) {
				
			}
			else{

				System.exit(0);
			}
		
			}
		}
	
	}
