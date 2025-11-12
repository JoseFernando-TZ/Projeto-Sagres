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
	JMenuItem itemCadastroAluno;
	JMenuItem itemCadastroProfessor;
	JMenuItem itemCadastroDisciplina;
	
	
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
		}	
		return menuConsultar;
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
	
	
}
