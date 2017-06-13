package cruzeirao.beans;

import java.util.List;

import javax.faces.bean.*;

import org.primefaces.event.RowEditEvent;

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
	
	public void excluir(Equipe equipe){
		service.excluir(equipe.getId());
	}
	
	public List<Equipe> getEquipes(){
		return service.listar();
	}
	
	public void onRowEdit(RowEditEvent event) {
		Equipe e = ((Equipe) event.getObject());
		service.salvar(e);
	}
}
