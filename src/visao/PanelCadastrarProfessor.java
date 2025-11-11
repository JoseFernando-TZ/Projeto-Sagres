package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarProfessor extends JPanel {
	
	private JTextField textFieldNomeProfessor;
	private JTextField textFieldCPFprofessor;
	private JTextField textFieldRGprofessor;
	private JTextField textFieldDataNascimentoProfessor;
	private JTextField textFieldRuaProfessor;
	private JTextField textFieldNumCasaProfessor;
	private JTextField textFieldBairroProfessor;
	private JTextField textFieldCidadeProfessor;
	private JTextField textFieldTelefoneProfessor;
	private JTextField textFieldEmailProfessor;
	private JTextField textFieldFormacao;
	private JTextField textFieldDisciplina;
	private JTextField textFieldDDDProfessor;
	private JButton buttonCadastrar;
	private JButton btnLimparProf;
	private JLabel lblCpf;
	private JLabel lblNewLabel;
	private JLabel lblNome;
	private JLabel lblRg;
	private JLabel lblEndereco;
	private JLabel lblRua;
	private JLabel lblBairro;
	private JLabel lblEmail;
	private JLabel lblN;
	private JLabel lblCidade;
	private JLabel lblTelefone;
	private JLabel lblContato;
	private JLabel lblData;
	private JLabel lblFormacao;
	private JLabel lblDisciplina;
	
	public PanelCadastrarProfessor() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getTextFieldNomeProfessor());
		this.add(getTextFieldCPFprofessor());
		this.add(getTextFieldRGprofessor());
		this.add(getTextFieldDataNascimentoProfessor());
		this.add(getTextFieldRuaProfessor());
		this.add(getTextFieldNumCasaProfessor());
		this.add(getTextFieldBairroProfessor());
		this.add(getTextFieldCidadeProfessor());
		this.add(getTextFieldDDDProfessor());
		this.add(getTextFieldTelefoneProfessor());
		this.add(getTextFieldEmailProfessor());
		this.add(getTextFieldFormacao());
		this.add(getTextFieldDisciplina());
		this.add(getButtonCadastrar());
		add(getLblNewLabel());
		add(getLblNome());
		add(getLblRg());
		add(getLblCpf());
		add(getLblEndereco());
		add(getLblRua());
		add(getLblBairro());
		add(getLblEmail());
		add(getLblN());
		add(getLblCidade());
		add(getLblTelefone());
		add(getLblFormacao());
		add(getLblDisciplina());
		add(getLblData());
		add(getBtnLimparProf());
		add(getLblContato());
		
	}
	
	public JTextField getTextFieldNomeProfessor() {
		if(textFieldNomeProfessor == null) {
			textFieldNomeProfessor = new JTextField();
			textFieldNomeProfessor.setBounds(105, 59, 200, 30);
		}	
		return textFieldNomeProfessor;
	}
	
	public JTextField getTextFieldCPFprofessor() {
		if(textFieldCPFprofessor == null) {
			textFieldCPFprofessor = new JTextField();
			textFieldCPFprofessor.setBounds(410, 59, 211, 30);
		}	
		return textFieldCPFprofessor;
	}
	
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(450, 615, 200, 30);
		}	
		return buttonCadastrar;
	}
	public JButton getBtnLimparProf() {
		if (btnLimparProf == null) {
			btnLimparProf = new JButton();
			btnLimparProf.setText("Limpar");
			btnLimparProf.setBounds(245, 317, 200, 30);
		}
		return btnLimparProf;
	}

public JTextField getTextFieldRGprofessor() {
	if(textFieldRGprofessor == null) {
		textFieldRGprofessor = new JTextField();
		textFieldRGprofessor.setBounds(105, 101, 200, 30);
	}	
	return textFieldRGprofessor;
}

public JTextField getTextFieldDataNascimentoProfessor() {
	if(textFieldDataNascimentoProfessor == null) {
		textFieldDataNascimentoProfessor = new JTextField();
		textFieldDataNascimentoProfessor.setBounds(410, 99, 200, 30);
	}	
	return textFieldDataNascimentoProfessor;
}

