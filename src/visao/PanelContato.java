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

public class PanelContato extends JPanel {
	private JButton btnLimparAl;
	private JLabel lblAluno;
	private JLabel lblComunicado;
	private JComboBox<String> comboBox;
	private JButton btnEnviar;
	private JTextField textFieldAluno;
	private JTextField textField;
	
	public PanelContato() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnLimparAl());
		add(getLblAluno());
		add(getLblComunicado());
		add(getComboBox());
		add(getBtnEnviar());
		add(getTextFieldAluno());
		add(getTextField());
	}
	public JButton getBtnLimparAl() {
		if (btnLimparAl == null) {
			btnLimparAl = new JButton();
			btnLimparAl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnLimparAl.setText("Limpar Tudo");
			btnLimparAl.setBounds(507, 397, 191, 30);
		}
		return btnLimparAl;
	}
	public JLabel getLblAluno() {
		if (lblAluno == null) {
			lblAluno = new JLabel("Aluno:");
			lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAluno.setBounds(47, 93, 46, 12);
		}
		return lblAluno;
	}
	public JLabel getLblComunicado() {
		if (lblComunicado == null) {
			lblComunicado = new JLabel("Comunicado:");
			lblComunicado.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblComunicado.setBounds(47, 175, 118, 12);
		}
		return lblComunicado;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(94, 115, 200, 30);
		}
		return comboBox;
	}

	private JButton getBtnEnviar() {
		if (btnEnviar == null) {
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBounds(94, 401, 184, 30);
		}
		return btnEnviar;
	}
	public void limparCampos() {
		
		}
	//carrega o combo box do grau de parentesco
		/*public void loadComboBox() {
			for(String resp : al.getWhoResp()) {
				getComboBox().addItem(resp);
			}
		}*/
	public JTextField getTextFieldAluno() {
		if (textFieldAluno == null) {
			textFieldAluno = new JTextField();
			textFieldAluno.setBackground(Color.WHITE);
			textFieldAluno.setBounds(94, 86, 200, 30);
		}
		return textFieldAluno;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBackground(Color.WHITE);
			textField.setBounds(94, 214, 477, 157);
		}
		return textField;
	}
}
