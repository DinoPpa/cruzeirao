package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class JuizService {
	private List<Juiz> juizes;
	private List<Usuario> usuarios;
	
	public List<Juiz> listarJuizes(){
		return juizes;
	}
	
	public Usuario obterUsuarioPorCpf(String cpf){
		//retornar usuario com CPF
		return usuarios.get(0);
	}
	
	public void salvar(Juiz e){
		juizes.add(e);
	}
}
