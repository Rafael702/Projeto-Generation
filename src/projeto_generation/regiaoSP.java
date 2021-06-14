package projeto_generation;


public class regiaoSP extends informacoesPs {
	
	public void regiao() throws InterruptedException {

	System.out.println("Em qual região de São Paulo você mora?\n");
	String  string [] = new String [4];
		
	string[0] = "Protocolo: ZN_SP-20210203040506";
    string[1] = "Protocolo: ZS_SP-20210203040506";
    string[2] = "Protocolo: ZL_SP-20210203040506";
    string[3] = "Protocolo: ZO_SP-20210203040506";		
			
	System.out.println("[1] Zona Norte");
	System.out.println("[2] Zona Sul");
	System.out.println("[3] Zona Leste");
	System.out.println("[4] Zona Oeste");
			
	setReg(sc.nextInt());
	
	if(getReg()==1) {
		System.out.println("Aqui estão algumas unidades localizadas na Zona Norte de São Paulo");
		System.out.println("==================================================================");
		Thread.sleep(2000);
		System.out.println("*****************");
		System.out.println("   BRASILANDIA   ");
		System.out.println("*****************");

		System.out.println("UBS BRASILÂNDIA\r\n" + 
				"R. PARAPUA, 1646 - BRASILÂNDIA\r\n" + 
				"CEP: 02831-001 - FONE: 3921-3830 / 3921-8713");
		System.out.println("=====================================================");
		Thread.sleep(2000);
		System.out.println("*****************");
		System.out.println("    TUCURUVI    ");
		System.out.println("*****************");

		System.out.println("UBS VILA NIVI\r\n" + 
				"PÇA. CAMPINÓPOLIS, 125 - V. NIVI\r\n" + 
				"CEP: 02252-160 - FONE: 2201-7219 / 2951-7670 / FAX: 2951-7670");
		System.out.println("=====================================================");
		Thread.sleep(2000);
		System.out.println("*****************");
		System.out.println("  VILA MEDEIROS  ");
		System.out.println("*****************");
		
		System.out.println("UBS VILA MEDEIROS\r\n" + 
				"R. EURICO SODRE, 353 - V. MEDEIROS\r\n" + 
				"CEP: 02215-010 - FONE: 2212-2223 / 2939-7795");
			
		Thread.sleep(2000);
		System.out.println("\nCASO QUEIRA SABER AS DEMAIS LOCALIZAÇÕES, BASTA ACESSAR:\n"
				+ "https://www.prefeitura.sp.gov.br/cidade/secretarias/upload/arquivos/secretarias/saude/organizacao/0005/Unid_Munic_Saude_Zona.pdf");
		System.out.println("==============================================================================================================================");
		
		Thread.sleep(1000);
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[0]);
	}else if(getReg() == 2) {
		System.out.println("Aqui estão algumas unidades localizadas na Zona Sul de São Paulo");
		System.out.println("================================================================");
		Thread.sleep(2000);
		System.out.println("*****************");
		System.out.println("  CAPÃO REDONDO  ");
		System.out.println("*****************");

		System.out.println("CECCO SANTO DIAS\r\n" + 
				"TRAV. JASMIM DA BEIRADA, 71 - CAPÃO REDONDO\r\n" + 
				"CEP: 05868-580 - FONE: 5821-8950");
		System.out.println("====================================================");
		Thread.sleep(2000);
		System.out.println("****************");
		System.out.println("   JABAQUARA  ");
		System.out.println("****************");

		System.out.println("CEO JABAQUARA\r\n" + 
				"AV. ENG. ARMANDO DE ARRUDA PEREIRA, 2944 - VL. DO ENCONTRO\r\n" + 
				"CEP: 04308-001 - FONE: 5588-2366 / 5021-7744");
		System.out.println("====================================================");
		Thread.sleep(2000);
		System.out.println("**************");
		System.out.println("    SAÚDE      ");
		System.out.println("**************");
		
		System.out.println("CEO VILA MARIANA\r\n" + 
				"AV. CECI, 2235 - PLANALTO PAULISTA\r\n" + 
				"CEP: 04065-004 - FONE: 2275-1999 / 5581-2828");
		Thread.sleep(1000);
		System.out.println("\nCASO QUEIRA SABER AS DEMAIS LOCALIZAÇÕES, BASTA ACESSAR:\n"
				+ "https://www.prefeitura.sp.gov.br/cidade/secretarias/upload/arquivos/secretarias/saude/organizacao/0005/Unid_Munic_Saude_Zona.pdf");
		System.out.println("==============================================================================================================================");
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[1]);
	}else if (getReg() == 3){
		System.out.println("Aqui estão algumas unidades localizadas na Zona Leste de São Paulo");
		System.out.println("==================================================================");
		Thread.sleep(2000);
		System.out.println("************");
		System.out.println("    BRÁS  ");
		System.out.println("************");
		System.out.println("UBS BRAS - DR. MANOEL SALDIVA NETO\r\n" + 
				"R. SAMPSON, 61 - BRÁS\r\n" + 
				"CEP: 03013-040 - FONE: 2692-0788 / FAX: 2292-5453");
		System.out.println("====================================================");
		Thread.sleep(2000);
		System.out.println("***************");
		System.out.println("   ITAQUERA  ");
		System.out.println("***************");
		System.out.println("UBS ITAQUERA\r\n" + 
				"R. AMÉRICO SALVADOR NOVELLI, 265 - ITAQUERA\r\n" + 
				"CEP: 08210-090 - FONE: 2286-1422 / 2286-0015");
		System.out.println("====================================================");
		Thread.sleep(2000);
		System.out.println("*********************");
		System.out.println("   VILA PRUDENTE  ");
		System.out.println("*********************");
		System.out.println("UBS VILA PRUDENTE\r\n" + 
				"PÇA. DO CENTENARIO DE VL. PRUDENTE VEIGA CABRAL, 108 - V. PRUDENTE\r\n" + 
				"CEP: 03132-050 - FONE: 2272-5763 / 2062-3975");

		Thread.sleep(1000);
		System.out.println("\nCASO QUEIRA SABER AS DEMAIS LOCALIZAÇÕES, BASTA ACESSAR:\n"
				+ "https://www.prefeitura.sp.gov.br/cidade/secretarias/upload/arquivos/secretarias/saude/organizacao/0005/Unid_Munic_Saude_Zona.pdf");

		System.out.println("==============================================================================================================================");

		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[2]);
	}else {
		System.out.println("Aqui estão algumas unidades localizadas na Zona Oeste de São Paulo");
		System.out.println("==================================================================");
		Thread.sleep(2000);
		System.out.println("*****************");
		System.out.println("    BUTANTÃ  ");
		System.out.println("*****************");

		
		System.out.println("UBS BUTANTÃ\r\n" + 
				"R. CABRAL DE MENEZES, 51 - V. GOMES\r\n" + 
				"CEP: 05590-050 - FONE: 3726-1838 / 3726-8591 / FAX: 3726--8591");
		System.out.println("====================================================");
		Thread.sleep(2000);
		System.out.println("*******************");		
		System.out.println("    ITAIM BIBI  ");
		System.out.println("*******************");
		
		System.out.println("UBS DR. JOSÉ DE BARROS MAGALDI\r\n" + 
				"R. SALVADOR CARDOSO, 177 - ITAIM BIBI\r\n" + 
				"CEP: 04533-050 - FONE: 3168-6571 / 3167-0837");
	
		System.out.println("====================================================");
		Thread.sleep(2000);
		System.out.println("*****************");
		System.out.println("    PINHEIROS  ");
		System.out.println("*****************");
		
		System.out.println("UBS DR. MANOEL JOAQUIM PERA\r\n" + 
				"R. PURPURINA, 280 - V. MADALENA\r\n" + 
				"CEP: 05435-030 - FONE: 3032-9891 / 3813-1030 / FAX: 3813-1030\r\n");
		
		Thread.sleep(1000);
		System.out.println("\nCASO QUEIRA SABER AS DEMAIS LOCALIZAÇÕES, BASTA ACESSAR:\n"
				+ "https://www.prefeitura.sp.gov.br/cidade/secretarias/upload/arquivos/secretarias/saude/organizacao/0005/Unid_Munic_Saude_Zona.pdf");

		System.out.println("==============================================================================================================================");
		System.out.println("Se dirija a uma unidade de saúde mais próxima com o código abaixo: ");
		System.out.println(string[3]);
		
	
		}
		
	}
}
