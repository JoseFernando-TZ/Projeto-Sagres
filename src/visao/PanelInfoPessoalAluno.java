package visao;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PanelInfoPessoalAluno extends JPanel {
	private JLabel lblNomeAluno;
	private JLabel lblMostrarNomeAluno;
	private JLabel lblCpfAluno;
	private JLabel lblMostrarCpfAluno;
	private JLabel lblRgAluno;
	private JLabel lblMostrarRgAluno;
	private JLabel lblEnderecoAluno;
	private JLabel lblMostrarEnderecoAluno;
	private JLabel lblTelefoneAluno;
	private JLabel lblMostrarTelefoneAluno;
	private JLabel lblEmailAluno;
	private JLabel lblMostrarEmailAluno;
	private JLabel lblNomeDosPais;
	private JLabel lblMostrarNomeDosPais;
	private JButton btnEditar;
	PanelInfoPessoalAluno(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getLblNomeAluno());
		add(getLblMostrarNomeAluno());
		add(getLblCpfAluno());
		add(getLblMostrarCpfAluno());
		add(getLblRgAluno());
		add(getLblMostrarRgAluno());
		add(getLblEnderecoAluno());
		add(getLblMostrarEnderecoAluno());
		add(getLblTelefoneAluno());
		add(getLblMostrarTelefoneAluno());
		add(getLblEmailAluno());
		add(getLblMostrarEmailAluno());
		add(getLblNomeDosPais());
		add(getLblMostrarNomeDosPais());
		add(getBtnEditar());
	}
	public JLabel getLblNomeAluno() {
		if (lblNomeAluno == null) {
			lblNomeAluno = new JLabel("Nome do aluno:");
			lblNomeAluno.setBounds(92, 68, 84, 12);
		}
		return lblNomeAluno;
	}
	public JLabel getLblMostrarNomeAluno() {
		if (lblMostrarNomeAluno == null) {
			lblMostrarNomeAluno = new JLabel("nome");
			lblMostrarNomeAluno.setBounds(186, 68, 44, 12);
		}
		return lblMostrarNomeAluno;
	}
	public JLabel getLblCpfAluno() {
		if (lblCpfAluno == null) {
			lblCpfAluno = new JLabel("Cpf:");
			lblCpfAluno.setBounds(92, 112, 44, 12);
		}
		return lblCpfAluno;
	}
	public JLabel getLblMostrarCpfAluno() {
		if (lblMostrarCpfAluno == null) {
			lblMostrarCpfAluno = new JLabel("cpf");
			lblMostrarCpfAluno.setBounds(186, 112, 44, 12);
		}
		return lblMostrarCpfAluno;
	}
	public JLabel getLblRgAluno() {
		if (lblRgAluno == null) {
			lblRgAluno = new JLabel("RG:");
			lblRgAluno.setBounds(92, 157, 44, 12);
		}
		return lblRgAluno;
	}
	public JLabel getLblMostrarRgAluno() {
		if (lblMostrarRgAluno == null) {
			lblMostrarRgAluno = new JLabel("rg");
			lblMostrarRgAluno.setBounds(186, 157, 44, 12);
		}
		return lblMostrarRgAluno;
	}
	public JLabel getLblEnderecoAluno() {
		if (lblEnderecoAluno == null) {
			lblEnderecoAluno = new JLabel("Endereço:");
			lblEnderecoAluno.setBounds(92, 211, 68, 12);
		}
		return lblEnderecoAluno;
	}
	public JLabel getLblMostrarEnderecoAluno() {
		if (lblMostrarEnderecoAluno == null) {
			lblMostrarEnderecoAluno = new JLabel("endereço");
			lblMostrarEnderecoAluno.setBounds(186, 211, 68, 12);
		}
		return lblMostrarEnderecoAluno;
	}
	public JLabel getLblTelefoneAluno() {
		if (lblTelefoneAluno == null) {
			lblTelefoneAluno = new JLabel("telefone:");
			lblTelefoneAluno.setBounds(486, 68, 84, 12);
		}
		return lblTelefoneAluno;
	}
	public JLabel getLblMostrarTelefoneAluno() {
		if (lblMostrarTelefoneAluno == null) {
			lblMostrarTelefoneAluno = new JLabel("telefone");
			lblMostrarTelefoneAluno.setBounds(580, 68, 44, 12);
		}
		return lblMostrarTelefoneAluno;
	}
	public JLabel getLblEmailAluno() {
		if (lblEmailAluno == null) {
			lblEmailAluno = new JLabel("email:");
			lblEmailAluno.setBounds(486, 112, 84, 12);
		}
		return lblEmailAluno;
	}
	public JLabel getLblMostrarEmailAluno() {
		if (lblMostrarEmailAluno == null) {
			lblMostrarEmailAluno = new JLabel("email");
			lblMostrarEmailAluno.setBounds(580, 112, 84, 12);
		}
		return lblMostrarEmailAluno;
	}
	public JLabel getLblNomeDosPais() {
		if (lblNomeDosPais == null) {
			lblNomeDosPais = new JLabel("Nome dos pais:");
			lblNomeDosPais.setBounds(486, 157, 84, 12);
		}
		return lblNomeDosPais;
	}
	public JLabel getLblMostrarNomeDosPais() {
		if (lblMostrarNomeDosPais == null) {
			lblMostrarNomeDosPais = new JLabel("nome dos pais");
			lblMostrarNomeDosPais.setBounds(580, 157, 84, 12);
		}
		return lblMostrarNomeDosPais;
	}
	public JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("editar informações");
			btnEditar.setBounds(92, 348, 119, 20);
		}
		return btnEditar;
	}
}
