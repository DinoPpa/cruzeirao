package cruzeirao.beans;

import javax.faces.bean.*;

import cruzeirao.model.Local;
import cruzeirao.service.LocalService;

@ManagedBean
@SessionScoped
public class LocalManagedBean {
	private Local Local =new Local();
	private LocalService service =new  LocalService();
	public Local getLocal() {
		return Local;
	}
	public void setLocal(Local Local) {
		this.Local = Local;
	}
	
	public void salvar(){
		service.salvar(Local);
		Local = new Local();
	}
	
	
}
