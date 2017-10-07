package com.github.rafaelfqueiroz;

import java.util.List;
import java.util.stream.Collectors;

public class View {
	
	private static String[] agrupadores = new String[10];

	public static void main(String[] args) {
		Filtro[] filtrosEscolhidos = new Filtro[] {
										new Filtro("Empresa", TipoFiltro.AGRUPADOR),
										new Filtro("Cargo", TipoFiltro.AGRUPADOR),
										new Filtro("Nome", TipoFiltro.TEXTO),
										new Filtro("Sobrenome", TipoFiltro.TEXTO),
										new Filtro("Idade", TipoFiltro.TEXTO)
									};
		
		List<Item> itensOrdenados = BaseDeDados.popular().stream().sorted(new ItemComparator()).collect(Collectors.toList());
		
		//Imprime as colunas não agrupadoras
		for (Filtro filtro : filtrosEscolhidos) {
			if (!filtro.isAgrupador()) {
				System.out.print("\t\t |" + filtro.getChave() + "|\t\t");
			}
		}
		
		System.out.println();
		
		for (Item item : itensOrdenados) {
			for (int i = 0; i < filtrosEscolhidos.length; i++) {
				if (filtrosEscolhidos[i].isAgrupador()) {
					boolean isAdicionado = adicionaAgrupador(i, item.getField(filtrosEscolhidos[i].getChave()));
					if (isAdicionado) {
						System.out.println("\t\t\t\t\t\t |" + item.getField(filtrosEscolhidos[i].getChave()) + "| \t\t");
					}
				} else {
					System.out.print("\t\t" + item.getField(filtrosEscolhidos[i].getChave()) + "\t\t");
				}
			}
			System.out.println();
		}
	}
	
	private static boolean adicionaAgrupador(int indice, String agrupador) {
		if ((agrupadores[indice] == null) || 
				(agrupadores[indice] != null && !agrupadores[indice].equals(agrupador))) {
			agrupadores[indice] = agrupador;
			return true;
		}
		return false;
	}

}
