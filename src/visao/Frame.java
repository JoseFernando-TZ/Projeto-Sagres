package visao;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Toolkit;


public class Frame extends JFrame {

	JMenuBar menuBar;
	JMenu menuCadastrar;
	JMenu menuConsultar;
	JMenuItem itemCadastroAluno;
	JMenuItem itemCadastroProfessor;
	
	
	public Frame(){
		super("Sagres");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\musicas\\sagres\\Imagens\\unnamed.png"));
		this.setVisible(true);
		this.setSize(800, 600);
		menuBar = new JMenuBar();
		menuBar.add(getMenuCadastrar());
		menuBar.add(getMenuConsultar());
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	
	
	public JMenu getMenuCadastrar(){
		if(menuCadastrar == null) {
			menuCadastrar = new JMenu();
			menuCadastrar.setText("Cadastrar");
			menuCadastrar.add(getItemCadastroAluno());
			menuCadastrar.add(getItemCadastroProfessor());
		}	
		return menuCadastrar;
	}
	public JMenu getMenuConsultar(){
		if(menuConsultar == null) {
			menuConsultar = new JMenu();
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
			itemCadastroProfessor.setText("Proferssor");
		}	
		return itemCadastroProfessor;
	}
	
	
}
