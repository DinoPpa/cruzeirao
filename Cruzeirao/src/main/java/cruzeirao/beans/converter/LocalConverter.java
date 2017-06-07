package cruzeirao.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import cruzeirao.model.Local;
import cruzeirao.service.LocalService;

@FacesConverter("converterLocal")
public class LocalConverter implements Converter {
	private LocalService service = new LocalService();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Local e : service.listar())
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
			return ((Local) value).getNome();
		}
	}
}
