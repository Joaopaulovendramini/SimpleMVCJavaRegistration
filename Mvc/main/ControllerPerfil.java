package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import javax.swing.JOptionPane;

public class ControllerPerfil {
	private MainView view;
	private ServicePerfil service;

	public ControllerPerfil() {
		view = new MainView();
		service = new ServicePerfil();

		view.getbtnLogin().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(view, verPerfil());

			}
		});

		view.getbtnCadastro().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(view, cadastrar());
			}
		});

		view.setVisible(true);
	}

	public String verPerfil() {

		String nome = JOptionPane.showInputDialog(null, "Digite o nome de seu Login:");

		Optional<ModelPerfil> perfilOptional = service.verPerfil(nome);

		if (perfilOptional.isPresent()) {
			return "Bem vindo: ".concat(perfilOptional.get().getNome());
		} else {
			return "Perfil não encontrado para o nome informado.";
		}
	}

	public String cadastrar() {
		String nome;
		nome = JOptionPane.showInputDialog(null, "Digite o nome de seu Cadastro:");
		return service.cadastrar(nome, 21) ? "Cadastrado" : "Não Cadastrado, Esse nome já esta em uso";
	}

}
