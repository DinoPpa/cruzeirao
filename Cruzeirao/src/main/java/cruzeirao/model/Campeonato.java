package cruzeirao.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Campeonato {
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}

	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}

	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}

	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}

	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public List<Local> getLocais() {
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public List<CategoriaCampeonato> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaCampeonato> categorias) {
		this.categorias = categorias;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String nome;

	private Date dataInicioInscricao;
	private Date dataFimInscricao;
	private Date dataInicioCampeonato;
	private Date dataFimCampeonato;
	
	private double valorTaxa;
	
	@ManyToMany
	@JoinTable(name="campeonato_local", joinColumns=
	{@JoinColumn(name="campeonato_id")}, inverseJoinColumns=
  	{@JoinColumn(name="local_id")})
	private List<Local> locais;
	
	@ManyToMany
	@JoinTable(name="campeonato_local", joinColumns=
	{@JoinColumn(name="campeonato_id")}, inverseJoinColumns=
  	{@JoinColumn(name="juiz_id")})
	private List<Juiz> juizes;
	
	@OneToMany(mappedBy="campeonato")
	private List<CategoriaCampeonato> categorias;
}
