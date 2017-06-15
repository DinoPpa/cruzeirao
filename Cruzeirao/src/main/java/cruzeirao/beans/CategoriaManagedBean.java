package cruzeirao.beans;

import java.util.List;

import javax.faces.bean.*;

import org.primefaces.event.RowEditEvent;

import cruzeirao.model.*;
import cruzeirao.service.*;

@ManagedBean
@SessionScoped
public class CategoriaManagedBean {
	private Categoria categoria = new Categoria();
	private CategoriaService service= new CategoriaService();
	private Categoria categoriaSelecionado;
	
	public void salvar(){
		service.salvar(categoria);
		categoria=new Categoria();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void excluir(Categoria categoria){
		service.excluir(categoria.getId());
	}
	
	public List<Categoria> getCategorias(){
		return service.listar();		
	}

	public void onRowEdit(RowEditEvent event) {
		Categoria c = ((Categoria) event.getObject());
		service.salvar(c);
	}
	
	public EnumTipoCategoria[] getListaSexo(){
		return EnumTipoCategoria.values();
	}

	public Categoria getCategoriaSelecionado() {
		return categoriaSelecionado;
	}

	public void setCategoriaSelecionado(Categoria categoriaSelecionado) {
		this.categoriaSelecionado = categoriaSelecionado;
	}
}
