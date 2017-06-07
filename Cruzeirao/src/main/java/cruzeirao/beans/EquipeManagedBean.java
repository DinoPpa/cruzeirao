package cruzeirao.beans;

import javax.faces.bean.*;

import cruzeirao.model.*;
import cruzeirao.service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeManagedBean {
	private Equipe equipe = new Equipe();
	private EquipeService service = new EquipeService();
	
	public void salvar(){
		service.salvar(equipe);
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
