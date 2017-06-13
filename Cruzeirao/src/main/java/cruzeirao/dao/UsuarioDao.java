package cruzeirao.dao;

import java.util.List;

import cruzeirao.model.*;

public class UsuarioDao  extends DAOImpl<Usuario>{
	public UsuarioDao() {
		super(Usuario.class);
	}
	
	@SuppressWarnings("unchecked")
	public Usuario getByCpf(String cpf) {
		List<Usuario> ret = getEntityManager().createQuery("select * from " + Usuario.class.getSimpleName() + " where cpf = '" + cpf + "'").getResultList();
		
		closeEntityManager();
		
		return ret.stream().findFirst().get();
	}
}
