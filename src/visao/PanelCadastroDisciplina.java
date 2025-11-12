package visao;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelCadastroDisciplina extends JPanel{
	private JButton buttonCadastrarDisciplina;
	private JButton btnLimparDisciplina;
	private JTextField textFieldNomeDisciplina;
	private JTextField textFieldCodigoDisciplina;
	private JTextField textFieldCargaHorariaDisciplina;
	private JTextField textFieldDescricaoDisciplina;
	private JLabel lblNomeDisciplina;
	private JLabel lblCargaHorariaDisciplina;
	private JLabel lblCodigoDisciplina;
	private JLabel lblDescricaoDisciplina;

	public PanelCadastroDisciplina(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getBtnLimparDisciplina());
		this.add(getButtonCadastrarDisciplina());
		this.add(getTextFieldNomeDisciplina());
		this.add(getTextFieldCodigoDisciplina());
		this.add(getTextFieldCargaHorariaDisciplina());
		add(getTextFieldDescricaoDisciplina());
		add(getLblNomeDisciplina());
		add(getLblCargaHorariaDisciplina());
		add(getLblCodigoDisciplina());
		add(getLblDescricaoDisciplina());
		
	}
	

	public JButton getButtonCadastrarDisciplina() {
		if(buttonCadastrarDisciplina == null) {
			buttonCadastrarDisciplina = new JButton();
			buttonCadastrarDisciplina.setText("Cadastrar");
			buttonCadastrarDisciplina.setBounds(450, 615, 200, 30);
		}	
		return buttonCadastrarDisciplina;
	}
	public JButton getBtnLimparDisciplina() {
		if (btnLimparDisciplina == null) {
			btnLimparDisciplina = new JButton();
			btnLimparDisciplina.setText("Limpar");
			btnLimparDisciplina.setBounds(245, 317, 200, 30);
		}
		return btnLimparDisciplina;
	}
	
	public JTextField getTextFieldNomeDisciplina() {
		if(textFieldNomeDisciplina == null) {
			textFieldNomeDisciplina = new JTextField();
			textFieldNomeDisciplina.setBounds(105, 59, 200, 30);
		}	
		return textFieldNomeDisciplina;
	}
	
	public JTextField getTextFieldCodigoDisciplina() {
		if(textFieldCodigoDisciplina == null) {
			textFieldCodigoDisciplina = new JTextField();
			textFieldCodigoDisciplina.setBounds(410, 59, 211, 30);
		}	
		return textFieldCodigoDisciplina;
	}

	public JTextField getTextFieldCargaHorariaDisciplina() {
		if(textFieldCargaHorariaDisciplina == null) {
			textFieldCargaHorariaDisciplina = new JTextField();
			textFieldCargaHorariaDisciplina.setBounds(105, 101, 200, 30);
	}	
		return textFieldCargaHorariaDisciplina;
}
	  
	private JTextField getTextFieldDescricaoDisciplina() {
		if (textFieldDescricaoDisciplina == null) {
			textFieldDescricaoDisciplina = new JTextField();
			textFieldDescricaoDisciplina.setBounds(105, 181, 305, 109);
			textFieldDescricaoDisciplina.setColumns(10);
		}
		return textFieldDescricaoDisciplina;
	}
	
	private JLabel getLblNomeDisciplina() {
		if (lblNomeDisciplina == null) {
			lblNomeDisciplina = new JLabel("Nome da Disciplina:");;
			lblNomeDisciplina.setBounds(10, 67, 109, 12);
			
		}
		return lblNomeDisciplina;
	}
	
	private JLabel getLblCargaHorariaDisciplina() {
		if (lblCargaHorariaDisciplina == null) {
			lblCargaHorariaDisciplina = new JLabel("Carga horaria:");
			lblCargaHorariaDisciplina.setBounds(10, 109, 85, 12);
			
		}
		return lblCargaHorariaDisciplina;
	}
	
	private JLabel getLblCodigoDisciplina() {
		if (lblCodigoDisciplina == null) {
			lblCodigoDisciplina = new JLabel("Codigo:");
			lblCodigoDisciplina.setBounds(315, 67, 44, 12);
			
		}
		return lblCodigoDisciplina;
	}
	private JLabel getLblDescricaoDisciplina() {
		if (lblDescricaoDisciplina == null) {
			lblDescricaoDisciplina = new JLabel("Descrição");
			lblDescricaoDisciplina.setBounds(10, 229, 44, 12);
			
		}
		return lblDescricaoDisciplina;
	
}
}
