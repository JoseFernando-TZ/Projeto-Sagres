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

public class PanelMensalidades extends JPanel {
	private JButton btnLimparAl;
	private JLabel lblNewLabel;
	private JLabel lblAnoEscolar;
	private JButton btnCadastrar;
	private JTextField textFieldAnoEscolar;
	private JLabel lblAno;
	private JComboBox comboBox_1;
	private JLabel lblMs;
	private JComboBox comboBox_1_1;
	private JLabel lblStatus;
	private JLabel lblMostrarStatus;
	private JButton btnMulta;
	
	public PanelMensalidades() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnLimparAl());
		add(getLblNewLabel());
		add(getLblAnoEscolar());
		add(getBtnCadastrar());
		add(getTextFieldAnoEscolar());
		add(getLblAno());
		add(getComboBox_1());
		add(getLblMs());
		add(getComboBox_1_1());
		add(getLblStatus());
		add(getLblMostrarStatus());
		add(getBtnMulta());
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
			lblNewLabel = new JLabel("Consultar mensalidades:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(43, 23, 288, 12);
		}
		return lblNewLabel;
	}
	public JLabel getLblAnoEscolar() {
		if (lblAnoEscolar == null) {
			lblAnoEscolar = new JLabel("matricula do aluno:");
			lblAnoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAnoEscolar.setBounds(43, 93, 155, 12);
		}
		return lblAnoEscolar;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("gerar relatório");
			btnCadastrar.setBounds(637, 441, 106, 23);
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
			textFieldAnoEscolar.setBounds(176, 86, 200, 30);
		}
		return textFieldAnoEscolar;
	}
	public JLabel getLblAno() {
		if (lblAno == null) {
			lblAno = new JLabel("Ano:");
			lblAno.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAno.setBounds(43, 262, 155, 12);
		}
		return lblAno;
	}
	public JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(92, 254, 89, 30);
		}
		return comboBox_1;
	}
	public JLabel getLblMs() {
		if (lblMs == null) {
			lblMs = new JLabel("Mês:");
			lblMs.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMs.setBounds(237, 262, 155, 12);
		}
		return lblMs;
	}
	public JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setBounds(287, 254, 89, 30);
		}
		return comboBox_1_1;
	}
	public JLabel getLblStatus() {
		if (lblStatus == null) {
			lblStatus = new JLabel("Status de pagamento: ");
			lblStatus.setBounds(43, 343, 106, 12);
		}
		return lblStatus;
	}
	public JLabel getLblMostrarStatus() {
		if (lblMostrarStatus == null) {
			lblMostrarStatus = new JLabel("status");
			lblMostrarStatus.setBounds(176, 343, 106, 12);
		}
		return lblMostrarStatus;
	}
	public JButton getBtnMulta() {
		if (btnMulta == null) {
			btnMulta = new JButton("Aplicar multa");
			btnMulta.setBounds(92, 441, 106, 23);
		}
		return btnMulta;
	}
}
