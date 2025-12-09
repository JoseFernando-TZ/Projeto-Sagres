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

public class PanelCadastrarSerie extends JPanel {
	private JButton btnLimparAl;
	private JLabel lblNewLabel;
	private JLabel lblAnoEscolar;
	private JLabel lblTipoPeriodo;
	private JComboBox<String> comboBox;
	private JButton btnCadastrar;
	private JTextField textFieldAnoEscolar;
	
	public PanelCadastrarSerie() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnLimparAl());
		add(getLblNewLabel());
		add(getLblAnoEscolar());
		add(getLblTipoPeriodo());
		add(getComboBox());
		add(getBtnCadastrar());
		add(getTextFieldAnoEscolar());
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
			lblNewLabel = new JLabel("Preencha com informações da série:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(259, 22, 288, 12);
		}
		return lblNewLabel;
	}
	public JLabel getLblAnoEscolar() {
		if (lblAnoEscolar == null) {
			lblAnoEscolar = new JLabel("selecione o ano:");
			lblAnoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAnoEscolar.setBounds(176, 93, 150, 12);
		}
		return lblAnoEscolar;
	}
	public JLabel getLblTipoPeriodo() {
		if (lblTipoPeriodo == null) {
			lblTipoPeriodo = new JLabel("digite a série:");
			lblTipoPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTipoPeriodo.setBounds(176, 175, 118, 12);
		}
		return lblTipoPeriodo;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(298, 85, 200, 30);
		}
		return comboBox;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setBounds(327, 266, 106, 23);
		}
		return btnCadastrar;
	}
	public void limparCampos() {
		
		}
	//carrega o combo box do grau de parentesco
		/*public void loadComboBox() {
			for(String resp : al.getWhoResp()) {
				getComboBox().addItem(resp);
			}
		}*/
	public JTextField getTextFieldAnoEscolar() {
		if (textFieldAnoEscolar == null) {
			textFieldAnoEscolar = new JTextField();
			textFieldAnoEscolar.setBackground(Color.WHITE);
			textFieldAnoEscolar.setBounds(298, 168, 67, 30);
		}
		return textFieldAnoEscolar;
	}
}
