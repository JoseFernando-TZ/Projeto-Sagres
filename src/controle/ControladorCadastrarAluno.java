package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Aluno;
import visao.PanelCadastrarAluno;

public class ControladorCadastrarAluno implements ActionListener {
	
	PanelCadastrarAluno panelCadastrarAluno;
	private Aluno al = new Aluno();
	private ArrayList<Aluno> listaAlunos = new ArrayList<>();

	public ControladorCadastrarAluno(PanelCadastrarAluno panelCadastrarAluno) {
		// TODO Auto-generated constructor stub
		this.panelCadastrarAluno = panelCadastrarAluno;
		loadComboBox();
		addEventos();
	}
	private void addEventos() {
		panelCadastrarAluno.getBtnLimparAl().addActionListener(this);
		panelCadastrarAluno.getButtonCadastrar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarAluno.getBtnLimparAl()) {
			panelCadastrarAluno.getTextFieldNomeAluno().setText("");
			panelCadastrarAluno.getTextFieldCPF().setText("");
			panelCadastrarAluno.getTextFieldRG().setText("");
			panelCadastrarAluno.getTextFieldRua().setText("");
			panelCadastrarAluno.getTextFieldBairro().setText("");
			panelCadastrarAluno.getTextFieldNumCasa().setText("");
			panelCadastrarAluno.getTextFieldCidade().setText("");
			panelCadastrarAluno.getTextFieldEmail().setText("");
			panelCadastrarAluno.getTextFieldTelefone().setText("");
			panelCadastrarAluno.getTextFieldDDD().setText("");
		}
		if(e.getSource() == panelCadastrarAluno.getButtonCadastrar()) {
			
		}
	}
	public void loadComboBox() {
		for(String resp : al.getWhoResp()) {
			panelCadastrarAluno.getComboBox().addItem(resp);
		}
	}
	
}
