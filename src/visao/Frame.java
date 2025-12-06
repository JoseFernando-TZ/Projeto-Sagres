package visao;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import java.awt.Toolkit;
import java.awt.Color;


public class Frame extends JFrame {

	JMenuBar menuBar;
	JMenu menuCadastrar;
	JMenu menuConsultar;
	JMenu menuFinanceiro;
	JMenu menuContato;
	JMenuItem itemCadastroAluno;
	JMenuItem itemCadastroProfessor;
	JMenuItem itemCadastroDisciplina;
	private JMenuItem itemConsultarAluno;
	private JMenuItem itemConsultarProfessor;
	JMenuItem itemMensalidades;
	JMenuItem itemReceitasDespesas;
	JMenuItem itemFluxo;
	JMenuItem itemContas;
	
	
	public Frame(){
		super("Sagres");
		setBackground(new Color(240, 255, 255));
		getContentPane().setBackground(new Color(244, 251, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Imagens\\unnamed.png"));
		this.setVisible(true);
		this.setSize(800, 750);
		menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(60, 167, 255));
		menuBar.add(getMenuCadastrar());
		menuBar.add(getMenuConsultar());
		menuBar.add(getMenuFinanceiro());
		menuBar.add(getMenuContato());
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	
	public JMenu getMenuCadastrar(){
		if(menuCadastrar == null) {
			menuCadastrar = new JMenu();
			menuCadastrar.setForeground(new Color(255, 255, 255));
			menuCadastrar.setText("Cadastrar");
			menuCadastrar.add(getItemCadastroAluno());
			menuCadastrar.add(getItemCadastroProfessor());
			menuCadastrar.add(getItemCadastroDisciplina());
		}	
		return menuCadastrar;
	}
	public JMenu getMenuConsultar(){
		if(menuConsultar == null) {
			menuConsultar = new JMenu();
			menuConsultar.setForeground(new Color(255, 255, 255));
			menuConsultar.setText("Consultar");
			menuConsultar.add(getItemConsultarAluno());
			menuConsultar.add(getItemConsultarProfessor());
		}	
		return menuConsultar;
	}
	public JMenu getMenuFinanceiro() {
		if(menuFinanceiro == null) {
			menuFinanceiro = new JMenu();
			menuFinanceiro.setForeground(new Color(255, 255, 255));
			menuFinanceiro.setText("Financeiro");
			menuFinanceiro.add(getItemMensalidades());
			menuFinanceiro.add(getItemReceitasDespesas());
			menuFinanceiro.add(getItemFluxo());
			menuFinanceiro.add(getItemContas());
		}
		return menuFinanceiro;
	}
	
	public JMenu getMenuContato() {
		if(menuContato == null) {
			menuContato = new JMenu();
			menuContato.setForeground(new Color(255, 255, 255));
			menuContato.setText("contato");
			
		}
		return menuContato;
	}
	
	public JMenuItem getItemCadastroAluno(){
		if(itemCadastroAluno == null) {
			itemCadastroAluno = new JMenuItem();
			itemCadastroAluno.setText("Aluno");
		}	
		return itemCadastroAluno;
	}
	
	public JMenuItem getItemCadastroProfessor(){
		if(itemCadastroProfessor == null) {
			itemCadastroProfessor = new JMenuItem();
			itemCadastroProfessor.setText("Professor");
		}	
		return itemCadastroProfessor;
	}
	
	public JMenuItem getItemCadastroDisciplina(){
		if(itemCadastroDisciplina == null) {
			itemCadastroDisciplina = new JMenuItem();
			itemCadastroDisciplina.setText("Disciplina");
		}	
		return itemCadastroDisciplina;
	}
	
	
	public JMenuItem getItemConsultarAluno() {
		if (itemConsultarAluno == null) {
			itemConsultarAluno = new JMenuItem("Aluno");
		}
		return itemConsultarAluno;
	}
	public JMenuItem getItemConsultarProfessor() {
		if (itemConsultarProfessor == null) {
			itemConsultarProfessor = new JMenuItem("Professor");
		}
		return itemConsultarProfessor;
	}
	public JMenuItem getItemMensalidades() {
		if(itemMensalidades == null) {
			itemMensalidades = new JMenuItem("mensalidades");
		}
		return itemMensalidades;
	}


	public JMenuItem getItemReceitasDespesas() {
		if(itemReceitasDespesas == null) {
		itemReceitasDespesas = new JMenuItem("despesas");
		}
		return itemReceitasDespesas;
	}

	public JMenuItem getItemFluxo() {
		if(itemFluxo == null) {
		itemFluxo = new JMenuItem("fluxos/relatórios");
		}
		return itemFluxo;
	}

	public JMenuItem getItemContas() {
		if(itemContas == null) {
			itemContas = new JMenuItem("Contas");
			}
		return itemContas;
	}
	
}
