package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.*;
import cruzeirao.model.*;

public class CampeonatoService {
	private CampeonatoDao campeonatoDao = new CampeonatoDao();
	private CategoriaDao categoriaDao = new CategoriaDao();
	private LocalDao localDao = new LocalDao();
	private JuizDao juizDao = new JuizDao();
	
	public List<Local> listarLocais(){
		return localDao.getAll();
	}
	
	public List<Juiz> listarJuizes(){
		return juizDao.getAll();
	}
	
	public List<Categoria> listarCategorias(){
		return categoriaDao.getAll();
	}
	
	public void salvar(Campeonato e){
		campeonatoDao.save(e);
	}
}
 