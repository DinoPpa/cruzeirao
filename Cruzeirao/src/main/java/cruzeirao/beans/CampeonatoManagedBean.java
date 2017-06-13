package cruzeirao.beans;

import java.util.*;

import javax.faces.bean.*;

import org.primefaces.event.RowEditEvent;

import cruzeirao.model.*;
import cruzeirao.service.*;
import sistema.modelos.Produto;

@ManagedBean
@SessionScoped
public class CampeonatoManagedBean {
	private Campeonato campeonato = new Campeonato();
	private CampeonatoService service = new CampeonatoService();
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public void salvar(){
		service.salvar(campeonato);
		campeonato = new Campeonato();	
	}
	
	public void excluir(Campeonato campeonato){
		service.excluir(campeonato.getId());
	}
	
	public List<Local> getLocais(){
		return service.listarLocais();
	}
	
	public List<Juiz> getJuizes(){
		return service.listarJuizes();
	}
	
	public List<Categoria> getCategorias(){
		return service.listarCategorias();
	}
	
	public void onRowEdit(RowEditEvent event) {
		Campeonato c = ((Campeonato) event.getObject());
		service.salvar(c);
	}
		
	public List<Campeonato> getCampeonatos(){
		return service.listar();
	}

}
