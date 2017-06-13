package cruzeirao.service;

import java.util.*;

import cruzeirao.dao.*;
import cruzeirao.model.EntityModel;

public class BaseService<T extends EntityModel> {
	private DAOImpl<T> dao;
	
	public BaseService(Class<T> classe){
		dao = new DAOImpl<T>(classe);
	}
	
	public void salvar(T e){
		dao.save(e);
	}
	
	public List<T> listar(){
		return dao.getAll();
	}
	
	public T obter(long id){
		return dao.getById(id);
	}
	
	public void excluir(long id){
		T obj = obter(id);
		dao.remove(obj);
	}
}
