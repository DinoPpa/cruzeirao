package cruzeirao.service;

import java.util.*;
import java.util.stream.Collectors;

import cruzeirao.dao.UsuarioInscricaoDao;
import cruzeirao.model.*;

public class UsuarioService extends BaseService<Usuario> {
	private UsuarioInscricaoDao usuarioInscricaoDao = new UsuarioInscricaoDao();
	
	public UsuarioService(){
		super(Usuario.class);
	}
	
	public List<UsuarioInscricao> listarInscricoes(String usuario){
		return usuarioInscricaoDao.getAll().stream().filter(x -> x.getUsuario().getLogin() == usuario).collect(Collectors.toList());
	}
	
	public void aceiteInscricao(long id){
		UsuarioInscricao inscricao = usuarioInscricaoDao.getAll().stream().filter(x -> x.getId() == id).findFirst().get();
		inscricao.setAceiteUsuario(true);
		
		usuarioInscricaoDao.save(inscricao);
	}
	
}
