package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
	public Posicion (int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	
	}

	public Posicion(Posicion Posicion) {
		setFila(Posicion.getFila());
		setColumna(Posicion.getColumna());
	}
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException ("ERROR: fila no validad.");
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna < 'a' || fila > 'h') {
			throw new IllegalArgumentException ("ERROR: columna no validad.");
		}
		this.columna = columna;
	}
	
}
