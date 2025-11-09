package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarProfessor extends JPanel {

	private JTextField textFieldNomeAluno;
	private JTextField textFieldCursoAluno;
	private JTextField textFieldMatriculaAluno;
	private JButton buttonCadastrar;
	
	public PanelCadastrarProfessor() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getTextFieldNomeAluno());
		this.add(getTextFieldCursoAluno());
		this.add(getTextFieldMatriculaAluno());
		this.add(getButtonCadastrar());
		
		JLabel lblNomeProfessor = new JLabel("Nome: ");
		lblNomeProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeProfessor.setBounds(80, 20, 225, 12);
		add(lblNomeProfessor);
	}
	
	public JTextField getTextFieldNomeAluno() {
		if(textFieldNomeAluno == null) {
			textFieldNomeAluno = new JTextField();
			textFieldNomeAluno.setBounds(50, 50, 200, 30);
		}	
		return textFieldNomeAluno;
	}
	
	public JTextField getTextFieldCursoAluno() {
		if(textFieldCursoAluno == null) {
			textFieldCursoAluno = new JTextField();
			textFieldCursoAluno.setBounds(50, 100, 200, 30);
		}	
		return textFieldCursoAluno;
	}
	
	public JTextField getTextFieldMatriculaAluno() {
		if(textFieldMatriculaAluno == null) {
			textFieldMatriculaAluno = new JTextField();
			textFieldMatriculaAluno.setBounds(50, 150, 200, 30);
		}	
		return textFieldMatriculaAluno;
	}
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(50, 200, 200, 30);
		}	
		return buttonCadastrar;
	}
	
}
