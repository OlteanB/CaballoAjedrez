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
    
    /**
     * Costructor que recibe dos parametros y controla que los valores introducidos son correctos
     * @param fila
     * @param columna 
     * @throws IllegalAccessException 
     */
    public Posicion(int fila, char columna) throws IllegalAccessException {
        this.fila = fila;
        this.columna = columna;
        if (fila > 0 && fila < 9) {
            this.fila = fila;
        } else {
            this.fila = 1;
            throw new IllegalAccessException("ERROR: Fila no valida.");
        }
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
            this.columna = 'a';
            throw new IllegalAccessException("ERROR: Columna no valida.");
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
     * @param fila 
     * @throws IllegalAccessException 
     */
    public void setFila(int fila) throws IllegalAccessException {
        this.fila = fila;
        if (fila > 0 && fila < 9) {
            this.fila = fila;
        } else {
        	this.fila=1;
            throw new IllegalAccessException("ERROR: Fila no valida.");
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
     * @param columna 
     * @throws IllegalAccessException 
     */
    public void setColumna(char columna) throws IllegalAccessException {
        this.columna = columna;
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
        	this.columna='a';
            throw new IllegalAccessException("ERROR: Columna no valida.");
            
        }
    }
}
