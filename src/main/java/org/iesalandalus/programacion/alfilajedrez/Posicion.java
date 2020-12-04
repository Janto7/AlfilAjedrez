package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	private int fila;
	private char columna;
	private static int MIN_FILA = 1;
	private static int MAX_FILA = 8;
	private static char MIN_COLUMNA = 'a';
	private static char MAX_COLUMNA = 'h';

	public Posicion() {
		fila = MIN_FILA;
		columna = MIN_COLUMNA;
	}

	public Posicion(int Fila, char Columna) {
		setFila(Fila);
		setColumna(Columna);
	}

	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		this.fila = posicion.getFila();
		this.columna = posicion.getColumna();
	}

	public int getFila( ) {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		} else {
			this.fila = fila;
			if (fila < MIN_FILA || fila > MAX_FILA) {
				throw new IllegalArgumentException("ERROR: Fila no válida.");
			} else {
				this.fila = fila;
			}
		}
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		} else {
			this.columna = columna;

			if (columna < MIN_COLUMNA || columna > MAX_COLUMNA) {
				throw new IllegalArgumentException("ERROR: columna no válida.");
			} else {
				this.columna = columna;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna + "";
	}

}
