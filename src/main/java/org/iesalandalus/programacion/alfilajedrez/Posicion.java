package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException ("ERROR: fila no validad");
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		this.columna = columna;
	}
	
}
