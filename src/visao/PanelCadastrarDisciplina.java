package visao;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PanelCadastrarDisciplina extends JPanel{
	private JButton buttonCadastrarDisciplina;
	private JButton btnLimparDisciplina;
	private JTextField textFieldNomeDisciplina;
	private JTextField textFieldCargaHorariaDisciplina;
	private JLabel lblNomeDisciplina;
	private JLabel lblCargaHorariaDisciplina;
	private JLabel lblDescricaoDisciplina;
	private JTextArea textArea;
	private JButton btnCadastrar;

	public PanelCadastrarDisciplina(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		this.add(getBtnLimparDisciplina());
		this.add(getButtonCadastrarDisciplina());
		this.add(getTextFieldNomeDisciplina());
		this.add(getTextFieldCargaHorariaDisciplina());
		add(getLblNomeDisciplina());
		add(getLblCargaHorariaDisciplina());
		add(getLblDescricaoDisciplina());
		add(getTextArea());
		add(getBtnCadastrar());
		
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
			btnLimparDisciplina.setBounds(245, 382, 200, 30);
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

	public JTextField getTextFieldCargaHorariaDisciplina() {
		if(textFieldCargaHorariaDisciplina == null) {
			textFieldCargaHorariaDisciplina = new JTextField();
			textFieldCargaHorariaDisciplina.setBounds(105, 101, 200, 30);
	}	
		return textFieldCargaHorariaDisciplina;
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
	private JLabel getLblDescricaoDisciplina() {
		if (lblDescricaoDisciplina == null) {
			lblDescricaoDisciplina = new JLabel("Descrição:");
			lblDescricaoDisciplina.setBounds(10, 195, 85, 12);
			
		}
		return lblDescricaoDisciplina;
	
}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(105, 177, 378, 105);
		}
		return textArea;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("Cadastrar");
			btnCadastrar.setBounds(245, 329, 200, 30);
		}
		return btnCadastrar;
	}
}
