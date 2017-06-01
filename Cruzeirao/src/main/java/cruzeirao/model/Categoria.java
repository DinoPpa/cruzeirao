package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Categoria {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	private int nascidosApartirDe;
	private int minJogadores;
	private int maxJogadores;
	private EnumTipoCategoria sexo;
}
