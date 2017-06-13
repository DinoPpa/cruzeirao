package cruzeirao.beans;

import java.io.IOException;

import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import cruzeirao.service.LoginService;

@ManagedBean
@SessionScoped
public class LoginManagedBean {
	private LoginService service =new LoginService();
	private String login;
	private String senha;
	
	public String getLogin(){
		return login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public void autenticar(){
		if(service.autenticar(login, senha)){
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect("inicio.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
