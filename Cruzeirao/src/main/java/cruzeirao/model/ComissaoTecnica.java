package cruzeirao.model;

import javax.persistence.*;

@Entity
public class ComissaoTecnica extends UsuarioInscricao {
	public ComissaoTecnica(){
		this.setTipo(EnumTipoParticipante.Auxiliar);
		this.setUsuario(new Usuario());
	}
	
	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	private String cref;
}
