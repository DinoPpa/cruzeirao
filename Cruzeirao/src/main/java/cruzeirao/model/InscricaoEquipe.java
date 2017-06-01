package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class InscricaoEquipe {
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getCodigoInscricao() {
		return codigoInscricao;
	}
	public void setCodigoInscricao(String codigoInscricao) {
		this.codigoInscricao = codigoInscricao;
	}
	public boolean isPagamentoEfetuado() {
		return pagamentoEfetuado;
	}
	public void setPagamentoEfetuado(boolean pagamentoEfetuado) {
		this.pagamentoEfetuado = pagamentoEfetuado;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Equipe equipe;
	
	@ManyToOne
	private CategoriaCampeonato categoriaCampeonato;
	
	@ManyToMany
	@JoinTable(name="inscricao_jogador", joinColumns=
	{@JoinColumn(name="inscricao_id")}, inverseJoinColumns=
  	{@JoinColumn(name="jogador_id")})
	private List<Jogador> jogadores;
	
	@ManyToMany
	@JoinTable(name="inscricao_comissao", joinColumns=
	{@JoinColumn(name="inscricao_id")}, inverseJoinColumns=
  	{@JoinColumn(name="comissao_id")})
	private List<ComissaoTecnica> comissaoTecnica; 

	private String codigoInscricao;
	private boolean pagamentoEfetuado;
}
