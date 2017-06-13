package cruzeirao.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import cruzeirao.model.Equipe;
import cruzeirao.service.EquipeService;

@FacesConverter("converterEquipe")
public class EquipeConverter implements Converter {
	private EquipeService service = new EquipeService();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Equipe e : service.listar())
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
			return ((Equipe) value).getNome();
		}
	}
}
