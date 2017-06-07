package cruzeirao.beans;

import java.util.List;

import javax.faces.bean.*;

import cruzeirao.model.*;
import cruzeirao.service.*;

@ManagedBean
@SessionScoped
public class InscricaoEquipeManagedBean {
	private InscricaoEquipe inscricaoEquipe = new InscricaoEquipe();
	private InscricaoService service = new InscricaoService();
	
	public void salvar(){
		service.salvar(inscricaoEquipe);
		inscricaoEquipe = new InscricaoEquipe();
	}
	
	public List<Equipe> listarEquipes(String usuario){
		return service.listarEquipes(usuario);
	}
	
	public Jogador obterJogadorPorCpf(String cpf){
		Usuario usu = service.obterUsuarioPorCpf(cpf);
		
		Jogador ret = new Jogador();
		ret.setUsuario(usu);
		
		return ret;
	}
	
	public ComissaoTecnica obterComissaoTecnicaPorCpf(String cpf){
		Usuario usu = service.obterUsuarioPorCpf(cpf);
		
		ComissaoTecnica ret = new ComissaoTecnica();
		ret.setUsuario(usu);
		
		return ret;
	}

	public InscricaoEquipe getInscricaoEquipe() {
		return inscricaoEquipe;
	}

	public void setInscricaoEquipe(InscricaoEquipe inscricaoEquipe) {
		this.inscricaoEquipe = inscricaoEquipe;
	}
}
