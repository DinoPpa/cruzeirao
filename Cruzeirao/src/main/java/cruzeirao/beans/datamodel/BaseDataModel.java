package cruzeirao.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import cruzeirao.model.EntityModel;
import cruzeirao.service.BaseService;

public class BaseDataModel<T extends EntityModel> extends ListDataModel<T> implements SelectableDataModel<T> 
{
	private BaseService<T> service;
		
	public BaseDataModel(Class<T> classe)
	{
		service = new BaseService<T>(classe);
	}

	public BaseDataModel(Class<T> classe, List<T> list)
	{
	   super(list);	
	   service = new BaseService<T>(classe);
	}
	
	@Override
	public T getRowData(String rowKey) {
		
		for(T e: service.listar())
		   if(Integer.parseInt(rowKey) ==  e.getId())
			   return e;
		
		return null;
	}

	@Override
	public Object getRowKey(T e) {
		return e.getId();
	}
}
