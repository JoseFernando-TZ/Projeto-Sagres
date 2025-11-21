package visao;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConsultarProfessor extends JPanel{
	private JTextField txtDigiteO;
	private JButton btnPesquisa;
	private JButton btnVerInfoPessoalProf;
	private JButton btnVerInfoAcademicaProf;
	
	public PanelConsultarProfessor(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnPesquisa());
		add(getTxtDigiteO());
		add(getBtnVerInfoPessoalProf());
		add(getBtnVerInfoAcademicaProf());
		
		
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
	public JButton getBtnPesquisa() {
		if(btnPesquisa == null) {
			btnPesquisa = new JButton("Pesquisar");
			btnPesquisa.setBounds(497, 27, 84, 20);
			
			}
		return btnPesquisa;
	}
	
	public JButton getBtnVerInfoPessoalProf() {
		if (btnVerInfoPessoalProf == null) {
			btnVerInfoPessoalProf = new JButton("ver info pessoal");
			btnVerInfoPessoalProf.setBounds(117, 116, 139, 20);
		}
		return btnVerInfoPessoalProf;
	}
	public JButton getBtnVerInfoAcademicaProf() {
		if (btnVerInfoAcademicaProf == null) {
			btnVerInfoAcademicaProf = new JButton("ver info academica");
			btnVerInfoAcademicaProf.setBounds(497, 116, 139, 20);
		}
		return btnVerInfoAcademicaProf;
	}
}

