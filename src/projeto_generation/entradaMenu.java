package projeto_generation;

public class entradaMenu extends informacoesPs{
	
	public void entradaDeDados(informacoesPs objeto) throws InterruptedException {
		
		while(objeto.getSos() != 0){
		System.out.println("\nO que gostaria de fazer?");
		
		Thread.sleep(1000);
		
		System.out.println("\n===============================================");
		System.out.println("[1] Preciso de ajuda");
		System.out.println("[2] Gostaria de gerar um c�digo de atendimento");
		System.out.println("[0] Desejo sair");
		System.out.println("===============================================");
		objeto.setSos(sc.nextInt());
		
		
		if(objeto.getSos() == 1){
			condSOS sos = new condSOS();
			sos.saida(objeto);		
			
		}else if(objeto.getSos() == 2){
			
		Cadastro cadastro = new Cadastro();
		cadastro.informe(objeto);
		
		genero genero = new genero();
		genero.condGen(objeto);
		
		regiaoSP regiao = new regiaoSP();
		regiao.regiao();
		
		}else if(objeto.getSos() == 0){
			
			System.out.println("Sa�de � um direito que deve ser garantido para todes!\n"
	                + "Continue se cuidando, continue cuidando de pessoas pr�ximas � voc�,\n"
	                + "para que todes possamos ESBAN.JAR SA�DE!");
		}else{System.out.println("Ops! N�mero informado � inv�lido...");}}
}
}