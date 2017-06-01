package cruzeirao.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Rodada {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy="rodada")
	private List<Partida> partidas;
	
	@ManyToOne
	private Grupo grupo;
}
