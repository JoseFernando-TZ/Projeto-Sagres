package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Frame;
import visao.PanelCadastrarAluno;
import visao.PanelCadastrarDisciplina;
import visao.PanelCadastrarProfessor;
import visao.PanelConsultarAluno;
import visao.PanelConsultarProfessor;
import visao.PanelModoDeVisualizacao;

public class ControladorFrame implements ActionListener{

	/**
	 * @wbp.parser.entryPoint
	 */
	
	Frame frame;
	PanelCadastrarAluno panelCadastrarAluno;
	PanelCadastrarProfessor panelCadastrarProfessor;
	PanelCadastrarDisciplina panelCadastrarDisciplina;
	PanelConsultarAluno panelConsultarAluno;
	PanelConsultarProfessor panelConsultarProfessor;
	PanelModoDeVisualizacao panelModoDeVisualizacao;
	ControladorCadastrarAluno controladorCadastrarAluno;
	ControladorCadastrarProfessor controladorCadastrarProfessor;
	
	
	public ControladorFrame() {	
		panelModoDeVisualizacao = new PanelModoDeVisualizacao();
		panelCadastrarProfessor = new PanelCadastrarProfessor();
		panelCadastrarAluno = new PanelCadastrarAluno();
		panelCadastrarDisciplina = new PanelCadastrarDisciplina();
		panelConsultarAluno = new PanelConsultarAluno();
		panelConsultarProfessor = new PanelConsultarProfessor();
		controladorCadastrarAluno = new ControladorCadastrarAluno(panelCadastrarAluno);
		controladorCadastrarProfessor = new ControladorCadastrarProfessor(panelCadastrarProfessor);
		frame = new Frame();
		frame.setContentPane(panelModoDeVisualizacao);
		frame.repaint();
		frame.validate();
		addEventos();
	}
	
	private void addEventos() {
		frame.getItemCadastroAluno().addActionListener(this);
		frame.getItemCadastroProfessor().addActionListener(this);
		frame.getItemCadastroDisciplina().addActionListener(this);
		frame.getItemConsultarAluno().addActionListener(this);
		frame.getItemConsultarProfessor().addActionListener(this);
	}

	public static void main(String[] args) {
		new ControladorFrame();
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frame.getItemCadastroProfessor()) {
			frame.setContentPane(panelCadastrarProfessor);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == frame.getItemCadastroAluno()) {
			frame.setContentPane(panelCadastrarAluno);
			frame.repaint();
			frame.validate();
		}
		if(e.getSource() == frame.getItemCadastroDisciplina()) {
			frame.setContentPane(panelCadastrarDisciplina);
			frame.repaint();
			frame.validate();
		}
		if(e.getSource() == frame.getItemConsultarAluno()) {
			frame.setContentPane(panelConsultarAluno);
			frame.repaint();
			frame.validate();
		}
		if(e.getSource() == frame.getItemConsultarProfessor()) {
			frame.setContentPane(panelConsultarProfessor);
			frame.repaint();
			frame.validate();
		}
		
		
		
		
	}
	
	

}