public JTextField getTextFieldRuaProfessor() {
	if(textFieldRuaProfessor == null) {
		textFieldRuaProfessor = new JTextField();
		textFieldRuaProfessor.setBounds(105, 162, 200, 30);
	}
	
	return textFieldRuaProfessor;
}

public JTextField getTextFieldNumCasaProfessor() {
	if(textFieldNumCasaProfessor == null) {
		textFieldNumCasaProfessor = new JTextField();
		textFieldNumCasaProfessor.setBounds(410, 162, 72, 30);
	}
	return textFieldNumCasaProfessor;
}

public JTextField getTextFieldBairroProfessor() {
	if(textFieldBairroProfessor == null) {
		textFieldBairroProfessor = new JTextField();
		textFieldBairroProfessor.setBounds(105, 203, 200, 30);
	}
	return textFieldBairroProfessor;
}

public JTextField getTextFieldCidadeProfessor() {
	if(textFieldCidadeProfessor == null) {
		textFieldCidadeProfessor = new JTextField();
		textFieldCidadeProfessor.setBounds(410, 203, 211, 30);
	}
	return textFieldCidadeProfessor;
}
public JTextField getTextFieldDDDProfessor() {
	if(textFieldDDDProfessor == null) {
		textFieldDDDProfessor = new JTextField();
		textFieldDDDProfessor.setBounds(399, 260, 72, 30);
	}
	return textFieldDDDProfessor;
}
public JTextField getTextFieldTelefoneProfessor() {
	if(textFieldTelefoneProfessor == null) {
		textFieldTelefoneProfessor = new JTextField();
		textFieldTelefoneProfessor.setBounds(477, 260, 133, 30);
	}
	return textFieldTelefoneProfessor;
}

public JTextField getTextFieldEmailProfessor() {
	if(textFieldEmailProfessor == null) {
		textFieldEmailProfessor = new JTextField();
		textFieldEmailProfessor.setBounds(105, 260, 200, 30);
	}
	return textFieldEmailProfessor;
}

public JTextField getTextFieldFormacao() {
	if(textFieldFormacao == null) {
		textFieldFormacao = new JTextField();
		textFieldFormacao.setBounds(105, 368, 200, 30);
	}
	return textFieldFormacao;
}

public JTextField getTextFieldDisciplina() {
	if(textFieldDisciplina == null) {
		textFieldDisciplina = new JTextField();
		textFieldDisciplina.setBounds(105, 425, 200, 30);
	}
	return textFieldDisciplina;
}

public JLabel getLblNewLabel() {
	if (lblNewLabel == null) {
		lblNewLabel = new JLabel("Preencha com informações do professor:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(104, 22, 268, 12);
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
public JLabel getLblEndereco() {
	if (lblEndereco == null) {
		lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereco.setBounds(30, 143, 72, 12);
	}
	return lblEndereco;
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
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data de nascimento:");
			lblData.setBounds(315, 76, 121, 79);
		}
		return lblData;
	}
	private JLabel getLblFormacao() {
		if (lblFormacao == null) {
			lblFormacao = new JLabel("Formação: ");
			lblFormacao.setBounds(31, 376, 64, 12);
		}
		return lblFormacao;
	}
	private JLabel getLblDisciplina() {
		if (lblDisciplina == null) {
			lblDisciplina = new JLabel("Disciplina:");
			lblDisciplina.setBounds(30, 433, 65, 12);
		}
		return lblDisciplina;
	}
	
	public JLabel getLblContato() {
		if (lblContato == null) {
			lblContato = new JLabel("Contato:");
			lblContato.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblContato.setBounds(30, 245, 72, 12);
		}
		return lblContato;
	}
	
	public void limparCampos() {
		getTextFieldNomeProfessor().setText("");
		getTextFieldCPFprofessor().setText("");
		getTextFieldRGprofessor().setText("");
		getTextFieldRuaProfessor().setText("");
		getTextFieldBairroProfessor().setText("");
		getTextFieldNumCasaProfessor().setText("");
		getTextFieldCidadeProfessor().setText("");
		getTextFieldEmailProfessor().setText("");
		getTextFieldTelefoneProfessor().setText("");
		getTextFieldDDDProfessor().setText("");
		getTextFieldDataNascimentoProfessor().setText("");
		getTextFieldFormacao().setText("");
		getTextFieldDisciplina().setText("");
		}
}
