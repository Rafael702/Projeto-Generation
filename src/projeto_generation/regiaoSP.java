package projeto_generation;


public class regiaoSP extends informacoesPs{
	
	public void regiao() {

	System.out.println("Em qual região de São Paulo você mora?\n");
	String  string [] = new String [4];
		
	string[0] = "Protocolo: Ghetsksjdksfjsfsd89";
	string[1] = "Protocolo: Ghetsdadadhasjkd78";		
	string[2] = "Protocolo: Ghetsdadadhdjdsdd55";
	string[3] = "Protocolo: Ghetsdadadddsdswut71";		
			
	System.out.println("[1] Zona Norte");
	System.out.println("[2] Zona Sul");
	System.out.println("[3] Zona Leste");
	System.out.println("[4] Zona Oeste");
			
	setReg(sc.nextInt());
	
	if(getReg()==1) {
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[0]);
	}else if(getReg() == 2) {
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[1]);
	}else if (getReg() == 3){
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[2]);
	}else {
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[3]);
		
	
		}
		
	}
}
