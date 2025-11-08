package visao;

import java.awt.Color;

import javax.swing.JButton;
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
		this.setBackground(Color.red);
		this.add(getTextFieldNomeAluno());
		this.add(getTextFieldCursoAluno());
		this.add(getTextFieldMatriculaAluno());
		this.add(getButtonCadastrar());
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
