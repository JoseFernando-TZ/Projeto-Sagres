package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelConsultarDisciplina extends JPanel{
	private JTextField txtDigiteDisciplina;
	private JButton btnPesquisa;
	private JButton btnVerInfoPessoal;
	private JButton btnVerConteudoProgramatico;
	private JButton btnExcluir;
	
	public PanelConsultarDisciplina(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnPesquisa());
		add(getTxtDigiteDisciplina());
		add(getBtnVerInfoPessoal());
		add(getBtnVerConteudoProgramatico());
		add(getBtnExcluir());
		
		
	}
	
	public JTextField getTxtDigiteDisciplina() {
		if(txtDigiteDisciplina == null) {
		txtDigiteDisciplina = new JTextField();
		txtDigiteDisciplina.setText("digite o nome ou código ");
		txtDigiteDisciplina.setForeground(Color.GRAY);
		txtDigiteDisciplina.setBounds(274, 28, 213, 18);
		txtDigiteDisciplina.setColumns(10);
		}
		
		return txtDigiteDisciplina;
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
			btnVerInfoPessoal = new JButton("ver info da disciplina");
			btnVerInfoPessoal.setBounds(117, 116, 139, 20);
		}
		return btnVerInfoPessoal;
	}
	public JButton getBtnVerConteudoProgramatico() {
		if (btnVerConteudoProgramatico == null) {
			btnVerConteudoProgramatico = new JButton("ver conteudo programatico");
			btnVerConteudoProgramatico.setBounds(497, 116, 139, 20);
		}
		return btnVerConteudoProgramatico;
	}
	public JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("excluir");
			btnExcluir.setBounds(117, 392, 139, 20);
		}
		return btnExcluir;
	}

}
