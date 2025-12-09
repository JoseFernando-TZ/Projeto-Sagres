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

public class PanelContas extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblAnoEscolar;
	private JLabel lblValor;
	private JComboBox<String> comboBox;
	private JComboBox comboBox_1;
	private JLabel lblMostrarValor;
	private JLabel lblNome;
	private JLabel lblMostrarNome;
	private JLabel lblDataDeVencimento;
	private JLabel lblMostrarDataDeVencimento;
	private JLabel lblStatusDePagamento;
	private JLabel lblMostrarStatus;
	
	public PanelContas() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getLblNewLabel());
		add(getLblAnoEscolar());
		add(getLblValor());
		add(getComboBox());
		add(getComboBox_1());
		add(getLblMostrarValor());
		add(getLblNome());
		add(getLblMostrarNome());
		add(getLblDataDeVencimento());
		add(getLblMostrarDataDeVencimento());
		add(getLblStatusDePagamento());
		add(getLblMostrarStatus());
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Selecione entre contas a pagar ou receber");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(44, 38, 288, 12);
		}
		return lblNewLabel;
	}
	public JLabel getLblAnoEscolar() {
		if (lblAnoEscolar == null) {
			lblAnoEscolar = new JLabel("Escolha a conta");
			lblAnoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAnoEscolar.setBounds(44, 131, 184, 12);
		}
		return lblAnoEscolar;
	}
	public JLabel getLblValor() {
		if (lblValor == null) {
			lblValor = new JLabel("valor a pagar/receber:");
			lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblValor.setBounds(44, 279, 118, 12);
		}
		return lblValor;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(44, 60, 200, 30);
		}
		return comboBox;
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
	public JLabel getLblDataDeVencimento() {
		if (lblDataDeVencimento == null) {
			lblDataDeVencimento = new JLabel("data de vencimento:");
			lblDataDeVencimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDataDeVencimento.setBounds(330, 280, 118, 12);
		}
		return lblDataDeVencimento;
	}
	public JLabel getLblMostrarDataDeVencimento() {
		if (lblMostrarDataDeVencimento == null) {
			lblMostrarDataDeVencimento = new JLabel("data");
			lblMostrarDataDeVencimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMostrarDataDeVencimento.setBounds(471, 280, 118, 12);
		}
		return lblMostrarDataDeVencimento;
	}
	public JLabel getLblStatusDePagamento() {
		if (lblStatusDePagamento == null) {
			lblStatusDePagamento = new JLabel("status de pagamento:");
			lblStatusDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblStatusDePagamento.setBounds(330, 325, 118, 12);
		}
		return lblStatusDePagamento;
	}
	public JLabel getLblMostrarStatus() {
		if (lblMostrarStatus == null) {
			lblMostrarStatus = new JLabel("status");
			lblMostrarStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMostrarStatus.setBounds(471, 325, 118, 12);
		}
		return lblMostrarStatus;
	}
}
