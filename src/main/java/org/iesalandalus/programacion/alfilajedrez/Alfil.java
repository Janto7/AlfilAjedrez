package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {
	private Color color;
	private Posicion posicion;
	private static final String ERROR_MOVIMIENTO = "ERROR: Movimiento no válido (se sale del tablero).";
	private static final String ERROR_MOVIMIENTO_NO_VALIDO = "ERROR: Movimiento no válido (se sale del tablero).";
	public Alfil() {

		color = Color.NEGRO;
		posicion = new Posicion(8, 'f');

	}

	public Alfil(Color color) {
		setColor(color);
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'f');
		}
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'f');
		}
	}

	public Alfil(Color color, char columnaInicial) {
		setColor(color);

		if (color==Color.NEGRO) {
			posicion = new Posicion(8, columnaInicial);
		
		}
		 else if (color==Color.BLANCO) {
			posicion = new Posicion(1, columnaInicial);
		 }
		
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("ERROR:El color no puede ser nulo.");
		}
		this.color = color;

	}

	public Posicion getPosicion() {
		return posicion;
	}

	public Posicion setPosicion() {
		return posicion;
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
		if (pasos <= 0) {
			throw new IllegalArgumentException("El número de pasos debe ser mayor que cero.");
		}
		
		int fila;
		char columna;
		switch (direccion) {
			case ARRIBA_DERECHA:
				
				try {
				fila = posicion.getFila() + pasos;
				columna = (char) (posicion.getColumna() + pasos);
				setPosicion();
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
				}
				break;
			case ABAJO_IZQUIERDA:
				try {
					fila = posicion.getFila() + pasos;
					columna = (char) (posicion.getColumna() + pasos);
					setPosicion();
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
				}
				break;
			case ARRIBA_IZQUIERDA:
				try {
					fila = posicion.getFila() + pasos;
					columna = (char) (posicion.getColumna() + pasos);
					setPosicion();
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
				}
				break;
			case ABAJO_DERECHA:
				try {
					fila = posicion.getFila() + pasos;
					columna = (char) (posicion.getColumna() + pasos);
					setPosicion();
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
				}
				break;
			default:
				break;
		}
	
	}
	
}
