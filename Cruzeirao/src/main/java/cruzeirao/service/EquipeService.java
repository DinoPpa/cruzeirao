package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class EquipeService {
	private List<Equipe> equipes;
	
	private List<Equipe> listar(){
		//listar equipes que o usuário dirige;
		return equipes;
	}
	
	private void salvar(Equipe e){
		equipes.add(e);
	}
}
