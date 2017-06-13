package cruzeirao.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import cruzeirao.model.Campeonato;
import cruzeirao.model.Local;
import cruzeirao.service.CampeonatoService;
import cruzeirao.service.LocalService;

@FacesConverter("converterCampeonato")
public class CampeonatoConverter implements Converter {
	private CampeonatoService service = new CampeonatoService();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Campeonato e : service.listar())
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
			return ((Campeonato) value).getNome();
		}
	}
}
