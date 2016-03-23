package model;

import java.util.*;

public class Rubrica {
	private LinkedList<Voce> rubrica=new LinkedList<Voce>();
	
	public void aggiungi(Voce v){
		rubrica.add(v);
	}
	public Voce cerca(String nome){
		for(Voce v:rubrica)
			if(v.getNome().equals(nome)) return v;
		return null;
	}
	public LinkedList<Voce> getRubrica() {
		return rubrica;
	}
	public LinkedList<String> getNomi() {
		LinkedList<String> nomi=new LinkedList<String>();
		for(Voce v:rubrica)
			nomi.add(v.getNome());
		return nomi;
	}
	

}
