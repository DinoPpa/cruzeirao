package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class InscricaoService {
	private List<Campeonato> campeonatos;
	private List<CategoriaCampeonato> categorias;
	private List<Equipe> equipes;
	private List<Usuario> usuarios;
	
	public List<Campeonato> listarCampeonatos(){
		//ListarCampeonatosComInscricaoAtivas
		return campeonatos;
	}
	
	public List<CategoriaCampeonato> listarCategoriasPorCampeonato(int idCampeonato){
		//Filtrar as categorias
		return categorias;
	}
	
	public List<Equipe> listarEquipes(){
		//Listar as Equipes que o usuário Dirige
		return equipes; 
	}
	
	public Usuario obterUsuarioPorCpf(String cpf){
		//retornar Usuario pelo CPF
		return usuarios.get(0);
	}
	
	public void salvar(InscricaoEquipe e){
		//Salvar
	}
	
	
}
