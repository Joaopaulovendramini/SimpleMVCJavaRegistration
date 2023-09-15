package main;

import java.util.Iterator;
import java.util.Optional;
import java.util.UUID;

public class ServicePerfil {
	static BancoDados bd = BancoDados.getInstancia();

	public static Optional<ModelPerfil> verPerfil(String nomePerfil) {
		for (ModelPerfil perfil : bd.getListPerfils()) {
			if (perfil.getNome().equals(nomePerfil)) {
				return Optional.of(perfil);

			} 
		}
 
		return Optional.empty();
	}

	public static Boolean cadastrar(String nome, int idade) {
		if (verPerfil(nome).isPresent()) {
			return false;
		}
		bd.getListPerfils().add(new ModelPerfil(nome, idade));
		return true;
	}
}
