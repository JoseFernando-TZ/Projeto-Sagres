package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Frame;
import visao.PanelBoasVindas;
import visao.PanelCadastrarAluno;
import visao.PanelCadastrarAno;
import visao.PanelCadastrarDisciplina;
import visao.PanelCadastrarProfessor;
import visao.PanelCadastrarSerie;
import visao.PanelCadastrarTurma;
import visao.PanelConsultarAluno;
import visao.PanelConsultarProfessor;
import visao.PanelContas;
import visao.PanelContato;
import visao.PanelDesempenhoAluno;
import visao.PanelDespesas;
import visao.PanelGerarBoletim;
import visao.PanelInfoAcademicoAluno;
import visao.PanelInfoPessoalAluno;
import visao.PanelMensalidades;
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
	PanelDesempenhoAluno panelDesempenhoAluno;
	
	PanelModoDeVisualizacao panelModoDeVisualizacao;
	PanelBoasVindas panelBoasVindas;
	PanelGerarBoletim panelGerarBoletim;
	PanelMensalidades panelMensalidades;
	PanelContato panelContato;
	PanelDespesas panelDespesas;
	PanelContas panelContas;
	
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
		panelDesempenhoAluno = new PanelDesempenhoAluno();
		
		panelGerarBoletim = new PanelGerarBoletim();
		panelMensalidades = new PanelMensalidades();
		panelBoasVindas = new PanelBoasVindas();
		panelContato = new PanelContato();
		panelDespesas = new PanelDespesas();
		panelContas = new PanelContas();
		
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
		frame.getItemMensalidades().addActionListener(this);
		frame.getItemContato().addActionListener(this);
		frame.getItemReceitasDespesas().addActionListener(this);
		frame.getItemContas().addActionListener(this);
		
		
		panelConsultarAluno.getBtnVerInfoPessoal().addActionListener(this);
		panelConsultarAluno.getBtnVerInfoAcademica().addActionListener(this);
		panelConsultarAluno.getBtnVerDesempenho().addActionListener(this);
		panelModoDeVisualizacao.getBtnDiretor().addActionListener(this);
		
		panelCadastrarAno.loadComboBox();
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
		if(e.getSource() == panelConsultarAluno.getBtnVerInfoAcademica()) {
			frame.setContentPane(panelInfoAcademicoAluno);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == panelConsultarAluno.getBtnVerDesempenho()) {
			frame.setContentPane(panelDesempenhoAluno);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == frame.getItemMensalidades()) {
			frame.setContentPane(panelMensalidades);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == panelModoDeVisualizacao.getBtnDiretor()) {
			frame.adicionaMenuDiretor();
			frame.setContentPane(panelBoasVindas);
			frame.repaint();
			frame.validate();
			
		}
		
		if(e.getSource() == frame.getItemContato()) {
			
			frame.setContentPane(panelContato);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == frame.getItemReceitasDespesas()) {
			
			frame.setContentPane(panelDespesas);
			frame.repaint();
			frame.validate();
		}
		
		if(e.getSource() == frame.getItemContas()) {
			
			frame.setContentPane(panelContas);
			frame.repaint();
			frame.validate();
		}
	}



}
