package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Frame;
import visao.PanelCadastrarAluno;
import visao.PanelCadastrarAno;
import visao.PanelCadastrarDisciplina;
import visao.PanelCadastrarProfessor;
import visao.PanelCadastrarSerie;
import visao.PanelCadastrarTurma;
import visao.PanelConsultarAluno;
import visao.PanelConsultarProfessor;
import visao.PanelInfoAcademicoAluno;
import visao.PanelInfoPessoalAluno;
import visao.PanelModoDeVisualizacao;

public class ControladorFrame implements ActionListener{

	/**
	 * @wbp.parser.entryPoint
	 */
	
	Frame frame;
	
	PanelCadastrarAluno panelCadastrarAluno;
	PanelCadastrarProfessor panelCadastrarProfessor;
	PanelCadastrarDisciplina panelCadastrarDisciplina;
	PanelCadastrarAno panelCadastrarAno;
	PanelCadastrarSerie panelCadastrarSerie;
	PanelCadastrarTurma panelCadastrarTurma;
	
	PanelConsultarAluno panelConsultarAluno;
	PanelConsultarProfessor panelConsultarProfessor;
	
	PanelInfoPessoalAluno panelInfoPessoalAluno;
	PanelInfoAcademicoAluno panelInfoAcademicoAluno;
	
	PanelModoDeVisualizacao panelModoDeVisualizacao;
	
	ControladorCadastrarAluno controladorCadastrarAluno;
	ControladorCadastrarProfessor controladorCadastrarProfessor;
	
	
	public ControladorFrame() {	
		panelModoDeVisualizacao = new PanelModoDeVisualizacao();
		panelCadastrarProfessor = new PanelCadastrarProfessor();
		panelCadastrarAluno = new PanelCadastrarAluno();
		panelCadastrarAno = new PanelCadastrarAno();
		panelCadastrarSerie = new PanelCadastrarSerie();
		panelCadastrarTurma = new PanelCadastrarTurma();
		
		panelInfoPessoalAluno = new PanelInfoPessoalAluno();
		panelInfoAcademicoAluno = new PanelInfoAcademicoAluno();
		
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
		frame.getItemCadastroAno().addActionListener(this);
		frame.getItemCadastroSerie().addActionListener(this);
		frame.getItemCadastroTurma().addActionListener(this);
		
		frame.getItemConsultarAluno().addActionListener(this);
		frame.getItemConsultarProfessor().addActionListener(this);
		panelConsultarAluno.getBtnVerInfoPessoal().addActionListener(this);
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
		
		if(e.getSource() == frame.getItemCadastroAno()) {
			frame.setContentPane(panelCadastrarAno);
			frame.repaint();
			frame.validate();
		}
		if(e.getSource() == frame.getItemCadastroSerie()) {
			frame.setContentPane(panelCadastrarSerie);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == frame.getItemCadastroTurma()) {
			frame.setContentPane(panelCadastrarTurma);
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
		
		if(e.getSource() == panelConsultarAluno.getBtnVerInfoPessoal()) {
			frame.setContentPane(panelInfoPessoalAluno);
			frame.repaint();
			frame.validate();
		}
		
		
		
		
	}
	
	

}
