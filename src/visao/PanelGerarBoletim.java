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

public class PanelGerarBoletim extends JPanel {
	private JButton btnLimparAl;
	private JLabel lblNewLabel;
	private JLabel lblPeriodoLetivo;
	private JLabel lblNomeAluno;
	private JComboBox<String> comboBox;
	private JButton btnGerar;
	private JTextField textFieldNomeAluno;
	private JLabel lblNotasFrequencia;
	private JLabel lblDisciplina;
	private JComboBox comboBox_1;
	private JLabel lblSelecioneAUnidade;
	private JComboBox comboBox_1_1;
	private JLabel lblNotaDaUnidade;
	private JTextField textFieldNota;
	private JLabel lblFaltas;
	private JTextField textFieldFaltas;
	private JLabel lblMediaGeral;
	private JTextField textFieldMedia;
	
	public PanelGerarBoletim() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnLimparAl());
		add(getLblNewLabel());
		add(getLblPeriodoLetivo());
		add(getLblNomeAluno());
		add(getComboBox());
		add(getBtnGerar());
		add(getTextFieldNomeAluno());
		add(getLblNotasFrequencia());
		add(getLblDisciplina());
		add(getComboBox_1());
		add(getLblSelecioneAUnidade());
		add(getComboBox_1_1());
		add(getLblNotaDaUnidade());
		add(getTextFieldNota());
		add(getLblSelecioneAUnidade_1_1());
		add(getTextFieldFaltas());
		add(getLblMediaGeral());
		add(getTextFieldMedia());
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
			lblNewLabel = new JLabel("Preencha as informações do boletim:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(45, 27, 288, 12);
		}
		return lblNewLabel;
	}
	public JLabel getLblPeriodoLetivo() {
		if (lblPeriodoLetivo == null) {
			lblPeriodoLetivo = new JLabel("selecione o periodo letivo:");
			lblPeriodoLetivo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblPeriodoLetivo.setBounds(45, 83, 150, 12);
		}
		return lblPeriodoLetivo;
	}
	public JLabel getLblNomeAluno() {
		if (lblNomeAluno == null) {
			lblNomeAluno = new JLabel("nome do aluno:");
			lblNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNomeAluno.setBounds(45, 150, 118, 12);
		}
		return lblNomeAluno;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(185, 75, 67, 30);
		}
		return comboBox;
	}

	private JButton getBtnGerar() {
		if (btnGerar == null) {
			btnGerar = new JButton("gerar boletim");
			btnGerar.setBounds(664, 485, 106, 23);
		}
		return btnGerar;
	}
	public void limparCampos() {
		
		}
	//carrega o combo box do grau de parentesco
		/*public void loadComboBox() {
			for(String resp : al.getWhoResp()) {
				getComboBox().addItem(resp);
			}
		}*/
	public JTextField getTextFieldNomeAluno() {
		if (textFieldNomeAluno == null) {
			textFieldNomeAluno = new JTextField();
			textFieldNomeAluno.setBackground(Color.WHITE);
			textFieldNomeAluno.setBounds(185, 143, 184, 30);
		}
		return textFieldNomeAluno;
	}
	public JLabel getLblNotasFrequencia() {
		if (lblNotasFrequencia == null) {
			lblNotasFrequencia = new JLabel("notas e frequência:");
			lblNotasFrequencia.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNotasFrequencia.setBounds(45, 225, 288, 12);
		}
		return lblNotasFrequencia;
	}
	public JLabel getLblDisciplina() {
		if (lblDisciplina == null) {
			lblDisciplina = new JLabel("selecione a disciplina:");
			lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDisciplina.setBounds(45, 275, 150, 12);
		}
		return lblDisciplina;
	}
	public JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(185, 267, 184, 30);
		}
		return comboBox_1;
	}
	public JLabel getLblSelecioneAUnidade() {
		if (lblSelecioneAUnidade == null) {
			lblSelecioneAUnidade = new JLabel("selecione a unidade:");
			lblSelecioneAUnidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSelecioneAUnidade.setBounds(45, 332, 150, 12);
		}
		return lblSelecioneAUnidade;
	}
	public JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setBounds(185, 324, 51, 30);
		}
		return comboBox_1_1;
	}
	public JLabel getLblNotaDaUnidade() {
		if (lblNotaDaUnidade == null) {
			lblNotaDaUnidade = new JLabel("nota da unidade:");
			lblNotaDaUnidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNotaDaUnidade.setBounds(45, 390, 150, 12);
		}
		return lblNotaDaUnidade;
	}
	public JTextField getTextFieldNota() {
		if (textFieldNota == null) {
			textFieldNota = new JTextField();
			textFieldNota.setBackground(Color.WHITE);
			textFieldNota.setBounds(185, 383, 51, 30);
		}
		return textFieldNota;
	}
	public JLabel getLblSelecioneAUnidade_1_1() {
		if (lblFaltas == null) {
			lblFaltas = new JLabel("faltas:");
			lblFaltas.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblFaltas.setBounds(408, 332, 44, 12);
		}
		return lblFaltas;
	}
	public JTextField getTextFieldFaltas() {
		if (textFieldFaltas == null) {
			textFieldFaltas = new JTextField();
			textFieldFaltas.setBackground(Color.WHITE);
			textFieldFaltas.setBounds(472, 325, 51, 30);
		}
		return textFieldFaltas;
	}
	public JLabel getLblMediaGeral() {
		if (lblMediaGeral == null) {
			lblMediaGeral = new JLabel("media geral:");
			lblMediaGeral.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMediaGeral.setBounds(45, 460, 150, 12);
		}
		return lblMediaGeral;
	}
	public JTextField getTextFieldMedia() {
		if (textFieldMedia == null) {
			textFieldMedia = new JTextField();
			textFieldMedia.setBackground(Color.WHITE);
			textFieldMedia.setBounds(185, 453, 51, 30);
		}
		return textFieldMedia;
	}
}
