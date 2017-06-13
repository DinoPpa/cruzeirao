package cruzeirao.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import cruzeirao.model.UsuarioInscricao;
import cruzeirao.model.Equipe;
import cruzeirao.model.InscricaoEquipe;
import cruzeirao.model.Local;
import cruzeirao.service.BaseService;
import cruzeirao.service.LocalService;

@FacesConverter("converterUsuarioInscricao")
public class UsuarioInscricaoConverter implements Converter {
	private BaseService<UsuarioInscricao> service = new BaseService<UsuarioInscricao>(UsuarioInscricao.class);

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(UsuarioInscricao e : service.listar())
				 if(e.getInscricao().getEquipe().getNome().equals(value))
				  	return e;			
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null || value.equals("")) {
			return null;
		} else {
			InscricaoEquipe ie = ((UsuarioInscricao) value).getInscricao();
			if(ie != null){
				Equipe e = ie.getEquipe();
				if(e != null)	
					return e.getNome();
			}
			
			return "";
		}
	}
}
