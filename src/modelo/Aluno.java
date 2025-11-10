package modelo;

import java.util.ArrayList;
import java.util.Arrays;

import visao.PanelCadastrarAluno;

public class Aluno {

	private String nome;
	private String dataNascimento;
	private String CPF;
	private String RG;
	private String rua;
	private String numCasa;
	private String bairro;
	private String cidade;
	private String telefone;
	private String email;
	private String nomeResp;
	private int dddResp;
	private String telResp;
	private ArrayList<String> whoResp = new ArrayList<>(Arrays.asList(
			"Pai", "Mãe", "Pai adotivo", "Mãe Adotiva", "Avô", "Avó", 
			"Tio", "Tia", "Padastro", "Madastra", "Irmão", "Irmã"));
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumCasa() {
		return numCasa;
	}
	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeResp() {
		return nomeResp;
	}
	public void setNomeResp(String nomeResp) {
		this.nomeResp = nomeResp;
	}
	public int getDddResp() {
		return dddResp;
	}
	public void setDddResp(int dddResp) {
		this.dddResp = dddResp;
	}
	public String getTelResp() {
		return telResp;
	}
	public void setTelResp(String telResp) {
		this.telResp = telResp;
	}

	public ArrayList<String> getWhoResp() {
		return whoResp;
	}

	public void setWhoResp(ArrayList<String> whoResp) {
		this.whoResp = whoResp;
	}
	
}
