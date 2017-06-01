package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Partida {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public EquipeCategoriaCampeonato getMandante() {
		return mandante;
	}

	public void setMandante(EquipeCategoriaCampeonato mandante) {
		this.mandante = mandante;
	}

	public EquipeCategoriaCampeonato getVisitante() {
		return visitante;
	}

	public void setVisitante(EquipeCategoriaCampeonato visitante) {
		this.visitante = visitante;
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	public DadosPartida getDados() {
		return dados;
	}

	public void setDados(DadosPartida dados) {
		this.dados = dados;
	}

	public Partida getProximaPartida() {
		return proximaPartida;
	}

	public void setProximaPartida(Partida proximaPartida) {
		this.proximaPartida = proximaPartida;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Date dataHora;
	private Local local;
	
	@ManyToOne
	private EquipeCategoriaCampeonato mandante;
	
	@ManyToOne
	private EquipeCategoriaCampeonato visitante;

	@ManyToMany
	@JoinTable(name="partida_juiz", joinColumns=
	{@JoinColumn(name="partida_id")}, inverseJoinColumns=
  	{@JoinColumn(name="juiz_id")})
	private List<Juiz> juizes;

	@ManyToOne
	private Rodada rodada;
	
	@OneToOne
	private DadosPartida dados;

	private Partida proximaPartida;
}
