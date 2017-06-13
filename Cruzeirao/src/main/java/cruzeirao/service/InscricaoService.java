package cruzeirao.service;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cruzeirao.dao.*;
import cruzeirao.model.*;

public class InscricaoService extends BaseService<InscricaoEquipe> {
	private CampeonatoDao campeonatoDao = new CampeonatoDao();
	private EquipeDao equipeDao = new EquipeDao();
	private UsuarioDao usuarioDao = new UsuarioDao();
	private DiretorDao diretorDao = new DiretorDao();
	
	public InscricaoService(){
		super(InscricaoEquipe.class);
	}
	
	public List<Campeonato> listarCampeonatos(){
		return campeonatoDao.getAll().stream().filter(x -> x.getInscricaoAtiva()).collect(Collectors.toList());
	}
	
	public List<Categoria> listarCategoriasPorCampeonato(long idCampeonato){
		return campeonatoDao.getById(idCampeonato).getCategorias();
	}
	
	public List<Equipe> listarEquipes(String diretor){
		return diretorDao.getAll().stream().filter(x -> x.getUsuario().getLogin() == diretor).findFirst().get().getEquipes(); 
	}
	
	public Usuario obterUsuarioPorCpf(String cpf){
		return usuarioDao.getAll().stream().filter((x) -> x.getCpf().equals(cpf)).collect(Collectors.toList()).iterator().next();
	}	
}
