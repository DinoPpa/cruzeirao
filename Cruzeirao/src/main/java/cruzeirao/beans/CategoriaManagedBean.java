package cruzeirao.beans;

import javax.faces.bean.*;

import cruzeirao.model.*;
import cruzeirao.service.*;

@ManagedBean
@SessionScoped
public class CategoriaManagedBean {
	private Categoria categoria =new Categoria();
	private CategoriaService service= new CategoriaService();
	
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
}
