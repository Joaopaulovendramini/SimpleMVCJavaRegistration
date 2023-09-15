package main;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {
	static BancoDados intancia;
	private List<ModelPerfil> listPerfils;

	public BancoDados() {
		this.listPerfils = new ArrayList<>();
	}

	public static BancoDados getInstancia() {
		if (intancia == null) {
			intancia = new BancoDados();
		}
		
		return intancia;

	}

	public List<ModelPerfil> getListPerfils() {
		return listPerfils;
	}

	public void setListPerfils(List<ModelPerfil> listPerfils) {
		this.listPerfils = listPerfils;
	}
	
	

}
