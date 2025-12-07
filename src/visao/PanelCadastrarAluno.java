package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import modelo.Aluno;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;

public class PanelCadastrarAluno extends JPanel {
	
	Aluno al = new Aluno();
	private JButton buttonCadastrar;
	private JLabel lblEndereco;
	private JTextField textFieldRG;
	private JTextField textFieldRua;
	private JTextField textFieldBairro;
	private JTextField textFieldEmail;
	private JTextField textFieldNumCasa;
	private JTextField textFieldCidade;
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
	private JComboBox<String> comboBox;
	private JFormattedTextField formattedTextField;
	private JFormattedTextField formattedTextFieldDDD;
	private JFormattedTextField formattedTextFieldTel;
	private JLabel lblPreenchaComInformaes;
	private JLabel lblParentesco;
	private JLabel lblNome_1;
	private JTextField textFieldNomeResp;
	private JLabel lbTelResp;
	private JFormattedTextField formattedTextFieldDDDResp;
	private JFormattedTextField formattedTextFieldTelResp;
	private JFormattedTextField formattedTextFieldDiaNasc;
	private JFormattedTextField formattedTextFieldMesNasc;
	private JFormattedTextField formattedTextFieldAnoNasc;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAno;
	private JLabel lblDataNasc;
	private JLabel lblDisciplinaAluno;
	private JComboBox comboBoxDisciplinas;
	private JButton btnMatriculaDisc;
	private JFormattedTextField formattedTextFieldNome;
	
