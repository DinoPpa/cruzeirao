package cruzeirao.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class UsuarioInscricao implements EntityModel
{	
	@Override public long getId() {
		return id;
	}
	@Override public void setId(long id){
		this.id = id;
	}
	public int getCodigoInscricao() {
		return codigoInscricao;
	}
	public void setCodigoInscricao(int codigoInscricao) {
		this.codigoInscricao = codigoInscricao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public EnumTipoParticipante getTipo() {
		return tipo;
	}
	public void setTipo(EnumTipoParticipante tipo) {
		this.tipo = tipo;
	}
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}
	public boolean isInscricaoValida() {
		return inscricaoValida;
	}
	public void setInscricaoValida(boolean inscricaoValida) {
		this.inscricaoValida = inscricaoValida;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private int codigoInscricao;
	
	@OneToOne
	private Usuario usuario;
	
	private String rg;
	private EnumTipoParticipante tipo;
	
	private boolean aceiteUsuario;
	private boolean inscricaoValida;

	@ManyToOne
	private InscricaoEquipe inscricao;

	public InscricaoEquipe getInscricao() {
		return inscricao;
	}
	public void setInscricao(InscricaoEquipe inscricao) {
		this.inscricao = inscricao;
	}

}