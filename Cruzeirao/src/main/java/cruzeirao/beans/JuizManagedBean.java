package cruzeirao.beans;

import javax.faces.bean.*;

import cruzeirao.model.Juiz;
import cruzeirao.service.JuizService;

@ManagedBean
@SessionScoped
public class JuizManagedBean {
	private Juiz juiz =new Juiz();
	private JuizService service =new  JuizService();
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	
	public void salvar(){
		service.salvar(juiz);
		juiz = new Juiz();
	}
	
	
}
