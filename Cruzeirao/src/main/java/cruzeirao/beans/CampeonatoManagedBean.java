package cruzeirao.beans;

import java.util.*;

import javax.faces.bean.*;
import javax.faces.model.DataModel;

import org.primefaces.event.RowEditEvent;

import cruzeirao.beans.datamodel.BaseDataModel;
import cruzeirao.model.*;
import cruzeirao.service.*;
import sistema.beans.datamodel.FornecedorDataModel;
import sistema.modelos.Fornecedor;
import sistema.modelos.Produto;

@ManagedBean
@SessionScoped
public class CampeonatoManagedBean {
	private Campeonato campeonato = new Campeonato();
	private CampeonatoService service = new CampeonatoService();
	private Campeonato campeonatoSelecionado;
	
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
		
	public DataModel<Campeonato> getCampeonatos(){

		return new BaseDataModel<Campeonato>(Campeonato.class, service.listar());
	}

	public Campeonato getCampeonatoSelecionado() {
		return campeonatoSelecionado;
	}

	public void setCampeonatoSelecionado(Campeonato campeonatoSelecionado) {
		this.campeonatoSelecionado = campeonatoSelecionado;
	}

}
