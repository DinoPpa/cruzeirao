package cruzeirao.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Campeonato implements EntityModel {
	@Override
	public long getId() {
		return id;
	}
	
	@Override
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getInscricaoAtiva() {
		return inscricaoAtiva;
	}

	public void setInscricaoAtiva(boolean inscricaoAtiva) {
		this.inscricaoAtiva = inscricaoAtiva;
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

	public void addLocal(Local local) {
		this.locais.add(local);
	}
	
	public void removeLocal(Local local){
		this.locais.remove(local);
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void addJuiz(Juiz juiz) {
		this.juizes.add(juiz);
	}
	
	public void removeJuiz(Juiz juiz){
		this.juizes.remove(juiz);
	}

	public List<Categoria> getCategorias() {
		List<Categoria> ret = new ArrayList<Categoria>();
		
		for(CategoriaCampeonato c : categorias){
			ret.add(c.getCategoria());
		}
		
		return ret;
	}

	public void addCategorias(Categoria categoria) {
		CategoriaCampeonato cate = new CategoriaCampeonato();
		
		cate.setCategoria(categoria);
		cate.setCampeonato(this);
		
		this.categorias.add(cate);
	}
	
	public void removeCategoria(Categoria categoria){
		CategoriaCampeonato remove = null;
		
		for(CategoriaCampeonato c : categorias){
			if(c.getCategoria().equals(c)){
				remove = c;
				break;
			}
		}
		
		if(remove != null){
			categorias.remove(remove);
		}
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;

	private boolean inscricaoAtiva;
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
