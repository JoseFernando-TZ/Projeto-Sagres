package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PanelConsultarAluno extends JPanel{
	private JTextField txtDigiteAluno;
	private JButton btnPesquisa;
	private JButton btnVerInfoPessoal;
	private JButton btnVerInfoAcademica;
	private JButton btnVerMensalidades;
	private JButton btnVerDesempenho;
	private JButton btnExcluir;
	
	public PanelConsultarAluno(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnPesquisa());
		add(getTxtDigiteAluno());
		add(getBtnVerInfoPessoal());
		add(getBtnVerInfoAcademica());
		add(getBtnVerMensalidades());
		add(getBtnVerDesempenho());
		add(getBtnExcluir());
		
		
	}
	
	public JTextField getTxtDigiteAluno() {
		if(txtDigiteAluno == null) {
		txtDigiteAluno = new JTextField();
		txtDigiteAluno.setForeground(Color.GRAY);
		txtDigiteAluno.setText("digite o nome, CPF, série, ou ano do aluno");
		txtDigiteAluno.setBounds(274, 28, 213, 18);
		txtDigiteAluno.setColumns(10);
		}
		
		return txtDigiteAluno;
	}
	public JButton getBtnPesquisa() {
		if(btnPesquisa == null) {
			btnPesquisa = new JButton("Pesquisar");
			btnPesquisa.setBounds(497, 27, 84, 20);
			
			}
		return btnPesquisa;
	}
	public JButton getBtnVerInfoPessoal() {
		if (btnVerInfoPessoal == null) {
			btnVerInfoPessoal = new JButton("ver info pessoal");
			btnVerInfoPessoal.setBounds(117, 116, 139, 20);
		}
		return btnVerInfoPessoal;
	}
	public JButton getBtnVerInfoAcademica() {
		if (btnVerInfoAcademica == null) {
			btnVerInfoAcademica = new JButton("ver info academica");
			btnVerInfoAcademica.setBounds(497, 116, 139, 20);
		}
		return btnVerInfoAcademica;
	}
	public JButton getBtnVerMensalidades() {
		if (btnVerMensalidades == null) {
			btnVerMensalidades = new JButton("ver mensalidades");
			btnVerMensalidades.setBounds(117, 212, 139, 20);
		}
		return btnVerMensalidades;
	}
	public JButton getBtnVerDesempenho() {
		if (btnVerDesempenho == null) {
			btnVerDesempenho = new JButton("ver desempenho");
			btnVerDesempenho.setBounds(497, 212, 139, 20);
		}
		return btnVerDesempenho;
	}
	public JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("excluir");
			btnExcluir.setBounds(117, 392, 139, 20);
		}
		return btnExcluir;
	}
}
