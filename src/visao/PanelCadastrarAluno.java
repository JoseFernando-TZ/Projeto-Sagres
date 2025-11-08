package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class PanelCadastrarAluno extends JPanel {

	private JTextField textFieldNomeAluno;
	private JTextField textFieldCPF;
	private JTextField textFieldRG;
	private JButton buttonCadastrar;
	
	public PanelCadastrarAluno() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(255, 255, 255));
		this.add(getTextFieldNomeAluno());
		this.add(getTextFieldCPF());
		this.add(getTextFieldRG());
		this.add(getButtonCadastrar());
		
		JLabel lblNomeAluno = new JLabel("Nome:");
		lblNomeAluno.setBounds(51, 57, 44, 12);
		add(lblNomeAluno);
		
		JLabel lblInfo = new JLabel("Preencha com Informações do aluno:");
		lblInfo.setBounds(80, 20, 225, 12);
		add(lblInfo);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(51, 107, 44, 12);
		add(lblCPF);
		
		JLabel lblRG = new JLabel("RG:");
		lblRG.setBounds(51, 157, 44, 12);
		add(lblRG);
	}
	
	public JTextField getTextFieldNomeAluno() {
		if(textFieldNomeAluno == null) {
			textFieldNomeAluno = new JTextField();
			textFieldNomeAluno.setBounds(105, 49, 200, 30);
		}	
		return textFieldNomeAluno;
	}
	
	public JTextField getTextFieldCPF() {
		if(textFieldCPF == null) {
			textFieldCPF = new JTextField();
			textFieldCPF.setBounds(105, 99, 200, 30);
		}	
		return textFieldCPF;
	}
	
	public JTextField getTextFieldRG() {
		if(textFieldRG == null) {
			textFieldRG = new JTextField();
			textFieldRG.setBounds(105, 149, 200, 30);
		}	
		return textFieldRG;
	}
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(105, 230, 200, 30);
		}	
		return buttonCadastrar;
	}
}
