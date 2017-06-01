package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Usuario
{	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public EnumTipoUsuario getTipo() {
		return tipo;
	}
	public void setTipo(EnumTipoUsuario tipo) {
		this.tipo = tipo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String login;
	private String senha;
	
	private String email;
	private String nome;
	private String cpf;
	
	private EnumTipoUsuario tipo;
	private String foto;
}
