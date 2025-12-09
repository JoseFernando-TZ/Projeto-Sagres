package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Ano {
	int ano;
	private ArrayList<String> tipoPeriodo = new ArrayList<>(Arrays.asList(
			"Bimestre", "Trimestre", "Semestre"
			));
	
	public Ano() {
		
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<String> getTipoPeriodo() {
		return tipoPeriodo;
	}
}
