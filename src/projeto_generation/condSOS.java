package projeto_generation;

public class condSOS extends informacoesPs{
	
	
	public void saida(informacoesPs objeto) throws InterruptedException {
			
			System.out.println("\n================================================================");
			System.out.println("Estamos com e por você, " + objeto.getNome() + "!");
			System.out.println("Digite 1 para que eu te redirecione para um agente humano.");
			
			Thread.sleep(2000);
			
			System.out.println("Caso estejamos sendo precipitados digite 0 para sair do programa.");
			System.out.println("================================================================");
			
			objeto.setSegue(sc.nextInt());
			
		if(objeto.getSegue() == 1) {
			
			regiaoSP regi = new regiaoSP();
			regi.regiao();
			
		}
	}	

}

