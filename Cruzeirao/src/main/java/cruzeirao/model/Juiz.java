package cruzeirao.model;

import javax.persistence.*;

@Entity
public class Juiz
{	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	private int id;

	@OneToOne
	private Usuario usuario;
}
