package cruzeirao.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Local implements EntityModel, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	@OneToOne
	private Endereco endereco;
}
