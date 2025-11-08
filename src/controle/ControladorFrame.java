package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Frame;
import visao.PanelCadastrarAluno;
import visao.PanelCadastrarProfessor;

public class ControladorFrame implements ActionListener{

	
	
	Frame frame;
	PanelCadastrarAluno panelCadastrarAluno;
	PanelCadastrarProfessor panelCadastrarProfessor;
	ControladorCadastrarAluno controladorCadastrarAluno;
	ControladorCadastrarProfessor controladorCadastrarProfessor;
	
	public ControladorFrame() {	
		frame = new Frame();
		frame.repaint();
		frame.validate();
		addEventos();
	}
	
	private void addEventos() {
		frame.getItemCadastroAluno().addActionListener(this);
		frame.getItemCadastroProfessor().addActionListener(this);
		
	}

	public static void main(String[] args) {
		new ControladorFrame();
		
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frame.getItemCadastroProfessor()) {
			panelCadastrarProfessor = new PanelCadastrarProfessor();
			controladorCadastrarProfessor = new ControladorCadastrarProfessor(panelCadastrarProfessor);
			frame.setContentPane(panelCadastrarProfessor);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == frame.getItemCadastroAluno()) {
			panelCadastrarAluno = new PanelCadastrarAluno();
			controladorCadastrarAluno = new ControladorCadastrarAluno(panelCadastrarAluno);
			frame.setContentPane(panelCadastrarAluno);
			frame.repaint();
			frame.validate();
		}
		
	}
	
	

}
