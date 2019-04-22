package aplicacao;

import gof.Arquivo;
import gof.SuiteFactory;
import gof.Editor;
import gof.ISuite;
import gof.Suite;

public class Cliente {
	
	public static void main(String[] args) {
		
		ISuite microsoft = SuiteFactory.getInstance().getFactory(Suite.MICROSOFT);
		microsoft.abrir();
		Editor word = microsoft.createEditorTexto();
		word.abrir();
		Arquivo arquivo = word.criar("Microssoft", "/IFPB").proprietario("Sancho").autorizacao(true).create();
		Arquivo arquivo2 = arquivo.clone();
		arquivo2.setProprietario("Panca");
		arquivo2.setAutorizacao(false);
		arquivo2.setNome("Muitos processos");
		System.out.println("Arquivo 1 : "+arquivo);
		System.out.println("Arquivo 2 : "+arquivo2);
		word.fechar();
		microsoft.fechar();
		
		
		ISuite libbre = SuiteFactory.getInstance().getFactory(Suite.LIBREOFFICE);
		libbre.abrir();
		Editor writer = libbre.createEditorTexto();
		writer.abrir();
		Arquivo a1 = writer.criar("Tecnicologica","/IFPB").proprietario("Pahgod").autorizacao(true).create();
		Arquivo a2 = a1.clone();
		a2.setNome("Faz o simples");
		a2.setProprietario("Talesman");
		a2.setAutorizacao(false);
		System.out.println(a1);
		System.out.println(a2);
		writer.fechar();
		libbre.fechar();
		
	}

}