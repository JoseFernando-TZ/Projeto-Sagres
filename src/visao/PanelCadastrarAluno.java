package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class PanelCadastrarAluno extends JPanel {

	private JTextField textFieldNomeAluno;
	private JTextField textFieldCPF;
	private JTextField textFieldRG;
	private JButton buttonCadastrar;
	private JLabel lblEndereco;
	private JTextField textFieldRua;
	private JTextField textFieldNumCasa;
	private JTextField textFieldBairro;
	private JTextField textFieldCidade;
	private JTextField textFieldEmail;
	private JTextField textField;
	
	public PanelCadastrarAluno() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getTextFieldNomeAluno());
		this.add(getTextFieldCPF());
		this.add(getTextFieldRG());
		this.add(getButtonCadastrar());
		
		JLabel lblInfo = new JLabel("Preencha com informações do aluno:");
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInfo.setBounds(80, 20, 225, 12);
		add(lblInfo);
		
		JLabel lblNomeAluno = new JLabel("Nome:");
		lblNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeAluno.setBounds(51, 66, 55, 12);
		add(lblNomeAluno);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF.setBounds(315, 66, 28, 12);
		add(lblCPF);
		
		JLabel lblRG = new JLabel("RG:");
		lblRG.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRG.setBounds(51, 103, 28, 12);
		add(lblRG);
		add(getLblEndereco());
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRua.setBounds(51, 164, 33, 12);
		add(lblRua);
		
		JLabel lblN = new JLabel("N°:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblN.setBounds(315, 164, 28, 12);
		add(lblN);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(51, 205, 47, 12);
		add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(315, 205, 44, 12);
		add(lblCidade);
		
		textFieldRua = new JTextField();
		textFieldRua.setBounds(105, 157, 200, 30);
		add(textFieldRua);
		
		textFieldNumCasa = new JTextField();
		textFieldNumCasa.setBounds(373, 157, 62, 30);
		add(textFieldNumCasa);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setBounds(105, 198, 200, 30);
		add(textFieldBairro);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(373, 198, 200, 30);
		add(textFieldCidade);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(51, 262, 44, 12);
		add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(105, 255, 200, 30);
		add(textFieldEmail);
		
		textField = new JTextField();
		textField.setBounds(373, 255, 200, 30);
		add(textField);
		
		JLabel lblContato = new JLabel("Contato:");
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContato.setBounds(29, 241, 69, 12);
		add(lblContato);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setForeground(new Color(0, 0, 0));
		lblTelefone.setBounds(315, 262, 55, 12);
		add(lblTelefone);
	}
	
	public JTextField getTextFieldNomeAluno() {
		if(textFieldNomeAluno == null) {
			textFieldNomeAluno = new JTextField();
			textFieldNomeAluno.setBackground(new Color(255, 255, 255));
			textFieldNomeAluno.setBounds(105, 59, 200, 30);
		}	
		return textFieldNomeAluno;
	}
	
	public JTextField getTextFieldCPF() {
		if(textFieldCPF == null) {
			textFieldCPF = new JTextField();
			textFieldCPF.setBounds(373, 59, 200, 30);
		}	
		return textFieldCPF;
	}
	
	public JTextField getTextFieldRG() {
		if(textFieldRG == null) {
			textFieldRG = new JTextField();
			textFieldRG.setBounds(105, 99, 200, 30);
		}	
		return textFieldRG;
	}
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(449, 470, 200, 30);
		}	
		return buttonCadastrar;
	}
	private JLabel getLblEndereco() {
		if (lblEndereco == null) {
			lblEndereco = new JLabel("Endereço:");
			lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEndereco.setBounds(29, 137, 69, 12);
		}
		return lblEndereco;
	}
}
