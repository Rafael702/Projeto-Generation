package br.com.generation.menu;

import java.util.Scanner;

import br.com.generation.menu2.Cadastro;
import br.com.generation.menu2.Entrada;
import br.com.generation.menu2.Regiao;
import br.com.generation.menu2.condicional1;
import br.com.generation.menu2.condicionalGen;
import br.com.generation.menu2.informacoesPs;

public class imprimirMenu {
	
	public static void main(String [] args)	throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		informacoesPs pacient = new informacoesPs();
		
		pacient.setNome(sc.next());
		Entrada e = new Entrada();
		
		
		
		condicionalGen cgn = new condicionalGen();
		
		cgn.condGen(pacient);
		
		Regiao regi = new Regiao();
		
		regi.Regiao();
		
	}
	
}
