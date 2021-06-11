package br.com.generation.menu2;

import java.util.Scanner;

public class Regiao {
	
	
	
	public static void Regiao(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Em qual regiÃ£o de SÃ£o Paulo vocÃª mora?");
	String  string [] = new String [4];
	
	
	string[0] = "Protocolo: Ghetsksjdksfjsfsd89";
	string[1] = "Protocolo: Ghetsdadadhasjkd78";		
	string[2] = "Protocolo: Ghetsdadadhdjdsdd55";
	string[3] = "Protocolo: Ghetsdadadddsdswut71";		
			
	System.out.println("[1] --->" + "Zona Norte\n");
	System.out.println("[2] --->" + "Zona Sul\n");
	System.out.println("[3] --->" + "Zona Leste\n");
	System.out.println("[4] --->" + "Zona Oeste\n");
	
	int reg;
	
	reg = sc.nextInt();
	
	if(reg==1) {
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[0]);
	}else if(reg == 2) {
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[1]);
	}else if (reg == 3){
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[2]);
	}else {
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[3]);
		
	
		}
		
	}
}
