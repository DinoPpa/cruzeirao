package cruzeirao.model;

import java.util.List;

import javax.persistence.*;


@Entity
public class EquipeCategoriaCampeonato implements EntityModel {
	@Override 
	public long getId() {
		return id;
	}

	@Override 
	public void setId(long id){
		this.id = id;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public CategoriaCampeonato getCategoriaCampeonato() {
		return categoriaCampeonato;
	}

	public void setCategoriaCampeonato(CategoriaCampeonato categoriaCampeonato) {
		this.categoriaCampeonato = categoriaCampeonato;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public List<ComissaoTecnica> getComissaoTecnica() {
		return comissaoTecnica;
	}

	public void setComissaoTecnica(List<ComissaoTecnica> comissaoTecnica) {
		this.comissaoTecnica = comissaoTecnica;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Equipe equipe;
	
	@ManyToOne
	private CategoriaCampeonato categoriaCampeonato;
	
	@ManyToOne
	private Grupo grupo;
	
	@ManyToMany
	@JoinTable(name="equipe_jogador", joinColumns=
	{@JoinColumn(name="equipe_id")}, inverseJoinColumns=
  	{@JoinColumn(name="jogador_id")})
	private List<Jogador> jogadores;
	
	@ManyToMany
	@JoinTable(name="equipe_comissao", joinColumns=
	{@JoinColumn(name="equipe_id")}, inverseJoinColumns=
  	{@JoinColumn(name="comissao_id")})
	private List<ComissaoTecnica> comissaoTecnica; 
	
	@ManyToMany
	@JoinTable(name="equipe_partida", joinColumns=
	{@JoinColumn(name="equipe_id")}, inverseJoinColumns=
  	{@JoinColumn(name="partida_id")})
	private List<Partida> partidas;
}
