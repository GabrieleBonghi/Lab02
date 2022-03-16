package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class Parola {

	String nomeParola;
	List<String> traduzioni= new LinkedList<String>();
	
	public Parola(String nomeParola) {
		super();
		this.nomeParola = nomeParola;
	}

	public String getNomeParola() {
		return nomeParola;
	}

	public void setNomeParola(String nomeParola) {
		this.nomeParola = nomeParola;
	}
	
	
	
}
