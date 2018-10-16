package io;

public class Reina implements Comparable <Reina> {

	int numero;
	int x;
	int y;
	int cantConflictos;
	Reina[] conflictos;
	
	public Reina() {
		this.numero = 0;
		this.x = 0;
		this.y = 0;
		this.cantConflictos = 0;
		this.conflictos = null;
	}
	
	public Reina(int numero, int y, int x) {
		this.numero = numero;
		this.x = x;
		this.y = y;
		this.cantConflictos = 0;
		this.conflictos = null;
	}
	
	public Reina(Reina otra) {
		this.numero = otra.numero;
		this.x = otra.x;
		this.y = otra.y;
		this.cantConflictos = 0;
		this.conflictos = null;
	}

	@Override
	public int compareTo(Reina arg0) {
		return Integer.compare(this.numero, arg0.numero);
	}	
	
}
