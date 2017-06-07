package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Diretor  implements EntityModel{
	@Override public long getId() {
		return id;
	}
	@Override public void setId(long id){
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	private Usuario usuario;

	@OneToOne
	private Endereco endereco;
	
	@ManyToMany
	@JoinTable(name="diretor_equipe", joinColumns=
	{@JoinColumn(name="diretor_id")}, inverseJoinColumns=
  	{@JoinColumn(name="equipe_id")})
	private List<Equipe> equipes;
	
	private String telefoneFixo;
	private String telefoneMovel;
}
