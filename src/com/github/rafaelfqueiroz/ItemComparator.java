package com.github.rafaelfqueiroz;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		int c = o1.getField("Empresa").compareTo(o2.getField("Empresa"));
		if (c == 0) {
			c = o1.getField("Cargo").compareTo(o2.getField("Cargo"));
		}
		return c;
	}

}
