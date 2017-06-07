package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Fase  implements EntityModel{
	@Override
	public long getId() {
		return id;
	}

	@Override 
	public void setId(long id){
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public EnumTipoFase getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoFase tipo) {
		this.tipo = tipo;
	}

	public CategoriaCampeonato getCategoriaCampeonato() {
		return categoriaCampeonato;
	}

	public void setCategoriaCampeonato(CategoriaCampeonato categoriaCampeonato) {
		this.categoriaCampeonato = categoriaCampeonato;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Date dataInicio;
	private Date dataFim;
	
	private EnumTipoFase tipo;
	
	@ManyToOne
	private CategoriaCampeonato categoriaCampeonato;
	
	@OneToMany(mappedBy="fase")
	private List<Grupo> grupos;
}
