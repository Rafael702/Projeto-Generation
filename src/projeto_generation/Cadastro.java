package projeto_generation;


public class Cadastro extends informacoesPs{
	
	public void informe(informacoesPs objeto)  throws InterruptedException{
		
		Thread.sleep(50);

		System.out.println("============================================");
		System.out.println("\nOk " + objeto.getNome() + "! Agora você será nossa prioridade.");
		System.out.println("\nPor favor digite a sua idade:");
		objeto.setIdade( sc.nextInt());
		
		Thread.sleep(1000);
		System.out.println("=============================================");
		System.out.println("Certo " + objeto.getNome() + "! Só mais algumas perguntas.");
		System.out.println("=============================================");
		
		Thread.sleep(1000);
		
	}
}
