package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {
	private Color color;
	private Posicion posicion;

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

		if (columnaInicial != 'c' && columnaInicial != 'f') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, columnaInicial);
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, columnaInicial);
		}

	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("ERROR COLOR NULO");
		}
		this.color = color;

	}

	public Posicion getPosicion() {
		return posicion;
	}

	public Posicion setPosicion() {
		return posicion;
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException, IllegalArgumentException {
		if (direccion == null) {
			throw new IllegalArgumentException("ERROR_DIRECCION_NULA");
		}
		if (pasos <=0) {
			throw new IllegalArgumentException("El número de pasos debe ser positivo.");
		}
		int Fila;
		
		char Columna;
		switch (direccion) {
		case ARRIBA_DERECHA:
			try {
				Fila = posicion.getFila() + pasos;
				
				Columna= (char) (posicion.getColumna() + pasos);
				posicion = new Posicion();
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
			}
			break;
		case ABAJO_DERECHA:
			try {
				Fila = posicion.getFila() + pasos;
				
				Columna= (char) (posicion.getColumna() + pasos);
				posicion = new Posicion();
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
			}
			break;
		case ABAJO_IZQUIERDA:
			try {
				Fila = posicion.getFila() + pasos;
				
				Columna= (char) (posicion.getColumna() + pasos);
				posicion = new Posicion();
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
			}
			break;
		case ARRIBA_IZQUIERDA:
			try {
				Fila = posicion.getFila() + pasos;
				
				Columna= (char) (posicion.getColumna() + pasos);
				posicion = new Posicion();
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO_NO_VALIDO + e.getMessage());
			}
			break;
		default:
			break;
		}
	}

}
