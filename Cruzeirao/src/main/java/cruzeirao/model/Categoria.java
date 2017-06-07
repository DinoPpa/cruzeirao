package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Categoria  implements EntityModel{
	
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
	public int getNascidosApartirDe() {
		return nascidosApartirDe;
	}
	public void setNascidosApartirDe(int nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public EnumTipoCategoria getSexo() {
		return sexo;
	}
	public void setSexo(EnumTipoCategoria sexo) {
		this.sexo = sexo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private int nascidosApartirDe;
	private int minJogadores;
	private int maxJogadores;
	private EnumTipoCategoria sexo;
}
