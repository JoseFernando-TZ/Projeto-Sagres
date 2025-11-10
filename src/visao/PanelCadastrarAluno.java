package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Aluno;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class PanelCadastrarAluno extends JPanel {
	
	Aluno al = new Aluno();
	private JTextField textFieldNomeAluno;
	private JTextField textFieldCPF;
	private JButton buttonCadastrar;
	private JLabel lblEndereco;
	private JTextField textFieldRG;
	private JTextField textFieldRua;
	private JTextField textFieldBairro;
	private JTextField textFieldEmail;
	private JTextField textFieldNumCasa;
	private JTextField textFieldCidade;
	private JTextField textFieldTelefone;
	private JButton btnLimparAl;
	private JLabel lblNewLabel;
	private JLabel lblNome;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JLabel lblEndereo;
	private JLabel lblRua;
	private JLabel lblBairro;
	private JLabel lblEmail;
	private JLabel lblN;
	private JLabel lblCidade;
	private JLabel lblTelefone;
	private JLabel lblContato;
	private JTextField textFieldDDD;
	private JComboBox<String> comboBox;
	
	public PanelCadastrarAluno() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getTextFieldNomeAluno());
		this.add(getTextFieldCPF());
		this.add(getButtonCadastrar());
		add(getTextFieldRG());
		add(getTextFieldRua());
		add(getTextFieldBairro());
		add(getTextFieldEmail());
		add(getTextFieldNumCasa());
		add(getTextFieldCidade());
		add(getTextFieldTelefone());
		add(getBtnLimparAl());
		add(getLblNewLabel());
		add(getLblNome());
		add(getLblRg());
		add(getLblCpf());
		add(getLblEndereo());
		add(getLblRua());
		add(getLblBairro());
		add(getLblEmail());
		add(getLblN());
		add(getLblCidade());
		add(getLblTelefone());
		add(getLblContato());
		add(getTextFieldDDD());
		add(getComboBox());
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
			textFieldCPF.setBounds(399, 59, 211, 30);
		}	
		return textFieldCPF;
	}
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(450, 615, 200, 30);
		}	
		return buttonCadastrar;
	}
	public JTextField getTextFieldRG() {
		if (textFieldRG == null) {
			textFieldRG = new JTextField();
			textFieldRG.setBackground(Color.WHITE);
			textFieldRG.setBounds(105, 101, 200, 30);
		}
		return textFieldRG;
	}
	public JTextField getTextFieldRua() {
		if (textFieldRua == null) {
			textFieldRua = new JTextField();
			textFieldRua.setBackground(Color.WHITE);
			textFieldRua.setBounds(105, 162, 200, 30);
		}
		return textFieldRua;
	}
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setBackground(Color.WHITE);
			textFieldBairro.setBounds(105, 203, 200, 30);
		}
		return textFieldBairro;
	}
	public JTextField getTextFieldEmail() {
		if (textFieldEmail == null) {
			textFieldEmail = new JTextField();
			textFieldEmail.setBackground(Color.WHITE);
			textFieldEmail.setBounds(105, 260, 200, 30);
		}
		return textFieldEmail;
	}
	public JTextField getTextFieldNumCasa() {
		if (textFieldNumCasa == null) {
			textFieldNumCasa = new JTextField();
			textFieldNumCasa.setBounds(399, 162, 72, 30);
		}
		return textFieldNumCasa;
	}
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setBounds(399, 203, 211, 30);
		}
		return textFieldCidade;
	}
	public JTextField getTextFieldTelefone() {
		if (textFieldTelefone == null) {
			textFieldTelefone = new JTextField();
			textFieldTelefone.setBounds(477, 260, 133, 30);
		}
		return textFieldTelefone;
	}
	public JButton getBtnLimparAl() {
		if (btnLimparAl == null) {
			btnLimparAl = new JButton();
			btnLimparAl.setText("Limpar");
			btnLimparAl.setBounds(245, 317, 200, 30);
		}
		return btnLimparAl;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Preencha com informações do aluno:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(104, 22, 240, 12);
		}
		return lblNewLabel;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNome.setBounds(49, 66, 46, 12);
		}
		return lblNome;
	}
	public JLabel getLblRg() {
		if (lblRg == null) {
			lblRg = new JLabel("RG:");
			lblRg.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblRg.setBounds(49, 108, 46, 12);
		}
		return lblRg;
	}
	public JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("CPF:");
			lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCpf.setBounds(338, 66, 34, 12);
		}
		return lblCpf;
	}
	public JLabel getLblEndereo() {
		if (lblEndereo == null) {
			lblEndereo = new JLabel("Endereço:");
			lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEndereo.setBounds(30, 143, 72, 12);
		}
		return lblEndereo;
	}
	public JLabel getLblRua() {
		if (lblRua == null) {
			lblRua = new JLabel("Rua:");
			lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblRua.setBounds(51, 169, 44, 12);
		}
		return lblRua;
	}
	public JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblBairro.setBounds(49, 210, 72, 12);
		}
		return lblBairro;
	}
	public JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email:");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEmail.setBounds(49, 267, 46, 12);
		}
		return lblEmail;
	}
	public JLabel getLblN() {
		if (lblN == null) {
			lblN = new JLabel("N°:");
			lblN.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblN.setBounds(338, 169, 34, 12);
		}
		return lblN;
	}
	public JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCidade.setBounds(338, 210, 72, 12);
		}
		return lblCidade;
	}
	public JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelefone.setBounds(338, 267, 62, 12);
		}
		return lblTelefone;
	}
	public JLabel getLblContato() {
		if (lblContato == null) {
			lblContato = new JLabel("Contato:");
			lblContato.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblContato.setBounds(30, 245, 72, 12);
		}
		return lblContato;
	}
	public JTextField getTextFieldDDD() {
		if (textFieldDDD == null) {
			textFieldDDD = new JTextField();
			textFieldDDD.setBounds(399, 260, 72, 30);
		}
		return textFieldDDD;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(105, 400, 200, 30);
		}
		return comboBox;
	}
	//Limpa campos de texto do cadastro
	public void limparCampos() {
	getTextFieldNomeAluno().setText("");
	getTextFieldCPF().setText("");
	getTextFieldRG().setText("");
	getTextFieldRua().setText("");
	getTextFieldBairro().setText("");
	getTextFieldNumCasa().setText("");
	getTextFieldCidade().setText("");
	getTextFieldEmail().setText("");
	getTextFieldTelefone().setText("");
	getTextFieldDDD().setText("");
	}
	//carrega o combo box do grau de parentesco
	public void loadComboBox() {
		for(String resp : al.getWhoResp()) {
			getComboBox().addItem(resp);
		}
	}
	
}
