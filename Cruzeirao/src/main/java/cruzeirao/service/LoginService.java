package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.UsuarioDao;
import cruzeirao.model.*;

public class LoginService {
	private UsuarioDao usuarioDao=new UsuarioDao();
	
	public boolean autenticar(String usuario, String senha){
		return usuarioDao.getAll().stream().anyMatch(x -> x.getLogin().equals(usuario) && x.getSenha().equals(senha));
	}
}
