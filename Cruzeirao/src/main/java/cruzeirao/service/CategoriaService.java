package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class CategoriaService {
	private List<Categoria> categorias;
	
	public List<Categoria> listar(){
		return categorias;
	}
	
	public void salvar(Categoria e){
		categorias.add(e);
	}
}
