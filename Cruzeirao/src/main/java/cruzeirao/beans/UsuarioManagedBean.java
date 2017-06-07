package cruzeirao.beans;

import javax.faces.bean.*;

import cruzeirao.model.Usuario;
import cruzeirao.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {
	private Usuario usuario = new Usuario();
	private UsuarioService service = new UsuarioService();
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void salvar(){
		service.salvar(usuario);
		usuario = new Usuario();
	}
}
