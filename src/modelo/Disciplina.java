package modelo;

public class Disciplina {
	
	static int codigo=0;
	int cargaHoraria;
	String nomeDisc;
	String descricao;
	
	public Disciplina(int cargaHoraria, String nomeDisc, String descricao) {
		// TODO Auto-generated constructor stub
		codigo++;
		this.cargaHoraria = cargaHoraria;
		this.nomeDisc = nomeDisc;
		this.descricao = descricao;
	}
}
