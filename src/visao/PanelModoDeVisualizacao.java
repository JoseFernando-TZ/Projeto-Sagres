package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelModoDeVisualizacao extends JPanel{
	private JButton btnProfessor;
	private JButton btnAluno;
	private JLabel lblModo;
	private JButton btnDiretor;
	
	public PanelModoDeVisualizacao(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnProfessor());
		add(getBtnAluno());
		add(getLblModo());
		add(getBtnDiretor());
		
		
	}
	public JButton getBtnProfessor() {
		if (btnProfessor == null) {
			btnProfessor = new JButton("professor");
			btnProfessor.setBounds(328, 160, 139, 20);
		}
		return btnProfessor;
	}
	public JButton getBtnAluno() {
		if (btnAluno == null) {
			btnAluno = new JButton("Aluno");
			btnAluno.setBounds(328, 241, 139, 20);
		}
		return btnAluno;
	}
	public JLabel getLblModo() {
		if (lblModo == null) {
			lblModo = new JLabel("Modo de visualização");
			lblModo.setBounds(348, 96, 97, 12);
		}
		return lblModo;
	}
	public JButton getBtnDiretor() {
		if (btnDiretor == null) {
			btnDiretor = new JButton("diretor");
			btnDiretor.setBounds(328, 316, 139, 20);
		}
		return btnDiretor;
	}
}
