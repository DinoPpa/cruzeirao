package cruzeirao.model;

import javax.persistence.*;

@Entity
public class Juiz implements EntityModel
{	@Override public long getId() {
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

@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@OneToOne
	private Usuario usuario;
}
