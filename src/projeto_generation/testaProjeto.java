package projeto_generation;

import java.util.*;

public class testaProjeto extends informacoesPs{
	

		public static void main(String[] args)  throws InterruptedException {
			
			Scanner sc = new Scanner(System.in);
			informacoesPs usuario = new informacoesPs();
			
			System.out.println("==========================================");
			System.out.println("==== SEJA BEM-VINDE AO ESBAN.JAR SAÚDE ===");
			System.out.println("==========================================");
			
			Thread.sleep(2000);
			
			System.out.println("Como posso te chamar?");
			usuario.setNome(sc.next());
			System.out.println("Muito prazer, " + usuario.getNome() + "!\nEu me chamo Generatrix e irei lhe auxiliar por aqui.");
			
			Thread.sleep(3000);
			
			entradaMenu menu = new entradaMenu();
			menu.entradaDeDados(usuario);
					
				
			sc.close();
					
			} 	
		}

