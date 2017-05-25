package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class CampeonatoService {
	private List<Campeonato> campeonatos;
	private List<Categoria> categorias;
	private List<Juiz> juizes;
	private List<Local> locais;
	
	public List<Local> listarLocais(){
		return locais;
	}
	
	public List<Juiz> listarJuizes(){
		return juizes;
	}
	
	public List<Categoria> listarCategorias(){
		return categorias;
	}
	
	public void salvar(Campeonato e){
		campeonatos.add(e);
	}
}
 