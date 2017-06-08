package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.LocalDao;
import cruzeirao.model.*;

public class LocalService {// extends BaseService<Local> {
	private LocalDao dao = new LocalDao();
	
	public List<Local> listar(){
		return dao.getAll();
	}
	
	public void salvar(Local e){
		dao.save(e);
	}
}
