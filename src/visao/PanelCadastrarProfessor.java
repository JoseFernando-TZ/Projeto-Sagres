package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class PanelCadastrarProfessor extends JPanel {
	
	private JTextField textFieldNomeProfessor;
	private JTextField textFieldRGprofessor;
	private JTextField textFieldRuaProfessor;
	private JTextField textFieldNumCasaProfessor;
	private JTextField textFieldBairroProfessor;
	private JTextField textFieldCidadeProfessor;
	private JTextField textFieldTelefoneProfessor;
	private JTextField textFieldEmailProfessor;
	private JTextField textFieldFormacao;
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
	private JButton btnLimparProfCPF;
	private JButton btnLimpaProfDataNasc;
	private JButton btnLimparProfTel;
	private JComboBox comboBox;
	private JFormattedTextField formattedTextFieldDiaNasc;
	private JFormattedTextField formattedTextFieldMesNasc;
	private JFormattedTextField formattedTextFieldAnoNasc;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAno;
	private JFormattedTextField formattedTextFieldCPF;
	
	public PanelCadastrarProfessor() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getTextFieldNomeProfessor());
		this.add(getTextFieldRGprofessor());
		this.add(getTextFieldRuaProfessor());
		this.add(getTextFieldNumCasaProfessor());
		this.add(getTextFieldBairroProfessor());
		this.add(getTextFieldCidadeProfessor());
		this.add(getTextFieldDDDProfessor());
		this.add(getTextFieldTelefoneProfessor());
		this.add(getTextFieldEmailProfessor());
		this.add(getTextFieldFormacao());
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
		add(getBtnLimparProfCPF());
		add(getBtnLimpaProfDataNasc());
		add(getBtnLimparProfTel());
		add(getComboBox());
		add(getFormattedTextFieldDiaNasc());
		add(getFormattedTextFieldMesNasc());
		add(getFormattedTextFieldAnoNasc());
		add(getLblDia());
		add(getLblMes());
		add(getLblAno());
		add(getFormattedTextFieldCPF());
		
	}
	
	public JTextField getTextFieldNomeProfessor() {
		if(textFieldNomeProfessor == null) {
			textFieldNomeProfessor = new JTextField();
			textFieldNomeProfessor.setBounds(105, 59, 200, 30);
		}	
		return textFieldNomeProfessor;
	}
	
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(301, 410, 200, 30);
		}	
		return buttonCadastrar;
	}
	public JButton getBtnLimparProf() {
		if (btnLimparProf == null) {
			btnLimparProf = new JButton();
			btnLimparProf.setText("Limpar Tudo");
			btnLimparProf.setBounds(301, 490, 200, 30);
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

public JTextField getTextFieldRuaProfessor() {
	if(textFieldRuaProfessor == null) {
		textFieldRuaProfessor = new JTextField();
		textFieldRuaProfessor.setBounds(105, 178, 200, 30);
	}
	
	return textFieldRuaProfessor;
}

public JTextField getTextFieldNumCasaProfessor() {
	if(textFieldNumCasaProfessor == null) {
		textFieldNumCasaProfessor = new JTextField();
		textFieldNumCasaProfessor.setBounds(511, 178, 72, 30);
	}
	return textFieldNumCasaProfessor;
}

public JTextField getTextFieldBairroProfessor() {
	if(textFieldBairroProfessor == null) {
		textFieldBairroProfessor = new JTextField();
		textFieldBairroProfessor.setBounds(105, 219, 200, 30);
	}
	return textFieldBairroProfessor;
}

public JTextField getTextFieldCidadeProfessor() {
	if(textFieldCidadeProfessor == null) {
		textFieldCidadeProfessor = new JTextField();
		textFieldCidadeProfessor.setBounds(511, 219, 211, 30);
	}
	return textFieldCidadeProfessor;
}
public JTextField getTextFieldDDDProfessor() {
	if(textFieldDDDProfessor == null) {
		textFieldDDDProfessor = new JTextField();
		textFieldDDDProfessor.setBounds(511, 260, 72, 30);
	}
	return textFieldDDDProfessor;
}
public JTextField getTextFieldTelefoneProfessor() {
	if(textFieldTelefoneProfessor == null) {
		textFieldTelefoneProfessor = new JTextField();
		textFieldTelefoneProfessor.setBounds(593, 260, 133, 30);
	}
	return textFieldTelefoneProfessor;
}

public JTextField getTextFieldEmailProfessor() {
	if(textFieldEmailProfessor == null) {
		textFieldEmailProfessor = new JTextField();
		textFieldEmailProfessor.setBounds(105, 281, 200, 30);
	}
	return textFieldEmailProfessor;
}

public JTextField getTextFieldFormacao() {
	if(textFieldFormacao == null) {
		textFieldFormacao = new JTextField();
		textFieldFormacao.setBounds(105, 322, 200, 30);
	}
	return textFieldFormacao;
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
		lblCpf.setBounds(450, 67, 34, 12);
	}
	return lblCpf;
}
public JLabel getLblEndereco() {
	if (lblEndereco == null) {
		lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereco.setBounds(23, 163, 72, 12);
	}
	return lblEndereco;
}
public JLabel getLblRua() {
	if (lblRua == null) {
		lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRua.setBounds(51, 186, 44, 12);
	}
	return lblRua;
}
public JLabel getLblBairro() {
	if (lblBairro == null) {
		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(49, 227, 72, 12);
	}
	return lblBairro;
}
public JLabel getLblEmail() {
	if (lblEmail == null) {
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(49, 289, 46, 12);
	}
	return lblEmail;
}
public JLabel getLblN() {
	if (lblN == null) {
		lblN = new JLabel("N°:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblN.setBounds(467, 186, 34, 12);
	}
	return lblN;
}
public JLabel getLblCidade() {
	if (lblCidade == null) {
		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(439, 227, 72, 12);
	}
	return lblCidade;
}
public JLabel getLblTelefone() {
	if (lblTelefone == null) {
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(439, 268, 62, 12);
	}
	return lblTelefone;
}
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data de nascimento:");
			lblData.setBounds(389, 99, 121, 79);
		}
		return lblData;
	}
	private JLabel getLblFormacao() {
		if (lblFormacao == null) {
			lblFormacao = new JLabel("Formação: ");
			lblFormacao.setBounds(31, 331, 64, 12);
		}
		return lblFormacao;
	}
	private JLabel getLblDisciplina() {
		if (lblDisciplina == null) {
			lblDisciplina = new JLabel("Disciplina(s):");
			lblDisciplina.setBounds(436, 331, 65, 12);
		}
		return lblDisciplina;
	}
	
	public JLabel getLblContato() {
		if (lblContato == null) {
			lblContato = new JLabel("Contato:");
			lblContato.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblContato.setBounds(30, 260, 72, 12);
		}
		return lblContato;
	}
	public JButton getBtnLimparProfCPF() {
		if (btnLimparProfCPF == null) {
			btnLimparProfCPF = new JButton();
			btnLimparProfCPF.setText("Limpar");
			btnLimparProfCPF.setBounds(732, 59, 72, 30);
		}
		return btnLimparProfCPF;
	}
	public JButton getBtnLimpaProfDataNasc() {
		if (btnLimpaProfDataNasc == null) {
			btnLimpaProfDataNasc = new JButton();
			btnLimpaProfDataNasc.setText("Limpar");
			btnLimpaProfDataNasc.setBounds(757, 124, 72, 30);
		}
		return btnLimpaProfDataNasc;
	}
	public JButton getBtnLimparProfTel() {
		if (btnLimparProfTel == null) {
			btnLimparProfTel = new JButton();
			btnLimparProfTel.setText("Limpar");
			btnLimparProfTel.setBounds(732, 260, 72, 30);
		}
		return btnLimparProfTel;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(511, 322, 200, 30);
		}
		return comboBox;
	}
	public JFormattedTextField getFormattedTextFieldDiaNasc() {
		if (formattedTextFieldDiaNasc == null) {
			formattedTextFieldDiaNasc = new JFormattedTextField();
			formattedTextFieldDiaNasc.setBounds(511, 124, 72, 30);
		}
		return formattedTextFieldDiaNasc;
	}
	public JFormattedTextField getFormattedTextFieldMesNasc() {
		if (formattedTextFieldMesNasc == null) {
			formattedTextFieldMesNasc = new JFormattedTextField();
			formattedTextFieldMesNasc.setBounds(593, 125, 72, 30);
		}
		return formattedTextFieldMesNasc;
	}
	public JFormattedTextField getFormattedTextFieldAnoNasc() {
		if (formattedTextFieldAnoNasc == null) {
			formattedTextFieldAnoNasc = new JFormattedTextField();
			formattedTextFieldAnoNasc.setBounds(675, 125, 72, 30);
		}
		return formattedTextFieldAnoNasc;
	}
	public JLabel getLblDia() {
		if (lblDia == null) {
			lblDia = new JLabel("Dia");
			lblDia.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDia.setBounds(521, 100, 34, 12);
		}
		return lblDia;
	}
	public JLabel getLblMes() {
		if (lblMes == null) {
			lblMes = new JLabel("Mês");
			lblMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMes.setBounds(613, 100, 34, 12);
		}
		return lblMes;
	}
	public JLabel getLblAno() {
		if (lblAno == null) {
			lblAno = new JLabel("Ano");
			lblAno.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAno.setBounds(692, 100, 34, 12);
		}
		return lblAno;
	}
	public JFormattedTextField getFormattedTextFieldCPF() {
		if (formattedTextFieldCPF == null) {
			formattedTextFieldCPF = new JFormattedTextField();
			formattedTextFieldCPF.setBounds(511, 59, 211, 30);
		}
		return formattedTextFieldCPF;
	}

	public void limparCampos() {
		getTextFieldNomeProfessor().setText("");
		getTextFieldRGprofessor().setText("");
		getTextFieldRuaProfessor().setText("");
		getTextFieldBairroProfessor().setText("");
		getTextFieldNumCasaProfessor().setText("");
		getTextFieldCidadeProfessor().setText("");
		getTextFieldEmailProfessor().setText("");
		getTextFieldTelefoneProfessor().setText("");
		getTextFieldDDDProfessor().setText("");
		getTextFieldFormacao().setText("");
		
		}
}
