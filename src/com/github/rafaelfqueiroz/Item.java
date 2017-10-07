package com.github.rafaelfqueiroz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Item {
	
	private Map<String, String> data = new HashMap<>();

	public String getField(String chave) {
		return data.get(chave);
	}
	
	public Item add(String chave, String valor) {
		data.put(chave, valor);
		return this;
	}
	
	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public Set<String> getFields() {
		return data.keySet();
	}
	
}
