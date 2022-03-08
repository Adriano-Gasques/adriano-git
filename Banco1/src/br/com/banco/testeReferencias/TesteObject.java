package br.com.banco.testeReferencias;

import br.com.banco.modelos.ContaCorrente;
import br.com.banco.modelos.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		
		System.out.println(cc);
		System.out.println(cp);
	}

}
