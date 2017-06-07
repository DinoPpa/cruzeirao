package cruzeirao.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Grupo implements EntityModel {
	@Override public long getId() {
		return id;
	}

	@Override public void setId(long id){
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public List<Rodada> getRodadas() {
		return rodadas;
	}

	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}

	public List<EquipeCategoriaCampeonato> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<EquipeCategoriaCampeonato> equipes) {
		this.equipes = equipes;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private Fase fase;
	
	@OneToMany(mappedBy="grupo")
	private List<Rodada> rodadas;

	@OneToMany(mappedBy="grupo")
	private List<EquipeCategoriaCampeonato> equipes;
}
