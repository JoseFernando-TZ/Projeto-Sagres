package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelConsultarAluno extends JPanel{
	private JTextField txtDigiteAluno;

	private JLabel lblInfoPessoal;
	private JLabel lblNomeAluno;
	private JLabel lblCpf;
	private JLabel lblDisciplinas;
	private JLabel lblRg;
	private JLabel lblInfoAcademica;
	private JLabel lblDataDeNascimento;
	private JLabel lblEndereco;
	private JLabel lblTelefone;
	private JLabel lblEmail;
	
	private JLabel lblDisplayNomeAluno;
	private JLabel lblDisplayCPFaluno;
	private JLabel lblDisplayRGaluno;
	private JLabel lblDataDeNascimentoAluno;
	private JLabel lblDisplayEnderecoAluno;
	private JLabel lblDisplayTelefoneAluno;
	private JLabel lblDisplayEmailAluno;
	private JLabel lblDisplayDisciplinas;
	private JButton btnPesquisa;
	
	public PanelConsultarAluno(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		
		add(getLblInfoPessoal());
		add(getLblNomeAluno());
		add(getLblCpf());
		add(getLblDisciplinas());
		add(getLblRg());
		add(getLblInfoAcademica());
		add(getLblDataDeNascimento());
		add(getLblEndereco());
		add(getLblTelefone());
		add(getLblEmail());
		
		add(getLblDisplayNomeAluno());
		add(getLblDisplayCPFaluno());
		add(getLblDisplayRGaluno());
		add(getLblDataDeNascimentoAluno());
		add(getLblDisplayEnderecoAluno());
		add(getLblDisplayTelefoneAluno());
		add(getLblDisplayEmailAluno());
		add(getLblDisplayDisciplinas());
		add(getBtnPesquisa());
		add(getTxtDigiteAluno());
		
		
	}
	public JLabel getLblInfoPessoal() {
		if (lblInfoPessoal == null) {
			lblInfoPessoal = new JLabel("Informações pessoais: ");
			lblInfoPessoal.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblInfoPessoal.setBounds(93, 74, 167, 18);
		}
		return lblInfoPessoal;
	}
	
	public JTextField getTxtDigiteAluno() {
		if(txtDigiteAluno == null) {
		txtDigiteAluno = new JTextField();
		txtDigiteAluno.setForeground(Color.GRAY);
		txtDigiteAluno.setText("digite o nome, disciplina ou cpf do professor");
		txtDigiteAluno.setBounds(274, 28, 213, 18);
		txtDigiteAluno.setColumns(10);
		}
		
		return txtDigiteAluno;
	}
	public JLabel getLblNomeAluno() {
		if(lblNomeAluno == null) {
		lblNomeAluno = new JLabel("Nome do aluno:");
		lblNomeAluno.setBounds(94, 126, 107, 12);
		}
		return lblNomeAluno;
	}
	public JLabel getLblCpf() {
		if(lblCpf == null) {
			lblCpf = new JLabel("CPF:");
			lblCpf.setBounds(93, 176, 44, 12);
			}
		return lblCpf;
	}
	public JLabel getLblDisciplinas() {
		if(lblDisciplinas == null) {
			lblDisciplinas = new JLabel("Disciplinas:");
			lblDisciplinas.setBounds(491, 126, 107, 12);
			}
		return lblDisciplinas;
	}
	public JLabel getLblRg() {
		if(lblRg == null) {
			lblRg = new JLabel("RG:");
			lblRg.setBounds(93, 231, 77, 12);
			}
		return lblRg;
	}
	public JLabel getLblInfoAcademica() {
		if(lblInfoAcademica == null) {
			lblInfoAcademica = new JLabel("Informações academicas: ");
			lblInfoAcademica.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblInfoAcademica.setBounds(491, 74, 167, 18);
			}
		return lblInfoAcademica;
	}
	public JLabel getLblDataDeNascimento() {
		if(lblDataDeNascimento == null) {
			lblDataDeNascimento = new JLabel("Data de nascimento:");
			lblDataDeNascimento.setBounds(93, 296, 108, 12);
			}
		return lblDataDeNascimento;
	}
	public JLabel getLblEndereco() {
		if(lblEndereco == null) {
			
		    lblEndereco = new JLabel("Endereço:");
			lblEndereco.setBounds(93, 365, 61, 12);
			
			}
		return lblEndereco;
	}
	public JLabel getLblTelefone() {
		if(lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setBounds(93, 432, 44, 12);
			}
		return lblTelefone;
	}
	public JLabel getLblEmail() {
		if(lblEmail == null) {
			lblEmail = new JLabel("Email:");
			lblEmail.setBounds(93, 486, 44, 12);
			}
		return lblEmail;
	}
	
	
	
	
	
	
	
	public JLabel getLblDisplayNomeAluno() {
		if(lblDisplayNomeAluno == null) {
			lblDisplayNomeAluno = new JLabel("nome");
			lblDisplayNomeAluno.setBounds(211, 126, 107, 12);
			}
		return lblDisplayNomeAluno;
	}
	public JLabel getLblDisplayCPFaluno() {
		if(lblDisplayCPFaluno == null) {
			lblDisplayCPFaluno = new JLabel("cpf");
			lblDisplayCPFaluno.setBounds(211, 176, 44, 12);
			}
		return lblDisplayCPFaluno;
	}
	public JLabel getLblDisplayRGaluno() {
		if(lblDisplayRGaluno == null) {
			lblDisplayRGaluno = new JLabel("Rg");
			lblDisplayRGaluno.setBounds(211, 231, 44, 12);
			}
		return lblDisplayRGaluno;
	}
	public JLabel getLblDataDeNascimentoAluno() {
		if(lblDataDeNascimentoAluno == null) {
			lblDataDeNascimentoAluno = new JLabel("Data");
			lblDataDeNascimentoAluno.setBounds(211, 296, 44, 12);
			}
		return lblDataDeNascimentoAluno;
	}
	public JLabel getLblDisplayEnderecoAluno() {
		if(lblDisplayEnderecoAluno == null) {
			lblDisplayEnderecoAluno = new JLabel("Endereco");
			lblDisplayEnderecoAluno.setBounds(211, 365, 44, 12);
			}
		return lblDisplayEnderecoAluno;
	}
	public JLabel getLblDisplayTelefoneAluno() {
		if(lblDisplayTelefoneAluno == null) {
			lblDisplayTelefoneAluno = new JLabel("telefone");
			lblDisplayTelefoneAluno.setBounds(211, 432, 44, 12);
			}
		return lblDisplayTelefoneAluno;
	}
	public JLabel getLblDisplayEmailAluno() {
		if(lblDisplayEmailAluno == null) {
			lblDisplayEmailAluno = new JLabel("email");
			lblDisplayEmailAluno.setBounds(211, 486, 44, 12);
			}
		return lblDisplayEmailAluno;
	}
	public JLabel getLblDisplayDisciplinas() {
		if(lblDisplayDisciplinas == null) {
			lblDisplayDisciplinas = new JLabel("disciplina");
			lblDisplayDisciplinas.setBounds(639, 126, 44, 12);
			}
		return lblDisplayDisciplinas;
	}
	public JButton getBtnPesquisa() {
		if(btnPesquisa == null) {
			btnPesquisa = new JButton("Pesquisar");
			btnPesquisa.setBounds(497, 27, 84, 20);
			
			}
		return btnPesquisa;
	}
}
