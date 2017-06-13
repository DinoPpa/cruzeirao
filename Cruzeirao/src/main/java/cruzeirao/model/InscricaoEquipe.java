package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

import org.eclipse.persistence.internal.jpa.metadata.structures.ArrayAccessor;

@Entity
public class InscricaoEquipe implements EntityModel {
	@Override public long getId() {
		return id;
	}
	@Override public void setId(long id){
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
	
	public void addInscrito(UsuarioInscricao inscrito) {
		if(inscritos == null){
			inscritos = new ArrayList<UsuarioInscricao>();
		}
		
		this.inscritos.add(inscrito);
	}
	public void removeInscrito(UsuarioInscricao inscrito){
		if(inscritos != null){
			this.inscritos.removeIf(x -> x.getRg() == inscrito.getRg());
		}
	}
	
	public String getCodigoInscricao() {
		return codigoInscricao;
	}
	public void setCodigoInscricao(String codigoInscricao) {
		this.codigoInscricao = codigoInscricao;
	}
	public boolean getPagamentoEfetuado() {
		return pagamentoEfetuado;
	}
	public void setPagamentoEfetuado(boolean pagamentoEfetuado) {
		this.pagamentoEfetuado = pagamentoEfetuado;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	private Equipe equipe;
	
	@ManyToOne
	private CategoriaCampeonato categoriaCampeonato;
	
	@OneToMany(mappedBy="inscricao")
	private List<UsuarioInscricao> inscritos;
	
	private String codigoInscricao;
	private boolean pagamentoEfetuado;
	public List<UsuarioInscricao> getInscritos() {
		return inscritos;
	}
	public void setInscritos(List<UsuarioInscricao> inscritos) {
		this.inscritos = inscritos;
	}
}
