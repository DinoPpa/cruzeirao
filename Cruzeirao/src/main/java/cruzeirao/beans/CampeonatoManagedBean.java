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
	private Campeonato campeonatoSelecionado ;
	private Local localSelecionado;
	private Juiz juizSelecionado;
	private Categoria categoriaSelecionada;
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
	
	public List<Local> getLocaisCampeonato(){
		if(campeonatoSelecionado != null){
			return campeonatoSelecionado.getLocais();
		}
		return null;
		
	}
	
	public List<Juiz> getJuizesCampeonato(){
		
		if(campeonatoSelecionado != null){
			return campeonatoSelecionado.getJuizes();
		}
		return null;
		
	}
	public List<Categoria> getCategoriasCampeonato(){
		if(campeonatoSelecionado != null){
			return campeonatoSelecionado.getCategorias();
		}
		return null;
		
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
	
	public void adicionarLocal(){
		campeonatoSelecionado.addLocal(localSelecionado);
	}
	
	public void adicionarJuiz(){
		campeonatoSelecionado.addJuiz(juizSelecionado);
	}
	
	public void adicionarCategoria(){
		campeonatoSelecionado.addCategorias(categoriaSelecionada);
	}
	
	public Campeonato getCampeonatoSelecionado() {
		return campeonatoSelecionado;
	}

	public void setCampeonatoSelecionado(Campeonato campeonatoSelecionado) {
		this.campeonatoSelecionado = campeonatoSelecionado;
	}

	public Juiz getJuizSelecionado() {
		return juizSelecionado;
	}

	public void setJuizSelecionado(Juiz juizSelecionado) {
		this.juizSelecionado = juizSelecionado;
	}

	public Categoria getCategoriaSelecionada() {
		return categoriaSelecionada;
	}

	public void setCategoriaSelecionada(Categoria categoriaSelecionada) {
		this.categoriaSelecionada = categoriaSelecionada;
	}

	public Local getLocalSelecionado() {
		return localSelecionado;
	}

	public void setLocalSelecionado(Local localSelecionado) {
		this.localSelecionado = localSelecionado;
	}
	
	public List<Campeonato> getCampeonatos(){
		//return service.listar();
		return new ArrayList<Campeonato>();
	}

}
