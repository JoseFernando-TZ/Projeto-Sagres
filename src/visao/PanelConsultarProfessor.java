package visao;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PanelConsultarProfessor extends JPanel{
	private JTextField txtDigiteO;

	private JLabel lblInfoPessoal;
	private JLabel lblNomeProfessor;
	private JLabel lblCpf;
	private JLabel lblDisciplinas;
	private JLabel lblRg;
	private JLabel lblInfoAcademica;
	private JLabel lblDataDeNascimento;
	private JLabel lblEndereco;
	private JLabel lblTelefone;
	private JLabel lblEmail;
	private JLabel lblFormacaoAcademica;
	
	private JLabel lblDisplayNomeProfessor;
	private JLabel lblDisplayCPFprofessor;
	private JLabel lblDisplayRGprofessor;
	private JLabel lblDataDeNascimentoProfessor;
	private JLabel lblDisplayEnderecoProfessor;
	private JLabel lblDisplayTelefoneProfessor;
	private JLabel lblDisplayEmailProfessor;
	private JLabel lblDisplayDisciplinas;
	private JLabel lblDisplayFormacao;
	private JButton btnPesquisa;
	
	public PanelConsultarProfessor(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		
		add(getLblInfoPessoal());
		add(getLblNomeProfessor());
		add(getLblCpf());
		add(getLblDisciplinas());
		add(getLblRg());
		add(getLblInfoAcademica());
		add(getLblDataDeNascimento());
		add(getLblEndereco());
		add(getLblTelefone());
		add(getLblEmail());
		add(getLblFormacaoAcademica());
		
		add(getLblDisplayNomeProfessor());
		add(getLblDisplayCPFprofessor());
		add(getLblDisplayRGprofessor());
		add(getLblDataDeNascimentoProfessor());
		add(getLblDisplayEnderecoProfessor());
		add(getLblDisplayTelefoneProfessor());
		add(getLblDisplayEmailProfessor());
		add(getLblDisplayDisciplinas());
		add(getLblDisplayFormacao());
		add(getBtnPesquisa());
		add(getTxtDigiteO());
		
		
	}
	public JLabel getLblInfoPessoal() {
		if (lblInfoPessoal == null) {
			lblInfoPessoal = new JLabel("Informações pessoais: ");
			lblInfoPessoal.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblInfoPessoal.setBounds(93, 74, 167, 18);
		}
		return lblInfoPessoal;
	}
	
	public JTextField getTxtDigiteO() {
		if(txtDigiteO == null) {
		txtDigiteO = new JTextField();
		txtDigiteO.setForeground(Color.GRAY);
		txtDigiteO.setText("digite o nome, disciplina ou cpf do professor");
		txtDigiteO.setBounds(274, 28, 213, 18);
		txtDigiteO.setColumns(10);
		}
		
		return txtDigiteO;
	}
	public JLabel getLblNomeProfessor() {
		if(lblNomeProfessor == null) {
		lblNomeProfessor = new JLabel("Nome do professor:");
		lblNomeProfessor.setBounds(94, 126, 107, 12);
		}
		return lblNomeProfessor;
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
			lblDisciplinas = new JLabel("Disciplinas que leciona:");
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
	public JLabel getLblFormacaoAcademica() {
		if(lblFormacaoAcademica == null) {
			lblFormacaoAcademica = new JLabel("Formação academica:");
			lblFormacaoAcademica.setBounds(491, 176, 107, 12);
			}
		return lblFormacaoAcademica;
	}
	
	
	
	
	
	
	
	public JLabel getLblDisplayNomeProfessor() {
		if(lblDisplayNomeProfessor == null) {
			lblDisplayNomeProfessor = new JLabel("nome");
			lblDisplayNomeProfessor.setBounds(211, 126, 107, 12);
			}
		return lblDisplayNomeProfessor;
	}
	public JLabel getLblDisplayCPFprofessor() {
		if(lblDisplayCPFprofessor == null) {
			lblDisplayCPFprofessor = new JLabel("cpf");
			lblDisplayCPFprofessor.setBounds(211, 176, 44, 12);
			}
		return lblDisplayCPFprofessor;
	}
	public JLabel getLblDisplayRGprofessor() {
		if(lblDisplayRGprofessor == null) {
			lblDisplayRGprofessor = new JLabel("Rg");
			lblDisplayRGprofessor.setBounds(211, 231, 44, 12);
			}
		return lblDisplayRGprofessor;
	}
	public JLabel getLblDataDeNascimentoProfessor() {
		if(lblDataDeNascimentoProfessor == null) {
			lblDataDeNascimentoProfessor = new JLabel("Data");
			lblDataDeNascimentoProfessor.setBounds(211, 296, 44, 12);
			}
		return lblDataDeNascimentoProfessor;
	}
	public JLabel getLblDisplayEnderecoProfessor() {
		if(lblDisplayEnderecoProfessor == null) {
			lblDisplayEnderecoProfessor = new JLabel("Endereco");
			lblDisplayEnderecoProfessor.setBounds(211, 365, 44, 12);
			}
		return lblDisplayEnderecoProfessor;
	}
	public JLabel getLblDisplayTelefoneProfessor() {
		if(lblDisplayTelefoneProfessor == null) {
			lblDisplayTelefoneProfessor = new JLabel("telefone");
			lblDisplayTelefoneProfessor.setBounds(211, 432, 44, 12);
			}
		return lblDisplayTelefoneProfessor;
	}
	public JLabel getLblDisplayEmailProfessor() {
		if(lblDisplayEmailProfessor == null) {
			lblDisplayEmailProfessor = new JLabel("email");
			lblDisplayEmailProfessor.setBounds(211, 486, 44, 12);
			}
		return lblDisplayEmailProfessor;
	}
	public JLabel getLblDisplayDisciplinas() {
		if(lblDisplayDisciplinas == null) {
			lblDisplayDisciplinas = new JLabel("disciplina");
			lblDisplayDisciplinas.setBounds(639, 126, 44, 12);
			}
		return lblDisplayDisciplinas;
	}
	public JLabel getLblDisplayFormacao() {
		if(lblDisplayFormacao == null) {
			lblDisplayFormacao = new JLabel("formacoes");
			lblDisplayFormacao.setBounds(639, 176, 61, 12);
			}
		return lblDisplayFormacao;
	}
	public JButton getBtnPesquisa() {
		if(btnPesquisa == null) {
			btnPesquisa = new JButton("Pesquisar");
			btnPesquisa.setBounds(497, 27, 84, 20);
			
			}
		return btnPesquisa;
	}
	
}
