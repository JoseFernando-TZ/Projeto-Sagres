package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Aluno;
import visao.PanelCadastrarProfessor;

public class ControladorCadastrarProfessor implements ActionListener{

	PanelCadastrarProfessor panelCadastrarProfessor;
	
	public ControladorCadastrarProfessor(PanelCadastrarProfessor panelCadastrarProfessor) {
		this.panelCadastrarProfessor =  panelCadastrarProfessor;
		addEventos();
	}

	private void addEventos() {
		panelCadastrarProfessor.getButtonCadastrar().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelCadastrarProfessor.getButtonCadastrar()) {
			cadastrarProfessor();
		}	
		
	}

	private void cadastrarProfessor() {
		
	}

	
	
}
