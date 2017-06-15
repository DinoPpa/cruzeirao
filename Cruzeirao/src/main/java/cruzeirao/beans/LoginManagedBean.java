package cruzeirao.beans;

import java.io.IOException;

import javax.faces.application.FacesMessage;
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
	

	public String autenticar(){
		if(service.autenticar(login, senha)){
			FacesContext context = FacesContext.getCurrentInstance();
				
			context.getExternalContext().getSessionMap().put("user", login);
			
			return "inicio?faces-redirect=true";
		}
		else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou Senha incorretos.", "Login ou Senha incorretos."));
			return null;
		}
	}
}
