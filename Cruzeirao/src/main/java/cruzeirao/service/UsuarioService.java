package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class UsuarioService {
	
	private List<Usuario> usuarios;

	public UsuarioService(){
		usuarios = new ArrayList<Usuario>();
	}
	
	public void salvar(Usuario e){
		usuarios.add(e);
	}
	
	public List<Usuario> listar(){
		return usuarios;
	}
}
