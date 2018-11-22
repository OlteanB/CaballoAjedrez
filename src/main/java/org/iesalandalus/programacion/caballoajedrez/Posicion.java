package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	private int fila;
	private char columna;

	/**
	 * Constructor por defecto
	 */
	public Posicion() {
		fila = 1;
		columna = 'a';
	}

	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new IllegalArgumentException("ERROR: No es posible copiar una posicion nula.");
		}
		this.fila = posicion.getFila();
		this.columna = posicion.getColumna();
	}

	/**
	 * Costructor que recibe dos parametros y controla que los valores introducidos
	 * son correctos
	 * 
	 * @param fila
	 * @param columna
	 * @throws IllegalAccessException
	 */
	public Posicion(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
		if (fila > 0 && fila < 9) {
			this.fila = fila;
		} else {
			this.fila = 1;
			throw new IllegalArgumentException("ERROR: Columna no valida.");
		}
		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			this.columna = 'a';
			throw new IllegalArgumentException("ERROR: Columna no valida.");
		}

	}

	/**
	 * 
	 * @return fila
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * Setter que recibe y controla los errores de la fila
	 * 
	 * @param fila
	 * @throws IllegalAccessException
	 */
	public void setFila(int fila) {
		this.fila = fila;

		if (fila > 0 && fila < 9) {
			this.fila = fila;
		} else {
			this.fila = 1;
			throw new IllegalArgumentException("ERROR: Fila no valida.");
		}

	}

	/**
	 * 
	 * @return columa
	 */
	public char getColumna() {
		return columna;
	}

	/**
	 * Setter que recibe y controla los errores de la columna
	 * 
	 * @param columna
	 * @throws IllegalAccessException
	 */
	public void setColumna(char columna) {
		this.columna = columna;
		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			this.columna = 'a';
			throw new IllegalArgumentException("ERROR: Columna no valida.");

		}

	}

}
