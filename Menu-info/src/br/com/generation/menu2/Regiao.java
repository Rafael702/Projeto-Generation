package br.com.generation.menu2;


public class Regiao extends informacoesPs{
	
	
	
	public  void Regiao() {


	System.out.println("Em qual região de São Paulo você mora?");
	String  string [] = new String [4];
	
	
	string[0] = "Protocolo: Ghetsksjdksfjsfsd89";
	string[1] = "Protocolo: Ghetsdadadhasjkd78";		
	string[2] = "Protocolo: Ghetsdadadhdjdsdd55";
	string[3] = "Protocolo: Ghetsdadadddsdswut71";		
			
	System.out.println("[1] --->" + "Zona Norte\n");
	System.out.println("[2] --->" + "Zona Sul\n");
	System.out.println("[3] --->" + "Zona Leste\n");
	System.out.println("[4] --->" + "Zona Oeste\n");
	
	
	
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
