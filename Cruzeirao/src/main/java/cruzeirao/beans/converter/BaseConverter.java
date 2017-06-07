package cruzeirao.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import cruzeirao.model.EntityModel;
import cruzeirao.service.BaseService;

public class BaseConverter<T extends EntityModel> implements Converter  {
	private BaseService<T> service = new BaseService<T>();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(T e : service.listar())
				 if(String.valueOf(e.getId()).equals(value))
				  	return e;			
		}

		return null;

	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object e) {
		if (e == null || e.equals("")) {
			return null;
		} else {
			return String.valueOf(((T) e).getId());
		}
	}

}

