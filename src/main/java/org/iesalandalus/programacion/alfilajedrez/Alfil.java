package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {

	String color;
	int fila;
	char columna;
	public Posicion posicion;

	private static final String ERROR_MOVIMIENTO = "Movimiento no permitido: ";

	public Alfil(String color, int fila, char columna) {

		color = "NEGRO";
		fila = 8;
		columna = 'f';
	}

	public Alfil(String color) {
		if (color == "BLANCO") {
			fila = 1;
			columna = 'f';
		} else {
			fila = 8;
			columna = 'f';
		}
	}

	public Alfil(String color, char columna) {
		while (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.color = color;
		fila = 8;
		columna = 'c' | 'f';
		if (color == "BLANCO") {
			fila = 1;

		} else {
			fila = 8;
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
		if (pasos <= 0) {
			throw new IllegalArgumentException("El número de pasos debe ser mayor que cero.");
		}
		switch (direccion) {
		case ARRIBA_DERECHA:
			try {
				posicion.setFila(posicion.getColumna() + pasos);

			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		case ABAJO_DERECHA:
			try {
				posicion.setFila(posicion.getColumna() + pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		case ABAJO_IZQUIERDA:
			try {
				posicion.setFila(posicion.getColumna() + pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		case ARRIBA_IZQUIERDA:
			try {
				posicion.setFila(posicion.getColumna() + pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		default:
			break;
		}
	}

}
