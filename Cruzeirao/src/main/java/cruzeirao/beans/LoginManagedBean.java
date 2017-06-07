package cruzeirao.beans;

import javax.faces.bean.*;

import cruzeirao.service.LoginService;

@ManagedBean
@SessionScoped
public class LoginManagedBean {
	private LoginService service =new LoginService();
	
	public boolean autenticar(String usuario, String senha){
		return service.autenticar(usuario, senha);
	}
}
