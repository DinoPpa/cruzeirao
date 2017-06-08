package cruzeirao.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.*;

import org.primefaces.event.RowEditEvent;

import cruzeirao.dao.EnderecoDao;
import cruzeirao.model.Endereco;
import cruzeirao.model.Local;
import cruzeirao.service.LocalService;

@ManagedBean
@SessionScoped
public class LocalManagedBean {
	private Local local =new Local();
	private LocalService service =new  LocalService();
	private EnderecoDao endDao =new EnderecoDao();
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local Local) {
		this.local = Local;
	}
	
	public void salvar(){
		service.salvar(local);
		local = new Local();
	}
	
	public void remover(Local local){
		//service.excluir(local.getId());
	}

	public void onRowEdit(RowEditEvent event) {
		Local c = ((Local) event.getObject());
		service.salvar(c);
	}
	
	public List<Local> getLocais(){
		return new ArrayList<Local>(); //return service.listar();
	}
	
	public List<Endereco> getEnderecos(){
		return endDao.getAll();
	}
}

