package cruzeirao.service;

import java.util.*;
import cruzeirao.model.*;

public class LocalService {
	private List<Local> locais;
	
	public List<Local> listar(){
		return locais;
	}
	
	public void salvar(Local e){
		locais.add(e);
	}
}
