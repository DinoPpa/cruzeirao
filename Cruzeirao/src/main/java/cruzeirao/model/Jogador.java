package cruzeirao.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Jogador extends UsuarioInscricao{
	
	public Jogador(){
		this.setTipo(EnumTipoParticipante.Jogador);
		this.setUsuario(new Usuario());
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public int getPartidasSuspenso() {
		return partidasSuspenso;
	}

	public void setPartidasSuspenso(int partidasSuspenso) {
		this.partidasSuspenso = partidasSuspenso;
	}

	public List<Gol> getGols() {
		return gols;
	}

	public void setGols(List<Gol> gols) {
		this.gols = gols;
	}

	public List<Falta> getFaltas() {
		return faltas;
	}

	public void setFaltas(List<Falta> faltas) {
		this.faltas = faltas;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	public List<Partida> getPartidasJogadas() {
		return partidasJogadas;
	}

	public void setPartidasJogadas(List<Partida> partidasJogadas) {
		this.partidasJogadas = partidasJogadas;
	}

	private Date dataNascimento;
	private int sexo;
	private int numeroCamisa;
	
	private int partidasSuspenso;
	
	@OneToMany(mappedBy="jogador")
	private List<Gol> gols;
	
	@OneToMany(mappedBy="jogador")
	private List<Falta> faltas;
	
	@OneToMany(mappedBy="jogador")
	private List<Cartao> cartoes;
	
	@ManyToMany
	@JoinTable(name="jogador_partida", joinColumns=
	{@JoinColumn(name="jogador_id")}, inverseJoinColumns=
  	{@JoinColumn(name="partida_id")})
	private List<Partida> partidasJogadas;
}