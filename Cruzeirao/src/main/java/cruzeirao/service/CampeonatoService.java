package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.*;
import cruzeirao.model.*;

public class CampeonatoService extends BaseService<Campeonato> {
	private CategoriaDao categoriaDao = new CategoriaDao();
	private LocalDao localDao = new LocalDao();
	private JuizDao juizDao = new JuizDao();
	
	public CampeonatoService() {
		super(Campeonato.class);
	}	
	
	public List<Local> listarLocais(){
		return localDao.getAll();
	}
	
	public List<Juiz> listarJuizes(){
		return juizDao.getAll();
	}
	
	public List<Categoria> listarCategorias(){
		return categoriaDao.getAll();
	}
}
 