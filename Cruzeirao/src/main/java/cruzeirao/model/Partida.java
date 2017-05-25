package cruzeirao.model;

import java.util.*;

public class Partida {
	private Date dataHora;
	private Local local;
	
	private EquipeCategoriaCampeonato mandante;
	private EquipeCategoriaCampeonato visitante;

	private List<Juiz> juizes;

	private DadosPartida dados;

	
	private Partida proximaPartida;
}
