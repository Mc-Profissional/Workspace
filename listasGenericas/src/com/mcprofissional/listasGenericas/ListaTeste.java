package com.mcprofissional.listasGenericas;

public class ListaTeste {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<> ();
		
		lista.adiciona("A");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona(1, "B");
		
		System.out.println(lista);
		
	}

}
