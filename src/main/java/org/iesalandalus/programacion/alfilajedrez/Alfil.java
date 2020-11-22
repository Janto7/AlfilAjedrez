package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {
	private Color color;
	private Posicion posicion;
	private static final String ERROR_MOVIMIENTO = "Movimiento no permitido: ";

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

		if (columnaInicial != 'c' || columnaInicial != 'f') {
			throw new IllegalArgumentException("ERROR:La columna tiene que ser valida.");
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
			throw new IllegalArgumentException("ERROR:El color no puede ser nulo.");
		}
		this.color = color;

	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new IllegalArgumentException("ERROR:La posición no puede ser nula.");
		}
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
