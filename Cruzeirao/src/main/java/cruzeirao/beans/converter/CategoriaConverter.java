package cruzeirao.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import cruzeirao.model.Categoria;
import cruzeirao.model.Local;
import cruzeirao.service.CategoriaService;
import cruzeirao.service.LocalService;

@FacesConverter("converterCategoria")
public class CategoriaConverter implements Converter {
	private CategoriaService service = new CategoriaService();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Categoria e : service.listar())
				 if(e.getNome().equals(value))
				  	return e;			
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null || value.equals("")) {
			return null;
		} else {
			return ((Categoria) value).getNome();
		}
	}
}
