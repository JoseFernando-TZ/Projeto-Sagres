package visao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInfoAcademicoAluno extends JPanel{
	private JLabel lblNomeAluno;
	private JLabel lblMostrarNomeAluno;
	private JLabel lblSerieAluno;
	private JLabel lblMostrarSerieAluno;
	private JLabel lblTurma;
	private JLabel lblMostrarTurmaAluno;
	private JLabel lblDisciplinasAluno;
	private JLabel lblMostrarDisciplinasAluno;
	private JButton btnEditar;
	PanelInfoAcademicoAluno(){
		super();
		this.setLayout(null);
		this.setBackground(new Color(244, 251, 255));
		add(getLblNomeAluno());
		add(getLblMostrarNomeAluno());
		add(getLblSerieAluno());
		add(getLblMostrarSerieAluno());
		add(getLblTurma());
		add(getLblMostrarTurmaAluno());
		add(getLblDisciplinasAluno());
		add(getLblMostrarDisciplinasAluno());
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
	public JLabel getLblSerieAluno() {
		if (lblSerieAluno == null) {
			lblSerieAluno = new JLabel("Série:");
			lblSerieAluno.setBounds(92, 112, 44, 12);
		}
		return lblSerieAluno;
	}
	public JLabel getLblMostrarSerieAluno() {
		if (lblMostrarSerieAluno == null) {
			lblMostrarSerieAluno = new JLabel("série");
			lblMostrarSerieAluno.setBounds(186, 112, 44, 12);
		}
		return lblMostrarSerieAluno;
	}
	public JLabel getLblTurma() {
		if (lblTurma == null) {
			lblTurma = new JLabel("Turma:");
			lblTurma.setBounds(92, 157, 44, 12);
		}
		return lblTurma;
	}
	public JLabel getLblMostrarTurmaAluno() {
		if (lblMostrarTurmaAluno == null) {
			lblMostrarTurmaAluno = new JLabel("turma");
			lblMostrarTurmaAluno.setBounds(186, 157, 44, 12);
		}
		return lblMostrarTurmaAluno;
	}
	public JLabel getLblDisciplinasAluno() {
		if (lblDisciplinasAluno == null) {
			lblDisciplinasAluno = new JLabel("Disciplinas:");
			lblDisciplinasAluno.setBounds(92, 211, 68, 12);
		}
		return lblDisciplinasAluno;
	}
	public JLabel getLblMostrarDisciplinasAluno() {
		if (lblMostrarDisciplinasAluno == null) {
			lblMostrarDisciplinasAluno = new JLabel("disciplinas");
			lblMostrarDisciplinasAluno.setBounds(186, 211, 68, 12);
		}
		return lblMostrarDisciplinasAluno;
	}
	public JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("editar informações");
			btnEditar.setBounds(92, 348, 119, 20);
		}
		return btnEditar;
	}

}
