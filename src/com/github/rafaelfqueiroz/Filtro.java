package com.github.rafaelfqueiroz;

public class Filtro {

	private String chave;
	private TipoFiltro tipo;
	
	public Filtro(String chave, TipoFiltro tipo) {
		this.chave = chave;
		this.tipo = tipo;
	}

	public String getChave() {
		return chave;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public TipoFiltro getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoFiltro tipo) {
		this.tipo = tipo;
	}
	
	public boolean isAgrupador() {
		return tipo.equals(TipoFiltro.AGRUPADOR);
	}
	
}
