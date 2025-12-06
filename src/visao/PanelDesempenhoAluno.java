package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDesempenhoAluno extends JPanel{
	private JButton btnVerNotas;
	private JButton btnVerFrequencia;
	private JButton btnVerHistórico;
	private JButton btnBoletim;
	private JButton btnExcluir;
	
	public PanelDesempenhoAluno(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getBtnVerNotas());
		add(getBtnVerFrequencia());
		add(getBtnVerHistórico());
		add(getBtnBoletim());
		add(getBtnExcluir());
		
		
	}
	public JButton getBtnVerNotas() {
		if (btnVerNotas == null) {
			btnVerNotas = new JButton("ver notas");
			btnVerNotas.setBounds(117, 116, 139, 20);
		}
		return btnVerNotas;
	}
	public JButton getBtnVerFrequencia() {
		if (btnVerFrequencia == null) {
			btnVerFrequencia = new JButton("ver frequência ");
			btnVerFrequencia.setBounds(497, 116, 139, 20);
		}
		return btnVerFrequencia;
	}
	public JButton getBtnVerHistórico() {
		if (btnVerHistórico == null) {
			btnVerHistórico = new JButton("ver histórico");
			btnVerHistórico.setBounds(117, 212, 139, 20);
		}
		return btnVerHistórico;
	}
	public JButton getBtnBoletim() {
		if (btnBoletim == null) {
			btnBoletim = new JButton("Boletim");
			btnBoletim.setBounds(497, 212, 139, 20);
		}
		return btnBoletim;
	}
	public JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("excluir");
			btnExcluir.setBounds(117, 392, 139, 20);
		}
		return btnExcluir;
	}
}
