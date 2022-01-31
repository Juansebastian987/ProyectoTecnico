package com.proyecto.utils;

public class EstadiaUtils {

	static final int SEMANA = 50000;
	static final int FDS_FESTIVO = 80000;
	static final int TODO_INCLUDO = 90000;
	
	public static int getSemana() {
		return SEMANA;
	}
	public static int getFdsFestivo() {
		return FDS_FESTIVO;
	}
	public static int getTodoIncludo(int estadia) {
		return TODO_INCLUDO + estadia;
	}
	
}
