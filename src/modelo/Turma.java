package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
	String letra;
	

	int serie;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	public Turma(String letra, int serie, ArrayList<Aluno> alunos) {
		super();
		this.letra = letra;
		this.serie = serie;
		this.alunos = alunos;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

}
