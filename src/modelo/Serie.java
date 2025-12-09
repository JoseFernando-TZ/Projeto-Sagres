package modelo;

import java.util.ArrayList;

public class Serie {
	int ano;
	
	int serie;

	private ArrayList<Turma> turmas = new ArrayList<>();
	
	public Serie(int ano, int serie, ArrayList<Turma> turmas) {
		super();
		this.ano = ano;
		this.serie = serie;
		this.turmas = turmas;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}

}
