package it.polito.tdp.alien.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Dizionario {

	List<Parola>parole;

	public Dizionario() {
		this.parole = new LinkedList<Parola>();
	}
	
	
	public void add(String p, String t) {
		
		 boolean pp = Pattern.matches(("[a-zA-Z]+"),p);//il + dietro indica una o più lettere della parentesi
		 boolean pt = Pattern.matches(("[a-zA-Z]+"),t);
		 
		 if(pp&&pt) {
			
				 for(Parola pa:parole) {
					 
					if( (pa.nomeParola.compareTo(p)==0)) {
						 pa.traduzioni.add(t);
						 return;
					}
				 }
				 
				  Parola ppp=new Parola(p);
				  parole.add(ppp);
				  ppp.traduzioni.add(t);
				
				 
			 }
			 
			  
			 
			 
		 
	}
		 public List<String> translate (String p) {
			 
			 for(Parola pp:parole) {
				 if(pp.nomeParola.equals(p)) {
					 return pp.traduzioni;
				 }
			 }
		
			 return null;
	}
	
	
	
	
}
