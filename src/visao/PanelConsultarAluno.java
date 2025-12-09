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
import javax.swing.JComboBox;

public class PanelConsultarAluno extends JPanel{
	private JTextField txtDigiteAluno;
	private JButton btnPesquisa;
	private JButton btnVerInfoPessoal;
	private JButton btnVerInfoAcademica;
	private JButton btnVerMensalidades;
	private JButton btnVerDesempenho;
	private JButton btnExcluir;
	private JComboBox comboBox;
	
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
		add(getComboBox());
		
		
	}
	
	public JTextField getTxtDigiteAluno() {
		if(txtDigiteAluno == null) {
		txtDigiteAluno = new JTextField();
		txtDigiteAluno.setToolTipText("Digite aqui o nome do Aluno, CPF, ou numero de matrícula");
		txtDigiteAluno.setForeground(Color.GRAY);
		txtDigiteAluno.setBounds(250, 28, 227, 29);
		txtDigiteAluno.setColumns(10);
		}
		
		return txtDigiteAluno;
	}
	public JButton getBtnPesquisa() {
		if(btnPesquisa == null) {
			btnPesquisa = new JButton("Pesquisar");
			btnPesquisa.setBounds(497, 28, 139, 29);
			
			}
		return btnPesquisa;
	}
	public JButton getBtnVerInfoPessoal() {
		if (btnVerInfoPessoal == null) {
			btnVerInfoPessoal = new JButton("ver info pessoal");
			btnVerInfoPessoal.setBounds(497, 156, 139, 29);
		}
		return btnVerInfoPessoal;
	}
	public JButton getBtnVerInfoAcademica() {
		if (btnVerInfoAcademica == null) {
			btnVerInfoAcademica = new JButton("ver info academica");
			btnVerInfoAcademica.setBounds(497, 116, 139, 29);
		}
		return btnVerInfoAcademica;
	}
	public JButton getBtnVerMensalidades() {
		if (btnVerMensalidades == null) {
			btnVerMensalidades = new JButton("ver mensalidades");
			btnVerMensalidades.setBounds(497, 252, 139, 29);
		}
		return btnVerMensalidades;
	}
	public JButton getBtnVerDesempenho() {
		if (btnVerDesempenho == null) {
			btnVerDesempenho = new JButton("ver desempenho");
			btnVerDesempenho.setBounds(497, 212, 139, 29);
		}
		return btnVerDesempenho;
	}
	public JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("excluir");
			btnExcluir.setBounds(117, 383, 139, 29);
		}
		return btnExcluir;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(250, 69, 227, 29);
		}
		return comboBox;
	}
	
	
}
