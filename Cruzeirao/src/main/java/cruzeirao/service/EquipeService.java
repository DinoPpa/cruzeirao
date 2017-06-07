package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.*;
import cruzeirao.model.*;

public class EquipeService extends BaseService<Equipe>{
	private DiretorDao diretorDao = new DiretorDao();
	
	public List<Diretor> listarDiretores(){
		return diretorDao.getAll();
	}
}
