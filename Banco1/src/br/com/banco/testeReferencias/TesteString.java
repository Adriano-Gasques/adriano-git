package br.com.banco.testeReferencias;

public class TesteString {

	public static void main(String[] args) {

		String vazio = "     Adriano    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Adr"));
		System.out.println(outroVazio);
		
		String nome = "Adriano";
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

	}

}
