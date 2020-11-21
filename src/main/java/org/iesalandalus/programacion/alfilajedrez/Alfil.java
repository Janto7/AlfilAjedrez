package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	
	String color;
	int fila;
	char columna;
	

	public Alfil(){
		
	}
	public Alfil(String color,int fila, char columna) {
		
		color = "NEGRO";
		fila = 8;
		posicion = 'f';
		
		
	
	}

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		if (color==null) {
			throw new IllegalArgumentException ("ERROR: No es posible copiar una posición nula.");
		}
		this.color = color;
	}

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException ("ERROR: No es posible copiar una posición nula.");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException ("ERROR: No es posible copiar una posición nula");
		}
		this.columna = columna;
	}
	
	}