	public PanelCadastrarAluno() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getButtonCadastrar());
		add(getTextFieldRG());
		add(getTextFieldRua());
		add(getTextFieldBairro());
		add(getTextFieldEmail());
		add(getTextFieldNumCasa());
		add(getTextFieldCidade());
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
		add(getComboBox());
		add(getFormattedTextFieldCPF());
		add(getFormattedTextFieldDDD());
		add(getFormattedTextFieldTel());
		add(getLblPreenchaComInformaes());
		add(getLblParentesco());
		add(getLblNome_1());
		add(getTextFieldNomeResp());
		add(getLbTelResp());
		add(getFormattedTextFieldDDDResp());
		add(getFormattedTextFieldTelResp());
		add(getFormattedTextFieldDiaNasc());
		add(getFormattedTextFieldMesNasc());
		add(getFormattedTextFieldAnoNasc());
		add(getLblDia());
		add(getLblMes());
		add(getLblAno());
		add(getLblDataNasc());
		add(getLblDisciplinaAluno());
		add(getComboBoxDisciplinas());
		add(getBtnMatriculaDisc());
		add(getFormattedTextFieldNome());
	}
	
	public JButton getButtonCadastrar() {
		if(buttonCadastrar == null) {
			buttonCadastrar = new JButton();
			buttonCadastrar.setText("Cadastrar");
			buttonCadastrar.setBounds(327, 614, 200, 30);
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
			textFieldNumCasa.setBounds(472, 162, 72, 30);
		}
		return textFieldNumCasa;
	}
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setBounds(472, 203, 211, 30);
		}
		return textFieldCidade;
	}
	public JButton getBtnLimparAl() {
		if (btnLimparAl == null) {
			btnLimparAl = new JButton();
			btnLimparAl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnLimparAl.setText("Limpar Tudo");
			btnLimparAl.setBounds(621, 655, 200, 30);
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
			lblCpf.setBounds(409, 67, 34, 12);
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
			lblN.setBounds(409, 170, 34, 12);
		}
		return lblN;
	}
	public JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCidade.setBounds(409, 211, 72, 12);
		}
		return lblCidade;
	}
	public JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelefone.setBounds(409, 268, 62, 12);
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
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(105, 374, 200, 30);
		}
		return comboBox;
	}
	
	//carrega o combo box do grau de parentesco
	public void loadComboBox() {
		for(String resp : al.getWhoResp()) {
			getComboBox().addItem(resp);
		}
	}
	
	//Formata o TextField do cpf e deixa apenas colocar números
	public JFormattedTextField getFormattedTextFieldCPF() {
		
		try {
			MaskFormatter cpfMascara = new MaskFormatter("###.###.###-##");
			cpfMascara.setPlaceholderCharacter('_');
			if (formattedTextField == null) {
				formattedTextField = new JFormattedTextField(cpfMascara);
				formattedTextField.setBounds(472, 59, 211, 30);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formattedTextField;
	}
	public JFormattedTextField getFormattedTextFieldDDD() {
		try {
			MaskFormatter DDDMask = new MaskFormatter("(##)");
			DDDMask.setPlaceholderCharacter('_');
		if (formattedTextFieldDDD == null) {
			formattedTextFieldDDD = new JFormattedTextField(DDDMask);
			formattedTextFieldDDD.setBounds(472, 260, 72, 30);
		}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formattedTextFieldDDD;
	}
	public JFormattedTextField getFormattedTextFieldTel() {
		try {
			MaskFormatter telMask = new MaskFormatter("9 ####-####");
			telMask.setPlaceholderCharacter('_');
		if (formattedTextFieldTel == null) {
			formattedTextFieldTel = new JFormattedTextField(telMask);
			formattedTextFieldTel.setBounds(549, 260, 129, 30);
		}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formattedTextFieldTel;
	}
	public JLabel getLblPreenchaComInformaes() {
		if (lblPreenchaComInformaes == null) {
			lblPreenchaComInformaes = new JLabel("Preencha com informações do responsável pelo aluno:");
			lblPreenchaComInformaes.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPreenchaComInformaes.setBounds(105, 321, 352, 12);
		}
		return lblPreenchaComInformaes;
	}
	public JLabel getLblParentesco() {
		if (lblParentesco == null) {
			lblParentesco = new JLabel("Parentesco:");
			lblParentesco.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblParentesco.setBounds(30, 382, 65, 12);
		}
		return lblParentesco;
	}
	public JLabel getLblNome_1() {
		if (lblNome_1 == null) {
			lblNome_1 = new JLabel("Nome:");
			lblNome_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNome_1.setBounds(409, 382, 65, 12);
		}
		return lblNome_1;
	}
	public JTextField getTextFieldNomeResp() {
		if (textFieldNomeResp == null) {
			textFieldNomeResp = new JTextField();
			textFieldNomeResp.setBackground(Color.WHITE);
			textFieldNomeResp.setBounds(472, 374, 211, 30);
		}
		return textFieldNomeResp;
	}
	//Limpa campos de texto do cadastro
		public void limparCampos() {
		getFormattedTextFieldCPF().setText("");
		getTextFieldRG().setText("");
		getTextFieldRua().setText("");
		getTextFieldBairro().setText("");
		getTextFieldNumCasa().setText("");
		getTextFieldCidade().setText("");
		getTextFieldEmail().setText("");
		getFormattedTextFieldTel().setText("");
		getFormattedTextFieldDDD().setText("");
		}
	public JLabel getLbTelResp() {
		if (lbTelResp == null) {
			lbTelResp = new JLabel("Telefone:");
			lbTelResp.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbTelResp.setBounds(409, 431, 65, 12);
		}
		return lbTelResp;
	}
	public JFormattedTextField getFormattedTextFieldDDDResp() {
		if (formattedTextFieldDDDResp == null) {
			formattedTextFieldDDDResp = new JFormattedTextField();
			formattedTextFieldDDDResp.setBounds(472, 423, 72, 30);
		}
		return formattedTextFieldDDDResp;
	}
	public JFormattedTextField getFormattedTextFieldTelResp() {
		try {
			MaskFormatter telMask = new MaskFormatter("9 ####-####");
			telMask.setPlaceholderCharacter('_');
		if (formattedTextFieldTelResp == null) {
			formattedTextFieldTelResp = new JFormattedTextField(telMask);
			formattedTextFieldTelResp.setBounds(549, 423, 134, 30);
		}
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formattedTextFieldTelResp;
	}
	public JFormattedTextField getFormattedTextFieldDiaNasc() {
		if (formattedTextFieldDiaNasc == null) {
			formattedTextFieldDiaNasc = new JFormattedTextField();
			formattedTextFieldDiaNasc.setBounds(472, 101, 72, 30);
		}
		return formattedTextFieldDiaNasc;
	}
	public JFormattedTextField getFormattedTextFieldMesNasc() {
		if (formattedTextFieldMesNasc == null) {
			formattedTextFieldMesNasc = new JFormattedTextField();
			formattedTextFieldMesNasc.setBounds(549, 100, 72, 30);
		}
		return formattedTextFieldMesNasc;
	}
	public JFormattedTextField getFormattedTextFieldAnoNasc() {
		if (formattedTextFieldAnoNasc == null) {
			formattedTextFieldAnoNasc = new JFormattedTextField();
			formattedTextFieldAnoNasc.setBounds(631, 101, 72, 30);
		}
		return formattedTextFieldAnoNasc;
	}
	public JLabel getLblDia() {
		if (lblDia == null) {
			lblDia = new JLabel("Dia");
			lblDia.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDia.setBounds(493, 139, 34, 12);
		}
		return lblDia;
	}
	public JLabel getLblMes() {
		if (lblMes == null) {
			lblMes = new JLabel("Mês");
			lblMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMes.setBounds(569, 139, 34, 12);
		}
		return lblMes;
	}
	public JLabel getLblAno() {
		if (lblAno == null) {
			lblAno = new JLabel("Ano");
			lblAno.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAno.setBounds(649, 139, 34, 12);
		}
		return lblAno;
	}
	public JLabel getLblDataNasc() {
		if (lblDataNasc == null) {
			lblDataNasc = new JLabel("Data de nascimento:");
			lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDataNasc.setBounds(345, 109, 121, 12);
		}
		return lblDataNasc;
	}
	private JLabel getLblDisciplinaAluno() {
		if (lblDisciplinaAluno == null) {
			lblDisciplinaAluno = new JLabel("Disciplinas do aluno(Max 8):");
			lblDisciplinaAluno.setBounds(10, 431, 190, 14);
		}
		return lblDisciplinaAluno;
	}
	private JComboBox getComboBoxDisciplinas() {
		if (comboBoxDisciplinas == null) {
			comboBoxDisciplinas = new JComboBox();
			comboBoxDisciplinas.setBounds(105, 456, 200, 30);
		}
		return comboBoxDisciplinas;
	}
	private JButton getBtnMatriculaDisc() {
		if (btnMatriculaDisc == null) {
			btnMatriculaDisc = new JButton("Matricular");
			btnMatriculaDisc.setBounds(316, 460, 106, 23);
		}
		return btnMatriculaDisc;
	}
	private JFormattedTextField getFormattedTextFieldNome() {
		if (formattedTextFieldNome == null) {
			formattedTextFieldNome = new JFormattedTextField();
			formattedTextFieldNome.setBounds(105, 59, 200, 30);
		}
		return formattedTextFieldNome;
	}
}
