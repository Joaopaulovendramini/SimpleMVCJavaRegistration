package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JButton btncadastrar;
	private JButton btnlogin;

	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnlogin = new JButton("login");
		btnlogin.setBounds(88, 102, 89, 23);
		contentPane.add(btnlogin);
		
		 btncadastrar = new JButton("Cadastro");
		btncadastrar.setBounds(220, 102, 89, 23);
		contentPane.add(btncadastrar);
	}
	
	
	public JButton getbtnCadastro() {
		return this.btncadastrar;
	}
	
	public JButton getbtnLogin() {
		return this.btnlogin;
	}
}
