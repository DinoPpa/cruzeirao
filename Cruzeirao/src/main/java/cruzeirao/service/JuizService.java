package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.*;
import cruzeirao.model.*;

public class JuizService extends BaseService<Juiz>{
	private UsuarioDao usuarioDao = new UsuarioDao();
	
	public Usuario obterUsuarioPorCpf(String cpf){
		return usuarioDao.getAll().stream().filter(x -> x.getCpf() == cpf).findFirst().get();
	}	
	
}
