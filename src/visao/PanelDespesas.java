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

public class PanelDespesas extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblAnoEscolar;
	private JLabel lblTipoPeriodo;
	private JComboBox<String> comboBox;
	private JButton btnRecibo;
	private JComboBox comboBox_1;
	private JLabel lblMostrarValor;
	private JLabel lblNome;
	private JLabel lblMostrarNome;
	
	public PanelDespesas() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getLblNewLabel());
		add(getLblAnoEscolar());
		add(getLblTipoPeriodo());
		add(getComboBox());
		add(getBtnRecibo());
		add(getComboBox_1());
		add(getLblMostrarValor());
		add(getLblNome());
		add(getLblMostrarNome());
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Selecione entre receitas ou despesas:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(44, 38, 288, 12);
		}
		return lblNewLabel;
	}
	public JLabel getLblAnoEscolar() {
		if (lblAnoEscolar == null) {
			lblAnoEscolar = new JLabel("Escolha a receita/despesa:");
			lblAnoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAnoEscolar.setBounds(44, 131, 184, 12);
		}
		return lblAnoEscolar;
	}
	public JLabel getLblTipoPeriodo() {
		if (lblTipoPeriodo == null) {
			lblTipoPeriodo = new JLabel("valor recebido/pago:");
			lblTipoPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTipoPeriodo.setBounds(44, 279, 118, 12);
		}
		return lblTipoPeriodo;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(44, 60, 200, 30);
		}
		return comboBox;
	}

	private JButton getBtnRecibo() {
		if (btnRecibo == null) {
			btnRecibo = new JButton("Emitir recibo");
			btnRecibo.setBounds(633, 384, 106, 23);
		}
		return btnRecibo;
	}
	public void limparCampos() {
		
		}
	public JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(44, 170, 200, 30);
		}
		return comboBox_1;
	}
	public JLabel getLblMostrarValor() {
		if (lblMostrarValor == null) {
			lblMostrarValor = new JLabel("valor");
			lblMostrarValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMostrarValor.setBounds(172, 280, 118, 12);
		}
		return lblMostrarValor;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNome.setBounds(44, 324, 118, 12);
		}
		return lblNome;
	}
	public JLabel getLblMostrarNome() {
		if (lblMostrarNome == null) {
			lblMostrarNome = new JLabel("nome");
			lblMostrarNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMostrarNome.setBounds(172, 325, 118, 12);
		}
		return lblMostrarNome;
	}
}
