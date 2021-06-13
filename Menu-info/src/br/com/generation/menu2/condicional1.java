package br.com.generation.menu2;

public class condicional1 extends informacoesPs{
	
	
	public void saida(informacoesPs objeto) {
		objeto.setSos(sc.nextInt());
		if(objeto.getSos() == 1) {
			
			System.out.println("\n================================================================");
			System.out.println("   Você será direcionado a um agente humano!   ");
			System.out.println("Digite 1, para seguir com o cadastro e ser direcionado ao agente humano");
			System.out.println("Ou, digite 0 para sair do programa");
			objeto.setSegue(sc.nextInt());
			
		if(objeto.getSegue() == 1) {
			
			Regiao regi = new Regiao();
			regi.Regiao();
			
		}else {
			System.out.println("Acabou");
			System.exit(0);
					}
				}	
	
			}
		}
