package com.github.rafaelfqueiroz;

import java.util.ArrayList;
import java.util.List;

public interface BaseDeDados {
	
	public static List<Item> popular() {
		List<Item> baseDeDados = new ArrayList<>();
		baseDeDados.add(
				new Item()
				.add("Empresa", "ESIG")
				.add("Cargo", "Analista")
				.add("Nome", "Rafael")
				.add("Sobrenome", "Fernandes")
				.add("Idade", "25"));
		
		
		baseDeDados.add(new Item()
				.add("Empresa", "ESIG")
				.add("Cargo", "Analista")
				.add("Nome", "Higor")
				.add("Sobrenome", "Azevedo")
				.add("Idade", "30"));
		
		baseDeDados.add(new Item()
				.add("Empresa", "ESIG")
				.add("Cargo", "Analista")
				.add("Nome", "Jarbas")
				.add("Sobrenome", "Filho")
				.add("Idade", "25"));
		
		baseDeDados.add(new Item()
				.add("Empresa", "ESIG")
				.add("Cargo", "Pleno")
				.add("Nome", "Pedro")
				.add("Sobrenome", "Henrique")
				.add("Idade", "28"));
		
		baseDeDados.add(new Item()
				.add("Empresa", "ESIG")
				.add("Cargo", "Pleno")
				.add("Nome", "Lucas")
				.add("Sobrenome", "Farias")
				.add("Idade", "31"));
		
		return baseDeDados;
	}

}
