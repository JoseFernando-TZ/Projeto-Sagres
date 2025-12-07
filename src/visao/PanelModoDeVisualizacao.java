package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelModoDeVisualizacao extends JPanel{
	private JButton btnProfessor;
	private JButton btnAluno;
	private JLabel lblModo;
	private JButton btnDiretor;
	private JLabel lblNewLabel;
	private JLabel lblFeitoPorJos;
	
	public PanelModoDeVisualizacao(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnProfessor());
		add(getBtnAluno());
		add(getLblModo());
		add(getBtnDiretor());
		add(getLblNewLabel());
		add(getLblFeitoPorJos());
		
		
	}
	public JButton getBtnProfessor() {
		if (btnProfessor == null) {
			btnProfessor = new JButton("professor");
			btnProfessor.setBounds(328, 199, 139, 30);
		}
		return btnProfessor;
	}
	public JButton getBtnAluno() {
		if (btnAluno == null) {
			btnAluno = new JButton("Aluno");
			btnAluno.setBounds(328, 158, 139, 30);
		}
		return btnAluno;
	}
	public JLabel getLblModo() {
		if (lblModo == null) {
			lblModo = new JLabel("Modo de visualização: ");
			lblModo.setBounds(328, 136, 150, 12);
		}
		return lblModo;
	}
	public JButton getBtnDiretor() {
		if (btnDiretor == null) {
			btnDiretor = new JButton("diretor");
			btnDiretor.setBounds(328, 240, 139, 30);
		}
		return btnDiretor;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bem vindo ao protótipo do Sagres!");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(293, 93, 202, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblFeitoPorJos() {
		if (lblFeitoPorJos == null) {
			lblFeitoPorJos = new JLabel("Feito Por: José Fernando, Renan Alves e João Pitombo");
			lblFeitoPorJos.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblFeitoPorJos.setBounds(247, 444, 319, 14);
		}
		return lblFeitoPorJos;
	}
}
